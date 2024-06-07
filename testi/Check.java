package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Check extends Application {
	Label ePrint=new Label();
	TextField cFrase=new TextField();
	Label eFrase=new Label("Frase");
	Button bControlla =new Button ("Controllo");
	GridPane griglia =new GridPane();
	public void start(Stage finestra) {
		griglia.add(eFrase, 0, 0);
		griglia.add(cFrase, 0, 1);
		griglia.add(bControlla,0, 2);
		griglia.add(ePrint, 0, 3);
		bControlla.setOnAction(e-> controllo());
		Scene scena =new Scene(griglia);
		finestra.setTitle("Inevrti e Mescola");
		finestra.setScene(scena);
		finestra.show();
	}
	public void controllo() {
		String str=cFrase.getText();
		char frase[]=str.toCharArray();
		String punto=" ";

		if(frase[0]>='a'&& frase[0]<='z') {
			frase[0]=(char)(frase[0]-32);
		}
		for(int i=1;i<frase.length;i++){

			if(frase[i]==' ' && frase[i-1]== '.') {
				if( frase[i+1]>='a'&& frase[i+1]<='z') {
					frase[i+1]=(char)(frase[i+1]-32);
				}
			}
		}
		String corretta=new String(frase);
		ePrint.setText(corretta);
	}



	public static void main(String[] args) {
		launch(args);
	}

}
