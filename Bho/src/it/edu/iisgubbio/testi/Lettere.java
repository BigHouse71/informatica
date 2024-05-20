package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Lettere extends Application{
	GridPane griglia =new GridPane();
	TextField cFrase=new TextField();
	Label eFrase=new Label("Frase");
	Label eVocali=new Label("Vacali");
	Label ePrint=new Label();
	Button bVocali=new Button("Conta vocali");
	Button bCensura=new Button("censura ");
	
	
	public void start(Stage finestra) {
		griglia.add(eFrase, 0, 0);
		griglia.add(cFrase, 1, 0);
		griglia.add(bVocali, 1, 1);
		griglia.add(eVocali, 0, 2);
		griglia.add(ePrint, 1, 2);
		griglia.add(bCensura, 0, 3);
		Scene scena=new Scene (griglia);
		finestra.setScene(scena);
		finestra.show();
		bVocali.setOnAction(e-> calcola());
		bCensura.setOnAction(e-> censura());
	}
	public void censura() {
		int contatore=0;
		String parola=cFrase.getText().toLowerCase();
		char x[]=parola.toCharArray();
		for (int i=0;i<x.length;i++) {
			switch (x[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				x[i]='-';
			}
		}
		String fine=new String(x);
		ePrint.setText(fine);
	}
	
	public void calcola() {
		int contatore=0;
		String parola=cFrase.getText().toLowerCase();
		char x[]=parola.toCharArray();
		for (int i=0;i<x.length;i++) {
			switch (x[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				contatore+=1;
			

			}
		}
		ePrint.setText(" sono: "+contatore);
	}
	
	public static void main(String[] args) {

		launch(args);
	}
}
