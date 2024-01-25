package it.edu.iisgubbio.TPSIT;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AreaCerchio extends Application {
	
	Button bCalcola =new Button("Calcola");
	Label eRaggio =new Label("Raggio");
	TextField cRaggio= new TextField ();
	Label eArea=new Label();
	Label eCirconferenza=new Label();
	Label eCirconferenza2=new Label();
	GridPane griglia=new GridPane();
	Label eNome=new Label("Fabio");
	Label eCognome=new Label("Casagrande");
	Label eNomeL=new Label("Giacomo");
	Label eCognomeL=new Label("Lillacci");
	Label eNomeG=new Label("Giulia");
	Label eCognomeG=new Label("Moretti");
	public void start(Stage finestra) {
		griglia.add(eRaggio, 0, 0);
		griglia.add(cRaggio, 1, 0);
		griglia.add(bCalcola,0,1);
		griglia.add(eArea, 1,1 );
		griglia.add(eCirconferenza, 1, 2);
		griglia.add(eCirconferenza2, 2, 2);
		griglia.add(eNome, 0, 3);
		griglia.add(eCognome, 1, 3);
		griglia.add(eNomeL, 0, 4);
		griglia.add(eCognomeL, 1, 4);
		griglia.add(eNomeG, 0, 5);
		griglia.add(eCognomeG, 1, 5);
		Scene scena = new Scene(griglia,400,300);
		finestra.setTitle("Cerchio");
	    finestra.setScene(scena);
	    finestra.show();
	    bCalcola.setOnAction(e -> Calcola());

	}
	
	public void Calcola() {
		double raggio=Double.parseDouble(cRaggio.getText());
		double area=(raggio*raggio)*3.14;
		double circonferenza=(2*3.14*raggio-2);
		eArea.setText("Area="+area);
		eCirconferenza.setText("Circonferenza="+circonferenza);
		eCirconferenza2.setText("Circonferenza="+circonferenza);
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
