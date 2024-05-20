package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

public class Bersaglio extends Application {
	Pane quadro =new Pane();
	public void start(Stage finestra) {
		
		Scene scena =new Scene(quadro,400,400);
		scena.addEventHandler(MouseEvent.MOUSE_CLICKED, e-> click(e) );
		finestra.setTitle("Besaglio");
		finestra.setScene(scena);
		finestra.show();
	}
	public void click(MouseEvent e) {
		if(e.getButton().equals(MouseButton.SECONDARY)) {
			Circle pallini =new Circle(7);
			pallini.setFill(Color.RED);
			pallini.setLayoutX(e.getX());
			pallini.setLayoutY(e.getY());
			quadro.getChildren().add(pallini);
		}
		if(e.getButton().equals(MouseButton.PRIMARY)){
			Circle pallini =new Circle(7);
			pallini.setLayoutX(e.getX());
			pallini.setLayoutY(e.getY());
			pallini.setFill(Color.GREEN);
			quadro.getChildren().add(pallini);
		}
	}
	public static void main(String[] args) {

		launch(args);
	}
}
