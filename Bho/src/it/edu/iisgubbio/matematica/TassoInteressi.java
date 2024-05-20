package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TassoInteressi extends Application {
	Label eSoldi=new Label("Num");
	GridPane griglia=new GridPane();
	TextField cSoldi=new TextField();
	Button bCalcola=new Button("Tabellina ");
	Label eTotale=new Label();
	Label eTasso=new Label("Tasso");
	TextField cTasso=new TextField();
	Label eAnno=new Label("ANNI");
	TextField cAnno=new TextField();
	public void start(Stage finestra) {
		griglia.add(eSoldi, 0, 0);
		griglia.add(cSoldi, 1, 0);
		griglia.add(eTasso, 0, 1);
		griglia.add(cTasso, 1, 1);
		griglia.add(eAnno, 0, 2);
		griglia.add(cAnno, 1, 2);
		griglia.add(bCalcola, 1, 3);
		griglia.add(eTotale, 0, 4);
		bCalcola.setMinWidth(200);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Tabellina");
		finestra.setScene(scena);
		finestra.show();
		
		bCalcola.setOnAction(e-> calcola());
	}

	public void calcola() {
		double soldi=Double.parseDouble(cSoldi.getText());
		double tasso=Double.parseDouble(cTasso.getText());
		int anno=Integer.parseInt(cAnno.getText());
		double interessi=0;
		for(int n=0;n<anno;n++) {
			interessi=((soldi*tasso)/100)+soldi;
			soldi=interessi;
		}
		eTotale.setText("Totale"+interessi);
	}
	
	
	
public static void main(String[] args) {
		
		launch(args);
	}
}
