package it.edu.iisgubbio.grafica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
public class Triangolo extends Application{
	 Label eNum =new Label("Numero");
	 TextField cNum=new TextField();
	 Button bVai=new Button("Vai!");
	 GridPane griglia=new GridPane();
	 Pane quadro=new Pane();
	public void start(Stage finestra) {
		griglia.add(eNum, 0, 0);
		griglia.add(cNum, 1, 0);
		griglia.add(bVai, 2, 0);
		griglia.add(quadro, 0, 1,3,1);
		Scene scena = new Scene(griglia,200,200);
		finestra.setTitle("Quadro");
		finestra.setScene(scena);
		finestra.show();
		bVai.setOnAction(e -> vai());
	}
	
	public void vai() {
		quadro.getChildren().clear();
		int num=Integer.parseInt(cNum.getText());
		for(int y=20;1<=num;y=y+20,num--) {
			for( int c=1,x=20;c<=num;x=x+20,c++) {
				Circle pallini=new Circle(7);
				pallini.setFill(Color.BLACK);
				pallini.setCenterX(x);
				pallini.setCenterY(y);
				quadro.getChildren().add(pallini);

			}
		}
	}
	
	public static void main(String[] args) {
		 
		launch(args);
	}
}
