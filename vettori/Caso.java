package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Caso extends Application {
	TextField cElementi = new TextField();
	TextField cMin = new TextField();
	TextField cMax = new TextField();
	Label eElementi=new Label("elementi");
	Label eMin=new Label("min");
	Label eMax=new Label("max");
	Label eRisposta=new Label();
	Label eSomma=new Label();
	Label e23=new Label();
	Label eProMin=new Label();
	Button b23=new Button("2 & 3");
	Button bMin=new Button("Minore");
	Label ePari=new Label();
	Button bSomma=new Button("genera");
	Button bGenera=new Button("genera");
	Button bStampa=new Button("stampa");
	Button bPari=new Button("pari");
	GridPane griglia=new GridPane();
	int vettore[];
	int pos;
	public void start (Stage finestra) {
		griglia.add(eElementi, 0, 0);
		griglia.add(cElementi, 1, 0);
		griglia.add(eMin, 0, 1);
		griglia.add(cMin, 1, 1);
		griglia.add(eMax, 0, 2);
		griglia.add(cMax, 1, 2);
		griglia.add(bGenera, 0, 3);
		griglia.add(bStampa, 1, 3);
		griglia.add(eRisposta, 0, 4);
		griglia.add(bPari, 0, 5);
		griglia.add(ePari, 1, 5);
		griglia.add(bSomma, 0, 7);
		griglia.add(eSomma, 1, 7);
		griglia.add(b23,0, 8);
		griglia.add(e23, 1, 8);
		griglia.add(bMin, 0, 9);
		griglia.add(eProMin, 1, 9);
		Scene scena =new Scene(griglia);
		finestra.setScene(scena);
		finestra.show();
		bStampa.setOnAction(e-> stampa());
		bGenera.setOnAction(e-> genera());
		bPari.setOnAction(e-> pari());
		bSomma.setOnAction(e-> somma());
		b23.setOnAction(e-> multipli());
		bMin.setOnAction(e->min());
	}
	
	public void min() {

		int nMin=vettore[0];
		for(int indice=1;indice<vettore.length;indice++) {
			if(vettore[indice]<nMin) {
				nMin=vettore[indice];
			}
		}
		eProMin.setText(""+nMin);
	}
	public void multipli() {
		int somma=0;
		for(int indice=0;indice<vettore.length;indice++) {
			if(vettore[indice]%2==0 && vettore[indice]%3==0) {
				somma=somma+vettore[indice];
			}
			e23.setText(""+somma);
		}
	}
	public void somma() {
		int somma=0;
		for(int indice=0;indice< vettore.length;indice++) {
			somma=somma+vettore[indice];
		}
		eSomma.setText(""+somma);
	}
	public void stampa() {
	
	String elenco="";
	int indice, contatore;
	for(contatore = indice = 0; indice < vettore.length; indice++) {
		contatore=+vettore[indice];
		if(elenco=="") {
			elenco+=contatore;
		}else {
		elenco+=","+contatore;
		}
	}
	eRisposta.setText(elenco);
	}
	
	public void genera() {
		vettore = new int[Integer.parseInt(cElementi.getText())];
		pos=0;
		int nMin=Integer.parseInt(cMin.getText());
		int nMax=Integer.parseInt(cMax.getText());
		int diff=nMax-nMin+1;
		for (int indice = 0;indice<vettore.length;indice++) {
		int nRandom= (int)(Math.random ()*diff+nMin);
			vettore[pos++]=nRandom;
			}
	}
	
	public void pari() {
		int contaPari=0;
		for(int indice=0;indice <vettore.length;indice++) {
			if(vettore[indice]%2==0) {
				contaPari++;
			}
		}
		ePari.setText(""+contaPari);;
	}
	public static void main(String[] args) {

		launch(args);
	}
}
