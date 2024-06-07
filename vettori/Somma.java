package it.edu.iisgubbio.vettori;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Somma extends Application{

	
	
	Label eRisultato=new Label();
	TextField cNumeri=new TextField();
	
	public void start(Stage finestra) {
		Button bSomma= new Button("somma");
		GridPane griglia=new GridPane();
		Button bVerifica=new Button("Verifica");
		griglia.add(bSomma, 0, 1);
		griglia.add(eRisultato, 0, 2);
		griglia.add(cNumeri, 0, 0);
		griglia.add(bVerifica, 0, 3);
		bSomma.setOnAction(e-> somma());
		bVerifica.setOnAction(e->verifica());
		Scene scena =new Scene(griglia);
		finestra.setTitle("somma su stringa");
		finestra.setScene(scena);
		finestra.show();
	}
	public void verifica() {

		int somma=0;
		boolean crescente =true ;
		boolean decrescente =true;
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for(int indice=0;indice<numeri.length-1 && decrescente ;indice++) {
			if(numeri[indice]>numeri[indice+1]) {
			}else {
				decrescente=false;
			}
		}
		for(int i=0;i<numeri.length-1 && crescente;i++) {
			if(numeri[i]<numeri[i+1]) {
			}else {
				crescente=false;
			}
		}
		if(crescente) {
			eRisultato.setText("è Crescente");
		}
		if(decrescente) {
			 eRisultato.setText("è decrescente");
		}
		if(!decrescente && !crescente) {
			eRisultato.setText("non è ne niente ");
		}
	}
	public void somma() {
		int somma=0;
		
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		for(int i=0;i<numeri.length;i++) {
			somma+=numeri[i];
		}
		int precedente =numeri[0];
		for(int i=1;i<numeri.length;i++) {
			if(precedente<numeri[i]) {
				eRisultato.setText("è cresciente");
			}else {
				eRisultato.setText("non è crescente");
			}
			
		}
		eRisultato.setText(""+somma);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		launch(args);
	}
}
