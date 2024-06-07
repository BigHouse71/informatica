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

	Label ePos=new Label();
	Label eRipetuti=new Label();
	Label eRisultato=new Label();
	TextField cNumeri=new TextField();
	TextField cTrovare=new TextField();
	public void start(Stage finestra) {
		GridPane griglia=new GridPane();
		Button bTrovare=new Button("Trovare ");
		Button bRipetuti=new Button("Ripetuti");
		Label eNumeri=new Label("Numeri");
		Button bPos=new Button ("Pos");

		Label eCercare=new Label("Numero Da cercare");
		griglia.add(eRisultato, 1, 3);
		griglia.add(cNumeri, 1, 0);
		griglia.add(eNumeri, 0, 0);
		griglia.add(eCercare, 0, 1);
		griglia.add(cTrovare, 1, 1);
		griglia.add(bTrovare, 0, 3);
		griglia.add(bRipetuti,0,4);
		griglia.add(eRipetuti,1, 4);
		griglia.add(ePos, 1, 5);
		griglia.add(bPos, 0, 5);
		bTrovare.setOnAction(e->ricerca());
		bRipetuti.setOnAction(e->ripetuti());
		bPos.setOnAction(e-> pos());
		Scene scena =new Scene(griglia);
		finestra.setTitle("somma su stringa");
		finestra.setScene(scena);
		finestra.show();
	}
	public void pos() {
		boolean trovato=false;
		int trovare=Integer.parseInt(cTrovare.getText());
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		int pos=0;
		for(int i=0;i<numeri.length && !trovato;i++) {
			if(numeri[i]==trovare) {
				pos=i;
				trovato=true;
			}
		}
		if(trovato) {
			ePos.setText("si trova nella posizione "+pos);
		}else {
			ePos.setText("non si trova ");
		}

	}
	public void ripetuti() {
		int conta=0;
		int corto[];
		boolean duplicati=false;
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for(int i=0;i<numeri.length  ;i++,duplicati=false) {
			for(int c=i+1;c<numeri.length && !duplicati;c++) {
				if(numeri[i]==numeri[c]) {
					duplicati=true;
				}
			}
			if(duplicati) {
				conta++;
			}
		}
		int pos=0;
		corto=new int[numeri.length-conta];
		for(int i=0;i<numeri.length  ;i++) {
			duplicati=false;
			
			for(int c=i+1;c<numeri.length && !duplicati;c++) {
				if(numeri[i]==numeri[c]) {
					duplicati=true;
				}
			}
			
			if(!duplicati) {
				corto[pos]=numeri[i];
				pos++;
			}
		}
		String print ="";
		for(int i=0;i<corto.length;i++) {
			print+=" "+corto[i];
		}
		eRipetuti.setText(""+print);
	}

	public void ricerca() {
		int cercare=Integer.parseInt(cTrovare.getText());
		boolean trovato=false;
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}

		for(int i=0;i<numeri.length && !trovato;i++) {
			if(numeri[i]==cercare) {
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