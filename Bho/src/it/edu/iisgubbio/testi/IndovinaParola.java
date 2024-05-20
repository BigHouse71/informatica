package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class IndovinaParola extends Application {
	char frase[];
	Label eNome=new Label("nome");
	Label eLettera=new Label("lettera");
	Label ePrint=new Label();
	TextField cParola=new TextField();
	TextField cLettera=new TextField();
	char fraseOriginal[];
	String t="";
	Pane quadro=new Pane();
	Rectangle asta=new Rectangle();
	public void start(Stage finestra) {
		Button bVai=new Button("Vai");
		Button bProva =new Button ("prova");
		GridPane griglia =new GridPane();
		griglia.add(eNome, 0, 0);
		griglia.add(cParola, 1, 0);
		griglia.add(bVai, 2, 0);
		griglia.add(eLettera, 0, 1);
		griglia.add(cLettera, 1, 1);
		griglia.add(bProva, 2, 1);
		griglia.add(ePrint,1, 3);
		griglia.add(quadro, 0, 4,2,1);
		asta.setY(0);
		asta.setX(0);
		asta.setWidth(100);
		asta.setHeight(10);
		quadro.getChildren().add(asta);
		bVai.setOnAction(e-> vai());
		bProva.setOnAction(e-> prova());
		Scene scena =new Scene(griglia,300,400);
		finestra.setTitle("");
		finestra.setScene(scena);
		finestra.show();

	}
	public void vai() {
		ePrint.setText("");
		t=cParola.getText();
		frase=t.toCharArray();
		for(int i=1;i<frase.length-1;i++) {
			frase[i]='-';
		}
		String x =new String(frase);
		cParola.setText(x);

		fraseOriginal=t.toCharArray();
	}
	public void prova() {

		String parola=cLettera.getText();
		if(parola.length()>=2) {

			if(t.equals(parola)) {
				ePrint.setText("Hai vinto");
				cParola.setText(t);
			}else {
				ePrint.setText("parola sbagliata");
			}
		}else {
			char lettera=cLettera.getText().charAt(0);

			for(int i=0;i<fraseOriginal.length;i++) {
				if(fraseOriginal[i]==lettera) {
					frase[i]=lettera;
				}else {
					
				}
			}
			String x =new String(frase);
			cParola.setText(x);
		}
	}

	public static void main(String[] args) {

		launch(args);
	}
}




