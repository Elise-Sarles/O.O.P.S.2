import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

public class Exercie16_1 extends Application{
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Text text = new Text(100, 100, "JavaFX Programming");
		text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 20));
		BorderPane pane = new BorderPane();
		HBox paneForRadioButtons = new HBox(20);
		paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5)); 
		paneForRadioButtons.setStyle("-fx-border-width: 1px; -fx-border-color: black");
		paneForRadioButtons.setAlignment(Pos.CENTER);
		    
		RadioButton rbRed = new RadioButton("Red");
		RadioButton rbGreen = new RadioButton("Green");
		RadioButton rbBlue = new RadioButton("Blue");
		RadioButton rbBlack = new RadioButton("Black");
		RadioButton rbYellow = new RadioButton("Yellow");
		RadioButton rbOrange = new RadioButton("Orange");
		paneForRadioButtons.getChildren().addAll(rbRed, rbGreen, rbBlue, rbYellow, rbOrange, rbBlack);
		pane.setTop(paneForRadioButtons);

		ToggleGroup group = new ToggleGroup();
		rbRed.setToggleGroup(group);
		rbGreen.setToggleGroup(group);
		rbBlue.setToggleGroup(group);
		rbBlack.setToggleGroup(group);
		rbYellow.setToggleGroup(group);
		rbOrange.setToggleGroup(group);
		    
		rbRed.setOnAction(e -> {
			if (rbRed.isSelected()) {
				text.setFill(Color.RED);
			}
		});
		    
		rbGreen.setOnAction(e -> {
			if (rbGreen.isSelected()) {
				text.setFill(Color.GREEN);	
				}
		});

		rbBlue.setOnAction(e -> {
			if (rbBlue.isSelected()) {
				text.setFill(Color.BLUE);
			}
		});
		    
		rbBlack.setOnAction(e -> {
			if (rbBlack.isSelected()) {
				text.setFill(Color.BLACK);
			}
		});
		
		rbYellow.setOnAction(e -> {
			if (rbYellow.isSelected()) {
				text.setFill(Color.YELLOW);
			}
		});
		    
		rbOrange.setOnAction(e -> {
			if (rbOrange.isSelected()) {
				text.setFill(Color.ORANGE);
			}
		});
		HBox paneForButtons = new HBox(20);
		Button btLeft = new Button("<=");
		Button btRight = new Button("=>");
		paneForButtons.getChildren().addAll(btLeft, btRight);	
		paneForButtons.setAlignment(Pos.CENTER);
		paneForButtons.setStyle("-fx-border-width: 1px; -fx-border-color: black");
		pane.setBottom(paneForButtons);
		  
		btLeft.setOnAction(e -> text.setX(text.getX() - 10));
		btRight.setOnAction(e -> text.setX(text.getX() + 10));
		    
		Pane paneForText = new Pane();
		paneForText.getChildren().add(text);
		pane.setCenter(paneForText);
		  
		Scene scene = new Scene(pane, 450, 200);
		primaryStage.setTitle("Exercise16_1"); 
		primaryStage.setScene(scene); 
		primaryStage.show();
	   
	}
	  public static void main(String[] args) {
		    launch(args);
	  }

}
