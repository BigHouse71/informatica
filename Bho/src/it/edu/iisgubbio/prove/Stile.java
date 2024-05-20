package it.edu.iisgubbio.prove;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Stile extends Application{
	Label eBase=new Label("Base");
	Label eAltezza=new Label("Altezza");
	Label eArea=new Label("Area");
	Label ePerimetro=new Label("Perimetro");
	TextField cBase=new TextField();
	TextField cAltezza=new TextField();
	GridPane griglia=new GridPane();
	public void start(Stage finestra) {
		griglia.add(eBase, 0, 0);
		griglia.add(cBase, 1, 0);
		griglia.add(eAltezza, 0, 1);
		griglia.add(cAltezza, 1, 1);
		griglia.add(eArea, 0, 2);
		griglia.add(ePerimetro, 1, 2);
		ePerimetro.setId("perimetro");
		griglia.getStyleClass().add("grid-pane");
		Scene scena = new Scene(griglia);
		finestra.setTitle("CSS");
		scena.getStylesheets().add("it/edu/iisgubbio/prove/Stile.css");
		finestra.setScene(scena);
	    finestra.show();
	    cBase.setOnAction(e ->calcola());
	    cAltezza.setOnAction(e ->calcola());
	}
		public void calcola() {
			if(!cBase.getText().equals("")&& !cAltezza.getText().equals("")) {
				double base=Double.parseDouble(cBase.getText());
				double altezza=Double.parseDouble(cAltezza.getText());
				double perimetro=(base+altezza)*2;
				double area=base*altezza;
				eArea.setText("area="+area);
				ePerimetro.setText("Perimetro="+perimetro);
			}else {
				eArea.setText("Inserisci valore");
				ePerimetro.setText("inserisci valore");
			}

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
