package it.edu.iisgubbio.TPSIT;


import java.util.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CompressioniImmagini extends Application{


	char g[][]=new char[3][3];
	TextField cPercentuale=new TextField();

	TextField nCompresso=new TextField();
	Label eCompresso=new Label("Compresso");
	Label eNonCompresso=new Label(" non Compresso");
	Label ePercentuale=new Label("percentuale compressione");
	Hashtable<Integer,Integer> my_dict = new Hashtable<Integer,Integer>();
	Button bCalcola=new Button("Calcola");
	TextField cCompresso=new TextField();
	GridPane griglia=new GridPane();

	public void start(Stage finestra) {
		my_dict.put(1, 1);
		my_dict.put(2, 2);
		my_dict.put(3, 2);
		my_dict.put(4, 3);
		my_dict.put(5, 3);
		my_dict.put(6, 3);
		my_dict.put(7, 3);
		my_dict.put(8, 4);


		g[0][0]='v';
		g[1][0]='b';
		g[2][0]='b';
		g[0][1]='g';
		g[1][1]='g';
		g[2][1]='g';
		g[0][2]='b';
		g[1][2]='v';
		g[2][2]='g';



		griglia.add(eNonCompresso, 0, 0);
		griglia.add(eCompresso, 0, 1);
		griglia.add(ePercentuale, 0, 2);
		griglia.add(bCalcola, 0, 3);
		griglia.add(nCompresso, 1, 0);
		griglia.add(cCompresso, 1, 1);
		griglia.add(cPercentuale, 1, 2);
		
		griglia.setHgap(15);
		griglia.setVgap(15);
		griglia.setPadding(new Insets(10,10,10,10));
		bCalcola.setOnAction(e-> Calcola());
		Scene scena =new Scene(griglia);
		finestra.setTitle("parola25");
		finestra.setScene(scena);
		finestra.show();
	}

	public void Calcola() {
		double nCompress=g[0].length*g.length*24;
		nCompresso.setText(""+nCompress);
		int compresso=0;
		int contatore=1;
		int v[]=new int[g.length];
		
		for(int rige=0;rige<g.length;rige++,contatore=1) {
			for(int c=1;c<g.length;c++) {
				if(g[c-1][rige]==g[c][rige]) {
					contatore++;
				}else{
					v[rige]+=my_dict.get(contatore)+24;
				}
			}
			v[rige]+=my_dict.get(contatore)+24;
		}
		for(int p=0;p<v.length;p++) {
			compresso+=v[p];
		}
		cCompresso.setText(""+compresso);
		
		double perCompresso=compresso/nCompress*100;
		double bho=100-perCompresso;
		cPercentuale.setText(""+bho);
	}
	



	public static void main(String[] args) {

		launch(args);
	}
}
