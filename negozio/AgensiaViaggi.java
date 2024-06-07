package it.edu.iisgubbio.negozio;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AgensiaViaggi extends Application {
	
	Label ePosti=new Label("Persona per autobus");
	Label ePartecipanti=new Label("Partecipanti");
	Label eCostoAutoBus=new Label("Costo AutoBus");
	Label eCostoBiglietto=new Label();
	Button bCalcola=new Button("Calcola Biglietto");
	TextField cPosti=new TextField();
	TextField cPersone=new TextField();
	TextField cCosto=new TextField();
	GridPane griglia=new GridPane();
	
	public void start(Stage finestra) {
		griglia.add(ePosti, 0, 0);
		griglia.add(cPosti, 1, 0);
		griglia.add(ePartecipanti, 0,1);
		griglia.add(cPersone, 1, 1);
		griglia.add(eCostoAutoBus, 0, 2);
		griglia.add(cCosto, 1, 2);
		griglia.add(bCalcola, 1, 3);
		griglia.add(eCostoBiglietto, 0, 4);
		bCalcola.setMinWidth(200);
		Scene scena = new Scene(griglia,400,500);
		finestra.setTitle("Agensi di viaggi");
		finestra.setScene(scena);
		finestra.show();
		bCalcola.setOnAction(e -> totale());
	}
	public void totale() {
		int persone=Integer.parseInt(cPersone.getText());
		int posti=Integer.parseInt(cPosti.getText());
		int costoAuto=Integer.parseInt(cCosto.getText());
		int autoBus;
		if(persone%posti==0) {
			autoBus=persone/posti;
		}else {
			autoBus=persone/posti+1;
		}
		double costo=costoAuto*autoBus;
		double costoBigletto=costo/persone;
		eCostoBiglietto.setText("costo bigliotto è di:"+costoBigletto+"€");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}

