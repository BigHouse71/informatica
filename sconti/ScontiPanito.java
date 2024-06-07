package it.edu.iisgubbio.sconti;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
public class ScontiPanito extends Application {

	Label ePrezzo=new Label("Prezzo Panino");
	Label eNumero=new Label("numero Panino");
	Label eSconto= new Label("Sconto");
	Label eTotale=new Label();
	Button bTotale=new Button("Calcola Totale");
	TextField cPrezzo=new TextField();
	TextField cSconto=new TextField();
	TextField cNumero=new TextField();
	GridPane griglia=new GridPane();
	CheckBox scontoPresente = new CheckBox("Applica sconto");
	public void start(Stage finestra) {
		griglia.add(ePrezzo, 0, 0);
		griglia.add(cPrezzo,1,0);
		griglia.add(eNumero, 0, 1);
		griglia.add(cNumero, 1, 1);
		griglia.add(eSconto, 0, 2);
		griglia.add(cSconto, 1, 2);
		griglia.add(bTotale, 0, 3,1,1);
		griglia.add(eTotale, 0, 4);
		griglia.add(scontoPresente,1,3);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Sconto ");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    
	    bTotale.setOnAction(e -> sconto());
	}
	public void sconto() {
		double vNPan=Double.parseDouble(cNumero.getText());
		double vPPan=Double.parseDouble(cPrezzo.getText());
		double vSconto=Double.parseDouble(cSconto.getText());
		double vTot,vASconto;
	     if(scontoPresente.isSelected()) {
	    	vASconto=((vNPan*vPPan)*vSconto)/100;
	  		vTot=(vNPan*vPPan)-vASconto;
	      }else {
	    	  vTot=(vNPan*vPPan);
	      }
		
		eTotale.setText("Sconto="+ vTot);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
