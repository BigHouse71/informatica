package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Spazi extends Application{
	TextField cTesto=new TextField();
	TextField cSpazi=new TextField();
	Font font=new Font("Curier new",12);

	public void start(Stage finestra){
		Button bTrasforma=new Button("Trasforma");
		Label eTesto=new Label("testo");
		Label eSpazi=new Label("spazi");
		GridPane griglia=new GridPane();
		griglia.add(eTesto, 0, 0);
		griglia.add(cSpazi, 1, 1);
		griglia.add(cTesto, 1, 0);
		griglia.add(eSpazi, 0, 1);
		griglia.add(bTrasforma, 2, 0,1,2);

		bTrasforma.setOnAction(e-> trasforma());
		cTesto.setFont(font);
		cSpazi.setFont(font);
		Scene scena=new Scene(griglia);
		finestra.setScene(scena);
		finestra.show();
	}


	public void trasforma() {
		int posizione=0;
		char v[]= cTesto.getText().toCharArray();
		char frase[]=new char[20];
		for(int i=0;i<v.length ;i++) {
			frase[posizione]=v[i];
			posizione++;
			if(v[i]==' ') {
				
				frase[posizione]=' ';
				posizione++;
			}
				
			
		}
		String x=new String(frase);
		cSpazi.setText(x);
	}

	public static void main(String[] args) {

		launch(args);
	}
}
