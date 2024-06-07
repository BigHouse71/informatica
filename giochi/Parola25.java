package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Parola25 extends Application{


	Label label[][]=new Label[5][5];
	char g[][]=new char[5][5];

	TextField cInput=new TextField();
	GridPane griglia=new GridPane();

	public void start(Stage finestra) {
		griglia.setHgap(15);
		griglia.setVgap(15);
		griglia.setPadding(new Insets(10,10,10,10));
		Button bVerifica=new Button("Verifica");
		for(int colonna=0;colonna<5;colonna++) {
			for(int riga=0;riga<5;riga++) {
				char parola=(char)(Math.random()*('z'-'a')+'a');
				label[colonna][riga]=new Label(""+parola);
				label[colonna][riga].setPrefSize(25,25);
				g[colonna][riga]=parola;
				griglia.add(label[colonna][riga], colonna, riga);
			}
		}

		griglia.add(cInput,0,8,9,1);
		griglia.add(bVerifica,0,9,9,1);
		bVerifica.setOnAction(e->verifica());
		Scene scena =new Scene(griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/giochi/Parola25.css");

		finestra.setTitle("parola25");
		finestra.setScene(scena);
		finestra.show();
	}

	public void verifica() {
		boolean trovato=false;
		boolean mai=true;
		char v[]=cInput.getText().toCharArray();
		for(int i=0;i<v.length;i++,trovato=false) {
			if(!mai) {
				cInput.getStyleClass().add("errore");
				break;

			}
			for(int colonna=0;colonna<label.length &&!trovato;colonna++) {
				for(int riga=0; riga<label.length&& !trovato;riga++) {
					if(v[i]==g[colonna][riga]) {
						trovato=true;
						g[colonna][riga]='!';
						label[colonna][riga].getStyleClass().add("parola");
						mai=true;
					}else {
						mai=false;
					}

				}
			}
		}
	}



public static void main(String[] args) {

	launch(args);
}
}
