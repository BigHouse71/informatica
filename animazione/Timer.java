package it.edu.iisgubbio.animazione;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration; 
import javafx.scene.control.Button;
public class Timer extends Application {  
	
	
	Label testo = new Label();
	Button bStart=new Button("Start");
	Button bPausa=new Button("Pausa");
	
	GridPane griglia = new GridPane();
	int n=100;
	Timeline timeline = new Timeline(new KeyFrame(
			  Duration.millis(16),
			      x -> aggiornaTimer()));
			    
  @Override
  public void start(Stage primaryStage) throws Exception {
	
	griglia.add(bPausa, 2, 0);
	griglia.add(bStart,0,0);
	griglia.add(testo,  1, 1);
	testo.setAlignment(Pos.CENTER);
	
	Scene scene = new Scene(griglia,800,500);
	scene.getStylesheets().add("it/edu/iisgubbio/animazione/Timer.css");
	griglia.getStyleClass().add("grid-pane");

	primaryStage.setTitle("Timer!"); 
	primaryStage.setScene(scene);
	primaryStage.show();
	bStart.setOnAction(e -> start());
	bPausa.setOnAction(e -> pausa());
	timeline.setCycleCount(Animation.INDEFINITE);
	  }

  public void start() {
	   timeline.play();
  }
  public void pausa() {
	  timeline.pause();
  }
		
	  private void aggiornaTimer() {
		  testo.setText(""+ (n--));
	  }
	    
	  public static void main(String args[]){
    launch();
  }
}
