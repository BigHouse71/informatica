package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CasagrandeFabioLettere  extends Application {
	Label ePrint=new Label();
	TextField cFrase=new TextField();
	TextField cFrase2=new TextField();

	Button bControlla =new Button ("comuini");
	GridPane griglia =new GridPane();
	public void start(Stage finestra) {
		Label eFrase1=new Label("Frase1");
		Label eFrase2=new Label("Frase2");

		griglia.add(eFrase1, 0, 0);
		griglia.add(eFrase2, 0, 1);
		griglia.add(cFrase, 1, 0);
		griglia.add(cFrase2, 1, 1);
		griglia.add(bControlla,0, 2);
		griglia.add(ePrint, 0, 3);
		bControlla.setOnAction(e-> comuni());
		Scene scena =new Scene(griglia);
		finestra.setTitle("Inevrti e Mescola");
		finestra.setScene(scena);
		finestra.show();
	}
	public void comuni() {
		int posizione=0;
		int più;
		char frase[]=cFrase.getText().toCharArray();
		char frase2[]=cFrase2.getText().toCharArray();
		if(frase2.length>frase.length) {
			più=frase2.length;
		}else {
			più=frase.length;
		}
		char fusion []=new char[frase2.length+frase.length];
		for(int indice=1;indice<più;indice++) {			

			for(int i=0;i<frase.length;i++) {
				if(frase[indice-1]==frase[indice]){
					indice++;
				}else {
					if(frase[indice-1]==frase[i]) {
						fusion[posizione]=frase[i];
						posizione++;
					}
				}
			}
			for(int c=0;c<frase2.length;c++) {
				if(frase[indice-1]==frase2[c]) {
					fusion[posizione]=frase[indice-1];
					posizione++;

				}
			}



		}
		boolean trovato=false;
		for(int i=0;i<frase2.length;i++) {
			for(int c=0;c<fusion.length && !trovato ;c++) {
				if(frase2[i]==fusion[c]) {
					trovato=true;
				}else {
					trovato=false;
				}
			}
			if(trovato==false) {
				fusion[posizione]=frase2[i];
				posizione++;
			}
		}
		String x=new String(fusion);
		ePrint.setText(x);
	}


	public static void main(String[] args) {
		launch(args);
	}

}