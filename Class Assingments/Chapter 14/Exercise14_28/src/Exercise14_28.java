import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Exercise14_28 extends Application {
	@Override // Override the start method in the Application class
	  public void start(Stage primaryStage) {
	    // Create a clock and a label
	    ClockPane clock = new ClockPane(((int)(Math.random()* 12)), (int)(Math.random()* 31),(int)(Math.random()* 60) );
	    String timeString = clock.getHour() + ":" + clock.getMinute() 
	      + ":" + clock.getSecond();
	    clock.setVsh(false);
	    Label time = new Label(timeString);

	  
	    BorderPane pane = new BorderPane();
	   
	    pane.setCenter(clock);
	    pane.setBottom(time);
	    BorderPane.setAlignment(time, Pos.TOP_CENTER);

	    
	    Scene scene = new Scene(pane, 250, 250);
	    primaryStage.setTitle("Exercise14-28");
	    primaryStage.setScene(scene); 
	    primaryStage.show(); 
	  }

	  public static void main(String[] args) {
	    launch(args);
	  }
}
