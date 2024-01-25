package it.edu.iisgubbio.extra;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.Scene;

public class PalliniRipetuti extends Application{
	Pane quadro=new Pane();
	Button bCopia=new Button("Copia");
	Circle pallini=new Circle(10);
	double posY1,posX1;
	
	public void start(Stage finestra) {
		quadro.setPrefSize(400, 400);
		pallini.setLayoutY(200);
		pallini.setLayoutX(200);
		quadro.getChildren().add(pallini);
		quadro.getChildren().add(bCopia);
		bCopia.setOnAction(e-> vai());
		Scene scena=new Scene (quadro);
		finestra.setScene(scena);
		finestra.show();
		}
	
	public void vai() {
		for(double  angolo=0;angolo<=360;angolo+=60) {
			posX1=(200+100*Math.cos((angolo*Math.PI)/180));
			posY1=(200+100*Math.sin((angolo*Math.PI)/180));
			Circle palliniCopia=new Circle(7);
			palliniCopia.setLayoutX(posX1);
			palliniCopia.setLayoutY(posY1);
			quadro.getChildren().add(palliniCopia);		
		}
	}
	public static void main(String[] args) {

		launch(args);
	}
	}
