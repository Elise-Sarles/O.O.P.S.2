import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;


public class Exercise14_15 extends Application {
	@Override 
	public void start(Stage primaryStage) {   
		
		StackPane pane = new StackPane();
	
		Polygon p = new Polygon();
		pane.getChildren().add(p);
		p.setFill(Color.RED);
		p.setStroke(Color.RED);
		p.setRotate(22.5);
		ObservableList<Double> list = p.getPoints();
		
		double width = 200, height = 200;
		double centerX = width / 2, centerY = height / 2;
		double radius = Math.min(width, height) * 0.4;
		
		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		int s = 8;
		// Add points to the polygon list
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}
		
		Text text = new Text("Stop");
		pane.getChildren().add(text);
		text.setFont(Font.font("Times new Roman", FontWeight.BOLD, 40));
		text.setFill(Color.WHITE);
		
		
		
		
		Scene scene = new Scene(pane, width, height);
		primaryStage.setTitle("Exercise14_15"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	

	public static void main(String[] args) {
		Application.launch(args);
	}
}