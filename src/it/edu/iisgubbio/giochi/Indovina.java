package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Indovina  extends Application{
	GridPane griglia=new GridPane();
	Label eRisposta=new Label();
	Label eNumero=new Label("Numero:");
	TextField casNumeri=new TextField();
	Button bProva=new Button("Prova");
	int nRandom=(int) (Math.random()*100)+1;
	Button bRegenera=new Button("regenera numero");
	public void start(Stage finestra) {
		griglia.add(eNumero, 0, 0);
		griglia.add(casNumeri, 1, 0);
		griglia.add(bProva, 0, 1,2,1);
		griglia.add(eRisposta, 0, 2,2,1);
		griglia.add(bRegenera, 0,3,2,1);
		eNumero.setAlignment(Pos.CENTER);
		bProva.setAlignment(Pos.CENTER);
		bRegenera.setAlignment(Pos.CENTER);
		bProva.setMinWidth(200);
		bRegenera.setMinWidth(200);
		bRegenera.setVisible(false);
		bProva.setOnAction(e -> prova ());
		bRegenera.setOnAction(e -> rigenera ());
		Scene scena = new Scene(griglia);
		finestra.setTitle("");
		finestra.setScene(scena);
		finestra.show();
	
	}
	
	public void prova() {
		int nPlay=Integer.parseInt(casNumeri.getText());
		if(nPlay==nRandom) {
			eRisposta.setText("Hai indovinato il numero era "+nRandom);	
			bRegenera.setVisible(true);
		}else if(nRandom-nPlay<0) {
			eRisposta.setText("Numero Troppo Grande");
			
		}else if(nRandom-nPlay>50) {
			eRisposta.setText("Numero Troppo piccolo");	
		}else if(nRandom-nPlay<50) {
			eRisposta.setText("Numero Troppo piccolo");	
		}
		
		
		
	}
	public void rigenera() {
		 nRandom=(int) (Math.random()*100)+1;
		bRegenera.setVisible(false);
	}
	
	
	
public static void main(String[] args) {
		
		launch(args);
	}
}
