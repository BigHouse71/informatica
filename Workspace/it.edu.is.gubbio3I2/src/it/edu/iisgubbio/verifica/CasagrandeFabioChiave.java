package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CasagrandeFabioChiave extends Application{
	TextField cPassword=new TextField("");
	Label ePrint=new Label();
	public void start(Stage finestra) {
		GridPane griglia=new GridPane();
		Button bControllo=new Button("controllo");
		griglia.add(cPassword, 0, 0);
		griglia.add(ePrint, 0, 1);
		griglia.add(bControllo, 1, 0);
		bControllo.setOnAction(e-> controllo());
		Scene scena =new Scene(griglia);
		finestra.setTitle("anagramma");
		finestra.setScene(scena);
		finestra.show();
		
	}
	public void controllo() {
		boolean minus=false,maiusc=false,numero=false,speciale=false;
		char p[]=cPassword.getText().toCharArray();
		if(p.length>8) {
			for(int i=0;i<p.length;i++) {
				if(p[i]>='a'&& p[i]<='z') {
					minus=true;
				}else if(p[i]>='A'&& p[i]<='Z') {
					maiusc=true;
				}else if(p[i]>='1' && p[i]<='9') {
					numero=true;
				}else {
					speciale=true;
				}
				
			}
			if(numero && maiusc && minus && speciale) {
				ePrint.setText("Password convalidata");
			}else{
				ePrint.setText("la password deve avere maiuscole minuscole caratteri speciali e numeri");
			}	
		}else {
			ePrint.setText("password troppo corta");
		}
		

	}
		
	public static void main(String[] args) {
		launch(args);

	}
}


