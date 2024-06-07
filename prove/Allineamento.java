package it.edu.iisgubbio.prove;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
public class Allineamento extends Application{
	
	Button bCiao= new Button();
	Button bA= new Button();
	Button bB=new Button();
	Button bColonne=new Button();
	GridPane Griglia=new GridPane();
	
	
	public void  start(Stage finestra) {
		bCiao.setText("Ciao");
		bA.setText("A");
		bB.setText("B");
		bColonne.setText("2 colonne");
		
		Griglia.setPadding(new Insets(10, 10, 10, 10));
		Griglia.setHgap(5); 
		Griglia.setVgap(5);
		Griglia.add(bA, 1, 1);
		Griglia.add(bB,2,1);
		Griglia.add(bCiao, 0, 0,1,2);
		Griglia.add(bColonne,1,0,2,1);
		bCiao.setMaxWidth(30000.0);
		bCiao.setMaxHeight(30000.0);
		Scene scena = new Scene(Griglia);
		finestra.setTitle("Span");
	    finestra.setScene(scena);
	    finestra.show();
	   

	}



public static void main(String[] args) {
	
	launch(args);
}
}