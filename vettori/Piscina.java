package it.edu.iisgubbio.vettori;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Piscina extends Application {
	int tempi[];
	int pos;
	boolean tutti=true;
	GridPane griglia=new GridPane();
	Label eNumero=new Label("Numero Giocatori");
	Label eTempo=new Label("Tempo Giocatori");
	Label eCoach=new Label("tempo Coach");
	Label eRisultati = new Label();
	Label eElenchi=new Label("");
	TextField tNumero = new TextField();
	TextField tTempo = new TextField();
	TextField tCoach = new TextField();
	Button bRisultati=new Button("Risultati");
	Button bElenca=new Button("Elnca");
	public void start(Stage finestra) {
		griglia.add(eNumero, 0, 0);
		griglia.add(tNumero, 1, 0);
		griglia.add(eCoach, 0, 1);
		griglia.add(tCoach, 1, 1);
		griglia.add(eTempo, 0, 2);
		griglia.add(tTempo, 1, 2);
		griglia.add(bRisultati, 0,3);
		griglia.add(eRisultati, 1,3 );
		griglia.add(bElenca, 0, 4);
		griglia.add(eElenchi,1 , 4);
		bRisultati.setDisable(true);
		bElenca.setMaxWidth(100);
		bRisultati.setMaxWidth(100);
		Scene scena = new Scene(griglia);
		finestra.setTitle("piscina");
		finestra.setScene(scena);
		finestra.show();
		tTempo.setOnAction(e-> inserisciTempo() );
		tNumero.setOnAction(e-> alloca());
		bRisultati.setOnAction(e-> contaPessimi());
		bElenca.setOnAction(e-> elenca());

	}

	public void alloca() {
		tempi = new int[Integer.parseInt(tNumero.getText())];
		pos =0;
	}

	public void inserisciTempo() {
		if(pos==tempi.length-1) {
			bRisultati.setDisable(false);
		}
		if(pos < tempi.length) {
			tempi[pos++]=Integer.parseInt(tTempo.getText());
			tTempo.setText("");
		}


	}

	public void contaPessimi() {
		int indice, contatore;
		int coach = Integer.parseInt(tCoach.getText());
		for(contatore = indice = 0; indice < tempi.length; indice++) {
			if(tempi[indice]<coach) {
				contatore++;
			}
		}
		eRisultati.setText(""+contatore);
	}
	
	public void elenca() {
		String elenco="";
		int indice, contatore;
		for(contatore = indice = 0; indice < tempi.length; indice++) {
			contatore=+tempi[indice];
			if(elenco=="") {
				elenco+=contatore;
			}else {
			elenco+=","+contatore;
			}
		}
		eElenchi.setText(elenco);
	}
	
	public static void main(String[] args) {

		launch(args);
	}
}
