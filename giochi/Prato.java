package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Prato extends Application{
	boolean clik[][]=new boolean[8][8];

	boolean fiori[][]=new boolean[8][8];
	int fiorellini=0;
	GridPane griglia=new GridPane();
	Button burro[][]=new Button[8][8];
	public void start(Stage finestra){
		for(int colonna=0;colonna<8;colonna++) {
			for(int riga=0;riga<8;riga++) {

				Button p=new Button();
				p.setPrefWidth(25);
				p.setOnAction(e->trasforma(e));
				griglia.add(p, colonna, riga);
				burro[colonna][riga]=p;
				// double nR=Math.random();

				/*if(nR>0.5&& fiorellini<=20) {
					fiori[colonna][riga]=true;
					fiorellini++;
					p.getStyleClass().add("bomba");

				}else {
					fiori[colonna][riga]=false;
					p.getStyleClass().add("prato");

				}
				 */
			}
		}
		for(int colonna=0;colonna<8;colonna++) {
			for(int riga=0;riga<8;riga++) {
				if(fiorellini<20) {
					fiori[colonna][riga]=true;
					clik[colonna][riga]=false;

					fiorellini++;

				}else {
					fiori[colonna][riga]=false;
					clik[colonna][riga]=false;


				}
			}
		}
		for(int i=0;i<=2;i++) {
			for(int riga=0;riga<fiori.length;riga++) {
				for(int colonna=0;colonna<fiori.length;colonna++){
					int colRandom=(int)(Math.random()*fiori.length-1);
					int rigRandom=(int)(Math.random()*fiori.length-1);
					boolean salva=fiori[rigRandom][colRandom];
					fiori[rigRandom][colRandom]=fiori[riga][colonna];
					fiori[riga][colonna]=salva;
				}
			}
		}

		for(int colonna=0;colonna<fiori.length;colonna++) {
			for(int riga=0;riga<fiori.length;riga++){
				if(fiori[colonna][riga]==true) {
					burro[colonna][riga].getStyleClass().add("bomba");

				}else {
					burro[colonna][riga].getStyleClass().add("prato");

				}
			}
		}

		Scene scena=new Scene(griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/giochi/Prato.css");
		finestra.setScene(scena);
		finestra.show();
	}


	public void trasforma(Event e) {
		int bombe=0;
		System.out.print(fiori.length);

		Button a=(Button)(e.getSource());
		int colonna=griglia.getColumnIndex(a);
		int riga=griglia.getRowIndex(a);
		System.out.print(riga);
		clik[colonna][riga]=true;
		if(fiori[colonna][riga]) {
			a.setText("B");
		}else {
			//guardo quella sopra
			if(riga!=0 &&fiori[colonna][riga-1]) {
				bombe++;
			}

			//guardo quello sotto
			if(riga+1!=fiori.length &&fiori[colonna][riga+1]) {
				bombe++;
			}

			//guardo in alto a sinistra
			if(colonna!=0 && riga!=0 &&fiori[colonna-1][riga-1]) {
				bombe++;
			}

			//guardo in alto a destra

			if(colonna+1!=fiori.length&&riga!=0 &&fiori[colonna+1][riga-1]) {
				bombe++;
			}

			//guardo quello a sinistra 

			if(colonna!=0 &&fiori[colonna-1][riga]) {
				bombe++;
			}


			//guardo quello a destra
			if(colonna+1!=fiori.length && fiori[colonna+1][riga] ) {
				bombe++;
			}

			//guardo basso a destra
			if(riga+1!=fiori.length && colonna+1!=fiori.length&&fiori[colonna+1][riga+1]) {
				bombe++;
			}

			//guardo basso a sinistra
			if( colonna!=0 && riga+1!=fiori.length&&fiori[colonna-1][riga+1]) {
				bombe++;
			}
			if(bombe==0) {
				controlla(colonna,riga);
			}
			a.setText(""+bombe);

		}
	}
	int controlla (int col,int riga){
		int contabombe = 0;
		
		
		
		return contabombe ;
	}
	public static void main(String[] args) {

		launch(args);
	}
}
