package it.edu.iisgubbio.extra;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.Scene;

public class PalliniRipetuti extends Application{
	Pane quadro=new Pane();
	Circle pallino=new Circle(7);
	Circle pallino1=new Circle(7);
	Circle pallino2=new Circle(7);
	Circle pallino3=new Circle(7);
	Circle pallino4=new Circle(7);
	Circle pallino5=new Circle(7);
	Circle pallino6=new Circle(7);
	int posX,posY,angolo=0;
	double x[]=new double[6];
	double y[]=new double[6];
	Timeline timer = new Timeline(new KeyFrame(Duration.millis(0.5), x -> timer()));
	public void start(Stage finestra) {
		pallino.setLayoutX(200);
		pallino.setLayoutY(200);

		pallino1.setLayoutX(200+100*Math.cos((60*Math.PI)/180));
		pallino1.setLayoutY(200+100*Math.sin((60*Math.PI)/180));
		
		pallino2.setLayoutX(200+100*Math.cos((120*Math.PI)/180));
		pallino2.setLayoutY(200+100*Math.sin((120*Math.PI)/180));
		
		pallino3.setLayoutX(200+100*Math.cos((180*Math.PI)/180));
		pallino3.setLayoutY(200+100*Math.sin((180*Math.PI)/180));
		
		pallino4.setLayoutX(200+100*Math.cos((240*Math.PI)/180));
		pallino4.setLayoutY(200+100*Math.sin((240*Math.PI)/180));
		
		pallino5.setLayoutX(200+100*Math.cos((300*Math.PI)/180));
		pallino5.setLayoutY(200+100*Math.sin((300*Math.PI)/180));
		
		pallino6.setLayoutX(200+100*Math.cos((360*Math.PI)/180));
		pallino6.setLayoutY(200+100*Math.sin((360*Math.PI)/180));
		
		x[0]= pallino1.getLayoutX();
		x[1]= pallino2.getLayoutX();
		x[2]= pallino3.getLayoutX();
		x[3]= pallino4.getLayoutX();
		x[4]= pallino5.getLayoutX();
		x[5]= pallino6.getLayoutX();
		
		y[0]=pallino1.getLayoutY();
		y[1]=pallino2.getLayoutY();
		y[2]=pallino3.getLayoutY();
		y[3]=pallino4.getLayoutY();
		y[4]=pallino5.getLayoutY();
		y[5]=pallino6.getLayoutY();
		
		quadro.getChildren().add(pallino);
		quadro.getChildren().add(pallino1);
		quadro.getChildren().add(pallino2);
		quadro.getChildren().add(pallino3);
		quadro.getChildren().add(pallino4);
		quadro.getChildren().add(pallino5);
		quadro.getChildren().add(pallino6);
		timer.setCycleCount(Animation.INDEFINITE);
		timer.play();
		Scene scena = new Scene(quadro,400,400);
		finestra.setScene(scena);
		finestra.show();
	}
	
	public void timer() {
		/*
		pallino1.setLayoutX(200+100*Math.cos((angolo*Math.PI)/180));
		pallino1.setLayoutY(200+100*Math.sin((angolo*Math.PI)/180));
		
		pallino2.setLayoutX(200+100*Math.cos(((angolo+60)*Math.PI)/180));
		pallino2.setLayoutY(200+100*Math.sin(((angolo+60)*Math.PI)/180));
		
		pallino3.setLayoutX(200+100*Math.cos(((angolo+120)*Math.PI)/180));
		pallino3.setLayoutY(200+100*Math.sin(((angolo+120)*Math.PI)/180));
		
		pallino4.setLayoutX(200+100*Math.cos(((angolo+180)*Math.PI)/180));
		pallino4.setLayoutY(200+100*Math.sin(((angolo+180)*Math.PI)/180));
		
		pallino5.setLayoutX(200+100*Math.cos(((angolo+240)*Math.PI)/180));
		pallino5.setLayoutY(200+100*Math.sin(((angolo+240)*Math.PI)/180));
		
		pallino6.setLayoutX(200+100*Math.cos(((angolo+300)*Math.PI)/180));
		pallino6.setLayoutY(200+100*Math.sin(((angolo+300)*Math.PI)/180));
		*/
		for(int i=0,bho = 0;i<x.length;i++,bho+=60) {
			x[i]=(200+100*Math.cos(((angolo+bho)*Math.PI)/180));
			
		}
		for(int i=0,bho = 0;i<y.length;i++,bho+=60) {
			y[i]=(200+100*Math.sin(((bho+angolo)*Math.PI)/180));
		}
		
		pallino1.setLayoutX(x[0]);
		pallino2.setLayoutX(x[1]);
		pallino3.setLayoutX(x[2]);
		pallino4.setLayoutX(x[3]);
		pallino5.setLayoutX(x[4]);
		pallino6.setLayoutX(x[5]);

		pallino1.setLayoutY(y[0]);
		pallino2.setLayoutY(y[1]);
		pallino3.setLayoutY(y[2]);
		pallino4.setLayoutY(y[3]);
		pallino5.setLayoutY(y[4]);
		pallino6.setLayoutY(y[5]);
		
		angolo++;
		
	}
	public static void main(String[] args) {
		launch(args);

	}
}
