package it.edu.iisgubbio.negozio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
public class Kebab extends Application{
	GridPane griglia=new GridPane();
	CheckBox checkCarne = new CheckBox("Carne 4€");
	CheckBox checkFormaggio=new CheckBox("Formagio 1€");
	CheckBox checkPomodoro=new CheckBox("Pomodoro 1€");
	CheckBox checkSalsa=new CheckBox("Salsa 0.50€");
	CheckBox checkCipolla=new CheckBox("cipolla 0.50€");
	Button bTotale=new Button("Totale");
	Label eTotale=new Label();
	Slider cursore=new Slider(1,10,1);

	public void start(Stage finestra) {
		griglia.add(cursore, 0, 0);
		griglia.add(checkCarne, 0, 1);
		griglia.add(checkFormaggio, 0,2);
		griglia.add(checkPomodoro, 0, 3);
		griglia.add(checkSalsa, 0, 4);
		griglia.add(checkCipolla, 0, 5);
		griglia.add(bTotale, 0, 6);
		griglia.add(eTotale, 1, 6);
		cursore.setShowTickMarks(true);
		cursore.setMajorTickUnit(1);
		cursore.setMinorTickCount(0);
		cursore.setSnapToTicks(true);
		cursore.setShowTickLabels(true);
		cursore.setSnapToTicks(true);
		
		Scene scena = new Scene(griglia,400,500);
		finestra.setTitle("Kebab");
	    finestra.setScene(scena);
	    finestra.show();
	    griglia.setPadding(new Insets(10, 10, 10, 10));
	    griglia.setHgap(20); 
	    griglia.setVgap(40);
	    bTotale.setOnAction(e -> totale());
	}
	
	public void totale() {
		double conto=0,totale;
		double val = cursore.getValue();
		if(checkCarne.isSelected()) {
			conto=conto+4;
		}
		if(checkPomodoro.isSelected()) {
			conto=conto+1;
		}
			
	
		if(checkFormaggio.isSelected()) {
			conto=conto+1;
		}
			

		if(checkSalsa.isSelected()) {
			conto=conto+0.50;
		}
			
		if(checkCipolla.isSelected()) {
			conto=conto+0.50;
		}
		totale=conto*val;
		if(val>1) {
			eTotale.setText("Il costo dei tuoi kebab è di "+totale+"€");
		}else {
			eTotale.setText("Il costo del kebab è di  "+totale+"€");
		}
	}
	
	
	
public static void main(String[] args) {
			
		launch(args);
	}
}


