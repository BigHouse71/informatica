package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
;

public class Anagramma  extends Application {
	Label eParola1=new Label("parola1");
	Label eParola2=new Label("parola2");
	TextField cParola1=new TextField();
	TextField cParola2=new TextField();
	Button bTest=new Button("test");
	Label ePrint=new Label();
	GridPane griglia=new GridPane();
	public void start(Stage finestra) {
		griglia.add(eParola1, 0, 0);
		griglia.add(cParola1, 1, 0);
		griglia.add(eParola2, 0, 1);
		griglia.add(cParola2, 1, 1);
		griglia.add(bTest, 0, 2);
		griglia.add(ePrint, 0,3,2,1);

		bTest.setOnAction(e-> anagramma());
		Scene scena =new Scene(griglia);
		finestra.setTitle("anagramma");
		finestra.setScene(scena);
		finestra.show();
	}
	public void anagramma() {
		int contaParola1=0;
		int contaParola2=0;
		boolean anagramma=true;
		char frase1[]=cParola1.getText().toCharArray();
		char frase2[]=cParola2.getText().toCharArray();
		if(frase1.length==frase2.length) {
			for(int c=0;frase1.length>c&&anagramma;c++,contaParola1=0,contaParola2=0) {

				for(int i1=0;frase1.length>i1;i1++) {
					if(frase1[c]==frase1[i1]) {
						contaParola1++;
					}
				}
				for(int i2=0;frase2.length>i2;i2++) {
					if(frase1[c]==frase2[i2]) {
						contaParola2++;
					}
				}
				if(contaParola1!=contaParola2) {
					anagramma=false;
				}

			}
			if(anagramma) {
				ePrint.setText(" è un anagramma");
			}else {
				ePrint.setText("Non è un anagramma");
			}
		}else {
			ePrint.setText("Non è un anagramma");
		}








	}


	public static void main(String[] args) {
		launch(args);

	}
}
