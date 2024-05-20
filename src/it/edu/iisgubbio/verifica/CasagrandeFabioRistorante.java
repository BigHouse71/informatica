package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
public class CasagrandeFabioRistorante  extends Application {
	 
	Label eNBurger=new Label("Numero hamburger:");
	Label ePBurger=new Label("Prezzo hamburger:");
	Label eNPatatine=new Label("Numero Patatine:");
	Label ePPatatine=new Label("Prezzo Patatine:");
	Label eTot=new Label("??");
	TextField cNBu=new TextField();
	TextField cPBu=new TextField();
	TextField cNPata=new TextField();
	TextField cPPata=new TextField();
	Label eTotale=new Label("Totale:");
	CheckBox chSale=new CheckBox("Sale+0.2€");
	CheckBox chSconto=new CheckBox("Sconto 10%");
	Button bCalcola=new Button("Calcola Prezzo");
	GridPane griglia=new GridPane();
	
	public void start(Stage finestra) {
		
		griglia.add(eNBurger, 0, 0);
		griglia.add(ePBurger, 1, 0);
		griglia.add(cNBu, 0, 1);
		griglia.add(cPBu, 1, 1);
		griglia.add(eNPatatine, 0, 2);
		griglia.add(ePPatatine, 1, 2);
		griglia.add(cNPata, 0, 3);
		griglia.add(cPPata, 1, 3);
		griglia.add(chSale, 0, 4);
		griglia.add(chSconto, 1, 4);
		griglia.add(bCalcola, 0, 5,2,1);
		griglia.add(eTotale, 0, 6);
		griglia.add(eTot, 1, 6);
		bCalcola.setMinWidth(300);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Paninoteca");
		finestra.setScene(scena);
		finestra.show();
		bCalcola.setOnAction(e-> prezzo());
		scena.getStylesheets().add("it/edu/iisgubbio/verifica/CasagrandeFabio.css");
		griglia.getStyleClass().add("grid-pane");
		eNBurger.setId("numeroburger");
		eNPatatine.setId("numeropate");
	}
	public void prezzo() {
		int nBur=Integer.parseInt(cNBu.getText());
		int pBur=Integer.parseInt(cPBu.getText());
		int nPata=Integer.parseInt(cNPata.getText());
		int pPata=Integer.parseInt(cPPata.getText());
		double totale;
		totale=(nBur*pBur)+(nPata*pPata);
		if(chSale.isSelected()) {
			totale+=0.2;
		}
		if(chSconto.isSelected()) {
			totale=totale-(totale*10)/100;
		}
		eTot.setText(""+totale);
	
	}
	
	
	public static void main(String[] args) {
		 
		launch(args);
	}

}
