package it.edu.iisgubbio.laboratorio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CasagrandeFabio extends Application{
	Label eN=new Label("N");
	Label eM=new Label("M");
	GridPane griglia=new GridPane();
	TextField cN =new TextField();
	TextField cM =new TextField();
	Button bIntervalli=new Button("Somma intervalli");
	Button bPrimi=new Button("Primi in intervalli");
	Button bFatto=new Button("Calcola fattoriali");
	Label eTotaleIntervalli=new Label();
	Label eRisultatoPrimi=new Label();
	Label eFattoriali=new Label();
	
	public void start(Stage finestra) {
		griglia.add(eN, 0, 0);
		griglia.add(cN, 1, 0);
		griglia.add(eM, 0, 1);
		griglia.add(cM, 1, 1);
		griglia.add(bIntervalli, 0, 2);
		griglia.add(eTotaleIntervalli, 1, 2);
		griglia.add(bPrimi, 0, 3);
		griglia.add(eRisultatoPrimi, 1, 3);
		griglia.add(bFatto, 0, 4);
		griglia.add(eFattoriali, 1, 4);
		
		Scene scena = new Scene(griglia);
		finestra.setTitle("Fabio Casagrande");
		finestra.setScene(scena);
		finestra.show();
		bIntervalli.setOnAction(e-> intervalli());
		bPrimi.setOnAction(e->primi());
		bFatto.setOnAction(e->fattoriali());
	}
	public void intervalli () {
		int m=Integer.parseInt(cM.getText());
		int n=Integer.parseInt(cN.getText());
		int grande,piccolo,totale=0;
		if(m>n) {
			grande=m;
			piccolo=n;
		}else {
			grande=n;
			piccolo=m;
		}
		for(int x=piccolo;x<=grande;x++) {	
			totale+=x;
		}
		eTotaleIntervalli.setText(""+totale);
		}
	public void primi(){
		int m=Integer.parseInt(cM.getText());
		int n=Integer.parseInt(cN.getText());
		int grande,piccolo,cPrimo=0;
	
		if(m>n) {
			grande=m;
			piccolo=n;
		}else {
			grande=n;
			piccolo=m;
		}
		for(int x=piccolo;x<=grande;x++) {	
			boolean primo=true;
			for(int c=2; c<x ;c++) {
				if(x%c==0) {
					primo=false;
				}
			}
			if(primo) {
				cPrimo+=1;
			}
		}	
		eRisultatoPrimi.setText(""+cPrimo);
	}
	
	public void fattoriali() {
		int m=Integer.parseInt(cM.getText());
		int n=Integer.parseInt(cN.getText());
		int formula,fattorialiN=1,fattoDif=1,difMN=n-m;
		for(int fatto=1;fatto<=n;fatto++) {
			fattorialiN*=fatto;
		}
		for(int fatto=1;fatto<=difMN;fatto++) {
			fattoDif*=fatto;
		}
		formula=fattorialiN/fattoDif;

		eFattoriali.setText(""+formula);
	}
	public static void main(String[] args) {
		
		launch(args);
	}
}
