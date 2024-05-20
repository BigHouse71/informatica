package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
public class Pallini extends Application{
	 

	public void start(Stage finestra) {
		Pane quadro=new Pane();
		for(int y=20;y<=100;y=y+20) {
			for(int x=20;x<=100;x=x+20) {
				Circle pallini=new Circle(7);
				pallini.setFill(Color.BLACK);
				pallini.setCenterX(x);
				pallini.setCenterY(y);
				quadro.getChildren().add(pallini);
			}
		}
		Scene scena = new Scene(quadro,200,200);
		finestra.setTitle("Quadro");
		finestra.setScene(scena);
		finestra.show();
	}
	public static void main(String[] args) {
		 
		launch(args);
	}
}
