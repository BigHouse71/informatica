package it.edu.iisgubbio.sconti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;

public class ScontoRadioButton extends Application {

	Label ePrezzo=new Label("Prezzo Panino");
	Label eNumero=new Label("numero Panino");
	Label eTotale=new Label();
	Button bTotale=new Button("Calcola Totale");
	TextField cPrezzo=new TextField();
	TextField cNumero=new TextField();
	GridPane griglia=new GridPane();
	ToggleGroup genere = new ToggleGroup();
	RadioButton bNessuno=new RadioButton("nessuno sconto");
	RadioButton b20 =new RadioButton("20%");
	RadioButton b10=new RadioButton("10%");
	public void start(Stage finestra) {
		griglia.add(ePrezzo, 0, 0);
		griglia.add(cPrezzo,1,0);
		griglia.add(eNumero, 0, 1);
		griglia.add(cNumero, 1, 1);
		griglia.add(bTotale, 0, 5,1,1);
		griglia.add(eTotale, 1, 5);
		griglia.add(b10, 0, 3);
		griglia.add(b20, 0, 4);
		griglia.add(bNessuno, 0, 2);
		bNessuno.setToggleGroup(genere);
		b20.setToggleGroup(genere);
		b10.setToggleGroup(genere);
		Scene scena = new Scene(griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/negozio/CssNewLook.css");
		finestra.setTitle("Sconto ");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    
	    bTotale.setOnAction(e -> sconto());
	}
	public void sconto() {
		double vNPan=Double.parseDouble(cNumero.getText());
		double vPPan=Double.parseDouble(cPrezzo.getText());
		double vTot=0,vASconto;
	     if(b10.isSelected()) {
	    	vASconto=((vNPan*vPPan)*10)/100;
	  		vTot=(vNPan*vPPan)-vASconto;
	      }else {
	    	 if(b20.isSelected()) {
	    		vASconto=((vNPan*vPPan)*20)/100;
	 	  		vTot=(vNPan*vPPan)-vASconto;
	    	 }else {
	    		 if(bNessuno.isSelected())
	 	  		vTot=(vNPan*vPPan);
	    	 }
	    	 
	      } 
		eTotale.setText("Prezzo="+ vTot);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
