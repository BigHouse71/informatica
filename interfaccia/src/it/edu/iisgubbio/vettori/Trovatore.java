package it.edu.iisgubbio.vettori;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Trovatore extends Application{

	
	Label eRipetuti=new Label();
	Label eRisultato=new Label();
	TextField cNumeri=new TextField();
	TextField cTrovare=new TextField();
	public void start(Stage finestra) {
		GridPane griglia=new GridPane();
		Button bTrovare=new Button("Trovare ");
		Button bRipetuti=new Button("Ripetuti");
		Label eNumeri=new Label("Numeri");
		
		Label eCercare=new Label("Numero Da cercare");
		griglia.add(eRisultato, 1, 3);
		griglia.add(cNumeri, 1, 0);
		griglia.add(eNumeri, 0, 0);
		griglia.add(eCercare, 0, 1);
		griglia.add(cTrovare, 1, 1);
		griglia.add(bTrovare, 0, 3);
		griglia.add(bRipetuti,0,4);
		griglia.add(eRipetuti,1, 4);
		bTrovare.setOnAction(e->verifica());
		bRipetuti.setOnAction(e->ripetuti());
		Scene scena =new Scene(griglia);
		finestra.setTitle("somma su stringa");
		finestra.setScene(scena);
		finestra.show();
	}
	public void ripetuti() {
		int infila=0;
		int numeroRipetuto = 0;
		int trovare=Integer.parseInt(cTrovare.getText());
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for(int i=1;i<numeri.length  ;i++) {
			if(numeri[i-1]==numeri[i]) {
				numeroRipetuto=numeri[i];
				infila+=2;
			}
		}
		eRipetuti.setText("il numero che si ripete è"+numeroRipetuto+" "+infila);
	}
	
	public void verifica() {
		int trovare=Integer.parseInt(cTrovare.getText());
		boolean trovato=false;
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for(int i=0;i<numeri.length && !trovato;i++) {
			if(numeri[i]==trovare) {
				trovato=true;	
			}
			if(trovato) {
				eRisultato.setText("Trovato");
			}else {
				eRisultato.setText("non Trovato");
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		launch(args);
	}
}