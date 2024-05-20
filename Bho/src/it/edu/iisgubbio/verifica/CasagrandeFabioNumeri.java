package it.edu.iisgubbio.verifica;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class CasagrandeFabioNumeri extends Application {
	Label eNP=new Label("primo numero:");
	Label eNS=new Label("Secondo numero");
	Label eRisultato=new Label("Risultato");
	TextField cNP=new TextField();
	TextField cNS=new TextField();
	GridPane griglia=new GridPane();
	Button bCalcolo=new Button ("Calcolo");
	
	
	public void start(Stage finestra) {
		griglia.add(eNP, 0, 0);
		griglia.add(cNP, 1, 0);
		griglia.add(eNS, 0, 1);
		griglia.add(cNS, 1, 1);
		griglia.add(bCalcolo, 0, 2);
		griglia.add(eRisultato, 1, 2);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Minimo Comune Multiplo");
		finestra.setScene(scena);
		finestra.show();
		bCalcolo.setOnAction(e-> calcolo());
		
	}
	
	public void calcolo() {
		int primoN=Integer.parseInt(cNP.getText());
		int secondoN=Integer.parseInt(cNS.getText());
		int risultato=0;
		boolean v=true;
		for(int n=2;v;n++) {
			if(primoN%n==0 && secondoN%n==0) {
				risultato=n;
				v=false;
			}
		}
		eRisultato.setText(""+risultato);
	}
	
	
	public static void main(String[] args) {
		 
		launch(args);
	}
	
}
