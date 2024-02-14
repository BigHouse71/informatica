package it.edu.iisgubbio.extra;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.Scene;

public class PalliniRipetuti extends Application{
	Pane quadro=new Pane();
	double angolo=0;
	Circle pallino=new Circle(7);
	double x[]=new double[6];
	Circle pallini[]=new Circle[6];
	double y[]=new double[6];
	Timeline timer = new Timeline(new KeyFrame(Duration.millis(10), x -> timer()));
	public void start(Stage finestra) {
		pallino.setLayoutX(200);
		pallino.setLayoutY(200);
		for(int i=0;i<pallini.length;i++) {
			pallini[i]=new Circle(7);
			quadro.getChildren().add(pallini[i]);
		}
		
		quadro.getChildren().add(pallino);
		timer.setCycleCount(Animation.INDEFINITE);
		timer.play();
		Scene scena = new Scene(quadro,400,400);
		finestra.setScene(scena);
		finestra.show();
	}
	
	public void timer() {
		
		for(int i=0,bho = 0;i<x.length;i++,bho+=60) {
			x[i]=(200+100*Math.cos(((angolo+bho)*Math.PI)/180));
			
		}
		for(int i=0,bho = 0;i<y.length;i++,bho+=60) {
			y[i]=(200+100*Math.sin(((bho+angolo)*Math.PI)/180));
		}
		
		for(int i=0;i<pallini.length;i++) {
			pallini[i].setLayoutX(x[i]);
			pallini[i].setLayoutY(y[i]);
		}
		
		
		angolo++;
		
	}
	public static void main(String[] args) {
		launch(args);

	}
}
