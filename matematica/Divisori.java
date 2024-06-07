package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Divisori  extends Application{
	
	Label eNum=new Label("Num");
	GridPane griglia=new GridPane();
	TextField cNum =new TextField();
	Button bCalcola=new Button("Divisori ");
	Label eTotale=new Label();

	public void start(Stage finestra) {
		griglia.add(eNum, 0, 0);
		griglia.add(cNum, 1, 0);
		griglia.add(bCalcola, 1, 2);
		griglia.add(eTotale, 0, 3);
		bCalcola.setMinWidth(200);
		Scene scena = new Scene(griglia,500,300);
		finestra.setTitle("Tabellina");
		finestra.setScene(scena);
		finestra.show();
		bCalcola.setOnAction(e -> calcola());
	}
	public void calcola() {
		int num=Integer.parseInt(cNum.getText());
		String totale="";
		for(int n=2;n<num;n++)
			if(num%n==0) {
				if(totale.equals("")) {
					totale+=""+n;
				}else {
					totale+=", "+n;
				}
				
			}
		eTotale.setText(""+totale);
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
