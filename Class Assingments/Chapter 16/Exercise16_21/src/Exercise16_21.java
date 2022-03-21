import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.animation.KeyFrame;
import javafx.scene.input.KeyCode;
import javafx.scene.control.TextField;
import javafx.animation.Timeline;
import javafx.util.Duration;
import java.io.File;
import java.net.MalformedURLException;

public class Exercise16_21  extends Application{
	Timeline animation;
	TextField count = new TextField();
	File mf = new File("/Users/student/eclipse-workspace/Exercise16_21/src/song.mp3");
	
	@Override
	public void start(Stage primaryStage) throws MalformedURLException{
		Media media = new Media(mf.toURI().toURL().toString());
		MediaPlayer mediaplayer = new MediaPlayer(media);
		count.setAlignment(Pos.CENTER);
		count.setFont(Font.font(60));
		count.setPrefColumnCount(4);
		
		mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);
		
		StackPane pane = new StackPane(count);
		
		animation = new Timeline(
				new KeyFrame(Duration.millis(1000),e -> run(media,mediaplayer))); 
		animation.setCycleCount(Timeline.INDEFINITE);
		
		count.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				animation.play();
			}
		});
		
		Scene scene = new Scene(pane) ;
		primaryStage.setTitle("Exercise16_21");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	  public static void main(String[] args) {
		    launch(args);
		  }
	  void run(Media media,MediaPlayer mediaplayer) {
		  if(Integer.parseInt(count.getText()) > 0) {
			  mediaplayer.pause();
			  mediaplayer.seek(Duration.ZERO);
			  count.setText(String.valueOf(Integer.parseInt(count.getText()) - 1 ));
			  System.out.print("no");
		  }
		  
		 if(Integer.parseInt(count.getText()) == 0 ) {
			 animation.pause();
			 mediaplayer.play();
			System.out.print("yes");
		 }
	  }
}
