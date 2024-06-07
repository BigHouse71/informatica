package it.edu.iisgubbio.prove;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;

public class PrimaInterfaccia extends Application{
	Label eCopiaSx= new Label ();
	Label eCopiaDx= new Label();
	Label eUnione= new Label();
	Button pUnisci= new Button();
	Button pCopiaDx= new Button();
	Button pCopiaSx= new Button();
	Button pPulisci=new Button();
	TextField tAltoSx= new TextField();
	TextField tAltoDx= new TextField();
	GridPane Griglia= new GridPane();
	
	public void start(Stage finestra) {
	
		pCopiaDx.setText("Copia");
		pCopiaSx.setText("Copia");
		pUnisci.setText("Unisci");
		pPulisci.setText("Pulisci");
		
		Griglia.add(pCopiaDx,2,1);
		Griglia.add(pCopiaSx, 0, 1);
		Griglia.add(pPulisci, 1, 2);
		Griglia.add(pUnisci,1,0);
		Griglia.add(tAltoSx, 0, 0);
		Griglia.add(tAltoDx, 2, 0);
		Griglia.add(eCopiaDx, 2, 2);
		Griglia.add(eCopiaSx, 0, 2);
		Griglia.add(eUnione,1,1);
		
		pCopiaDx.setOnAction(e -> eseguiCD());
		pCopiaSx.setOnAction(e -> eseguiCS());
		pPulisci.setOnAction(e -> pulischi());
		pUnisci.setOnAction(e -> Union());
		
		Scene scena = new Scene(Griglia);
		finestra.setTitle("Prima Interfaccia");
	    finestra.setScene(scena);
	    finestra.show();
	
	    
	}
	    
	    
    public void eseguiCD() {
    	String utenteDX;
    	utenteDX= tAltoDx.getText();
    	eCopiaDx.setText(utenteDX);
    
    }
     public void eseguiCS() {
    	 String utenteSX;
    	 utenteSX= tAltoSx.getText();
    	 eCopiaSx.setText(utenteSX);
     }
    
     public void pulischi() {
    	eCopiaDx.setText("");
    	eCopiaSx.setText("");
    	eUnione.setText("");
    
     }
     
     public void Union() {
    	 String testoD;
    	 String testoS;
    	 testoD= tAltoDx.getText();
    	 testoS= tAltoSx.getText();
    	 eUnione.setText(testoS + testoD);
     }
     
     
	public static void main(String[] args) {
		
		launch(args);
	}
}