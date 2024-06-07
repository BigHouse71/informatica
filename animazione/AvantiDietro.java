package it.edu.iisgubbio.animazione;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AvantiDietro extends Application {
	int x=10;
	Button bVia=new Button("Via");
	GridPane griglia=new GridPane();
	Pane quadro=new Pane();
	Circle pallini =new Circle(10);
	Button bFerma=new Button ("ferma");
	Timeline timeline = new Timeline(new KeyFrame(
			  Duration.millis(5),
			      x -> aggiornaTimer()));
	Boolean avanti =true;
	public void start(Stage finestra) {
		griglia.add(quadro, 0, 0);
		pallini.setFill(Color.BLACK);
		pallini.setCenterX(x);
		pallini.setCenterY(10);
		quadro.getChildren().add(pallini);
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		Scene scena = new Scene(griglia,300,200);
		finestra.setTitle("Quadro");
		finestra.setScene(scena);
		finestra.show();
		
	}
	
	public void aggiornaTimer() {

		if(x==300) {
		avanti=false;
		}
		if(x==10) {
			avanti=true;
		}
		if(avanti) {
			pallini.setCenterX(x++);
		}else {
			pallini.setCenterX(x--);
		}
	}

	
	public static void main(String[] args) {
		 
		launch(args);
	}
}

