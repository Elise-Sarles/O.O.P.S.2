import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.FadeTransition;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;


public class Exercise15_A  extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		Rectangle rectangle = new Rectangle (0, 0, 25, 50);
		Color c = Color.web("rgba(100, 150, 255, 1.0)");
		rectangle.setFill(c);

		
		Polygon p = new Polygon();
		p.setFill(Color.WHITE);
		p.setStroke(Color.BLACK);
		ObservableList<Double> list = p.getPoints();
		
				double width = 200, height = 200;
				double centerX = width / 2, centerY = height / 2;
				double radius = Math.min(width, height) * 0.4;
		
				// s represents the number of sides of the shape
				// Make sure to update this number when necessary
				int s = 5;
				// Add points to the polygon list
				for (int i = 0; i < s; i++) {
					list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
					list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
				}

		
		 pane.getChildren().add(p);
		pane.getChildren().add(rectangle);

		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(6000));
		pt.setPath(p);
		pt.setNode(rectangle);
		pt.setOrientation(
		PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(false);
		pt.play(); 
		
		FadeTransition ft = new FadeTransition(Duration.millis(3000), rectangle);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		p.setOnMouseClicked(new EventHandler<MouseEvent>() {
	
			@Override
			public void handle(MouseEvent event) {
				MouseButton button = event.getButton();
				if(button == MouseButton.PRIMARY){
					pt.pause();
					ft.pause();
				}else if(button == MouseButton.SECONDARY){
					pt.play();
					ft.play();
				}
			}
		});
	
	
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("PathTransition");
		primaryStage.setScene(scene); 
		primaryStage.show(); 


	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}