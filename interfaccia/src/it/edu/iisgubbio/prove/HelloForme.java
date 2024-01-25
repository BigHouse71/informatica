package it.edu.iisgubbio.prove;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class HelloForme  extends Application{
	 
	public void start(Stage finestra) {
		Pane quadro = new Pane();
		Circle faccia = new Circle(100);
		Circle centro=new Circle(15);
		centro.setFill(Color.BLACK);
		centro.setCenterX(100);
		centro.setCenterY(100);
		faccia.setFill(Color.PINK);
		faccia.setCenterX(100);
		faccia.setCenterY(100);
		Circle occhioDX=new Circle(10);
		occhioDX.setCenterX(60);
		occhioDX.setCenterY(60);
		Circle occhioSX=new Circle(10);
		occhioSX.setFill(Color.BLACK);
		occhioSX.setCenterX(135);
		occhioSX.setCenterY(60);
		Line boccaDX=new Line(100,125,70,160);
		boccaDX.setStroke(Color.RED);
		boccaDX.setStrokeWidth(3);
		
		
		
		
		Scene scena = new Scene(quadro,200,200);
		finestra.setTitle("Quadro");
		finestra.setScene(scena);
		finestra.show();
		quadro.getChildren().add(faccia);
		quadro.getChildren().add(occhioDX);
		quadro.getChildren().add(centro);
		quadro.getChildren().add(occhioSX);
		quadro.getChildren().add(boccaDX);
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
