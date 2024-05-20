package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AreaRombo extends Application {
	
	Button bCalcola =new Button("Calcola");
	Label eDiagonaleMag =new Label("Diagonale Maggiore");
	Label eDiagonaleMin =new Label("Diogonale Minore");
	TextField cDiagonaleMag= new TextField ();
	TextField cDiagonaleMin=new TextField();
	Label eArea=new Label();
	Label ePerimetro=new Label();
	GridPane Griglia=new GridPane();
	
	public void start(Stage finestra) {
		Griglia.add(eDiagonaleMag, 0, 0);
		Griglia.add(eDiagonaleMin, 0, 1);
		Griglia.add(bCalcola,0,2);
		Griglia.add(eArea, 1,2 );
		Griglia.add(cDiagonaleMag,1,0);
		Griglia.add(cDiagonaleMin,1,1);
		Griglia.add(ePerimetro, 1, 3);
		Scene scena = new Scene(Griglia);
		finestra.setTitle("Prima Interfaccia");
	    finestra.setScene(scena);
	    finestra.show();
	    bCalcola.setOnAction(e -> Calcola());

	}
	
	public void Calcola() {
		
		double nDia1,nDia2,nArea,nDiaMM,nDiaMinM,nPerimetro;
		String sDia1,sDia2;
		sDia1=cDiagonaleMag.getText();
		sDia2=cDiagonaleMin.getText();
		nDia1=Double.parseDouble(sDia1);
		nDia2=Double.parseDouble(sDia2);
		nDiaMM=nDia1/2;
		nDiaMinM=nDia2/2;
		nArea=(nDia1*nDia2)/2;
		eArea.setText("Area="+nArea);
		nPerimetro=Math.sqrt((nDiaMM*nDiaMM)+(nDiaMinM*nDiaMinM))*4;
		ePerimetro.setText("Perimetro="+nPerimetro);
		
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
