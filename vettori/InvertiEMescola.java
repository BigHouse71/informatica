package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class InvertiEMescola extends Application {

	
	Label eRisultato=new Label();
	TextField cNumeri=new TextField();
	
	public void start(Stage finestra) {
		Button bInverti=new Button("Inverti");
		Button bMescola =new Button ("Mescola");
		GridPane griglia =new GridPane();
		griglia.add(cNumeri, 0, 0,2,1);
		griglia.add(bInverti, 0, 1);
		griglia.add(bMescola, 1, 1);
		griglia.add(eRisultato, 0, 2);
		bInverti.setOnAction(e-> inverti());
		bMescola.setOnAction(e-> mescola());
		Scene scena =new Scene(griglia);
		finestra.setTitle("Inevrti e Mescola");
		finestra.setScene(scena);
		finestra.show();
	}
	public void mescola() {
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for(int i=0;i<numeri.length;i++) {
			int posRandom=(int)(Math.random()*numeri.length-1);
			int salva=numeri[posRandom];
			numeri[posRandom]=numeri[i];
			numeri[i]=salva;
		}
		String print ="";
		for(int i=0;i<numeri.length;i++) {
			print+=" "+numeri[i];
		}
		eRisultato.setText(print);
		
		
	}
	public void inverti() {
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int ultimo=parti.length-1;
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++,ultimo--) {
			numeri[i]=Integer.parseInt(parti[ultimo]);
		}
		String print ="";
		for(int i=0;i<numeri.length;i++) {
			print+=" "+numeri[i];
		}
		eRisultato.setText(print);
	}
	
	
	
	public static void main(String[] args) {

		launch(args);
	}
}
