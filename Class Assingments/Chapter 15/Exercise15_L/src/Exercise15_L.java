import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;


public class Exercise15_L extends Application {
	  @Override 
	  public void start(Stage primaryStage) { 
	    Circle c1 = new Circle();
	    c1.setRadius(20);
	    c1.setFill(Color.WHITE);
	    c1.setStroke(Color.BLACK);
	    c1.setCenterX(100);
	    c1.setCenterY(100);
	    Pane pane = new Pane(c1);
	    
	    
	    Button btUp = new Button("Up");
	    Button btDown = new Button("Down");
	    Button btLeft = new Button("Left");
	    Button btRight = new Button("Right");
	    HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
	    hBox.setSpacing(10);
	    hBox.setAlignment(Pos.CENTER);
	    
	    BorderPane borderPane = new BorderPane(pane);
	    borderPane.setBottom(hBox);
	    
	  
	    btUp.setOnAction(new EventHandler<ActionEvent>() {
	      @Override 
	      public void handle(ActionEvent e) {
	        c1.setCenterY(c1.getCenterY() > 20 ? c1.getCenterY() - 5 : 20);
	      }
	    });

	    btDown.setOnAction(new EventHandler<ActionEvent>() {
	      @Override 
	      public void handle(ActionEvent e) {
	        c1.setCenterY(c1.getCenterY() < pane.getHeight() ? 
	          c1.getCenterY() + 5 : pane.getHeight());
	      }
	    });
	    
	    btLeft.setOnAction(new EventHandler<ActionEvent>() {
	      @Override
	      public void handle(ActionEvent e) {
	        c1.setCenterX(c1.getCenterX() > 20 ? c1.getCenterX() - 5 : 20);
	      }
	    });
	    
	    btRight.setOnAction(new EventHandler<ActionEvent>() {
	      @Override
	      public void handle(ActionEvent e) {
	        c1.setCenterX(c1.getCenterX() < pane.getWidth() - 100?
	          c1.getCenterX() + 5 : pane.getWidth() - 100);
	      }
	    });

	    Scene scene = new Scene(borderPane, 400, 350);
	    primaryStage.setTitle("Exercise15_L"); 
	    primaryStage.setScene(scene); 
	    primaryStage.show(); 
	  }

	  public static void main(String[] args) {
		  Application.launch(args);
	  }
}