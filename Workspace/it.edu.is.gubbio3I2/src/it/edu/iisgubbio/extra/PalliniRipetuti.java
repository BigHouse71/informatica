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

	public static final int NUMERO_PALLINI = 8;
	double distanza=200,grandezza=7;
	boolean allontanati=true;
	Pane quadro=new Pane();
	double angolo=0;
	Circle pallino=new Circle(7);
	double x[]=new double[NUMERO_PALLINI];
	Circle pallini[]=new Circle[NUMERO_PALLINI];
	double y[]=new double[NUMERO_PALLINI];
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
		int gradi=360/pallini.length;
		for(int i=0,angolazione =0;i<x.length;i++,angolazione+=gradi) {
			x[i]=(200+distanza*Math.cos(((angolo+angolazione)*Math.PI)/180));

		}
		for(int i=0,angolazione = 0;i<y.length;i++,angolazione+=gradi) {
			y[i]=(200+distanza*Math.sin(((angolazione+angolo)*Math.PI)/180));
		}

		for(int i=0;i<pallini.length;i++) {
			pallini[i].setLayoutX(x[i]);
			pallini[i].setLayoutY(y[i]);
		}


		angolo++;

		if(distanza==0) {
			allontanati=true;
		}
		if(distanza==201) {
			allontanati=false;
		}
		if(allontanati) {
			distanza++;
			if(grandezza>=30) {

			}else {
				grandezza+=0.04;
				for(int i=0;i<pallini.length;i++) {
					pallini[i].setRadius(grandezza);
				}
			}

		}else {
			distanza--;
			if(grandezza>=7) {
				grandezza-=0.09;
				for(int i=0;i<pallini.length;i++) {
					pallini[i].setRadius(grandezza);
				}
			}

		}
	}
	public static void main(String[] args) {
		launch(args);

	}
}