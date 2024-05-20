package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class ScorriCaselle extends Application {
	TextField vText[]=new TextField[3];

	
	GridPane griglia=new GridPane();
	Button bInserisci=new Button("Inserisci");
	Button bInverso=new Button("Rimuovi");

	TextField cNumero=new TextField();

	public void start(Stage finestra) {
		
		
		for(int i=0;i<vText.length;i++) {
			vText[i]=new TextField();
			griglia.add(vText[i],0 ,i,2,1);
		}
		griglia.add(bInserisci, 0, vText.length);
		griglia.add(cNumero, 0, vText.length+1);
		griglia.add(bInverso, 1, vText.length);

		griglia.setVgap(10);
		griglia.setHgap(10);
		bInserisci.setOnAction(e->inserisci());
		bInverso.setOnAction(e->inverso());;

		Scene scena = new Scene(griglia);
		finestra.setScene(scena);
		finestra.show();
	}
	public void inverso() {
		
		for(int i=vText.length-1;i>1;i--) {
			cNumero.setText(vText[vText.length-1].getText());
			vText[i].setText(vText[i-1].getText());
			vText[1].setText(vText[0].getText());
		}
		vText[0].setText("");
		
	}
	
	public void inserisci() {
		
		for(int i=0;i<vText.length-1;i++) {
			vText[i].setText(vText[i+1].getText());
		
		}
		vText[vText.length-1].setText(cNumero.getText());
	}
	public static void main(String[] args) {
		launch(args);

	}
}
