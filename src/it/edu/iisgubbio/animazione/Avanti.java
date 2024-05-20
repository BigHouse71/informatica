package it.edu.iisgubbio.animazione;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Button;
public class Avanti extends Application {
	int x=10;
	Button bVia=new Button("Via");
	GridPane griglia=new GridPane();
	Pane quadro=new Pane();
	Circle pallini =new Circle(5);
	Button bFerma=new Button ("ferma");
	Timeline timeline = new Timeline(new KeyFrame(
			  Duration.millis(5),
			      x -> aggiornaTimer()));
	public void start(Stage finestra) {
		griglia.add(bVia, 0, 0);
		griglia.add(bFerma, 1, 0);
		griglia.add(quadro, 0, 1);
		pallini.setFill(Color.BLACK);
		pallini.setCenterX(x);
		pallini.setCenterY(10);
		quadro.getChildren().add(pallini);
		timeline.setCycleCount(Animation.INDEFINITE);
		bVia.setOnAction(e -> via());
		bFerma.setOnAction(e -> ferma());
		Scene scena = new Scene(griglia,200,200);
		finestra.setTitle("Quadro");
		finestra.setScene(scena);
		finestra.show();
		
	}
	
	public void aggiornaTimer() {
		 pallini.setCenterX(x++);
		 if(x==200) {
			 x=10;
		 }
	}
	
	public void via() {
		timeline.play();
	}
	public void ferma() {
		timeline.stop();
	}
	
	public static void main(String[] args) {
		 
		launch(args);
	}
}
