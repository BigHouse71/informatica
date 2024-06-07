package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Rettangolo extends Application {

	Button bCalcola=new Button("Calcola");
	Label eArea =new Label();
	Label ePerimetro=new Label();
	Label eBase=new Label("base");
	Label eAltezza=new Label("altezza");
	TextField cBase=new TextField();
	TextField cAltezza =new TextField();
	GridPane Griglia=new GridPane();
	
	public void start(Stage finestra){
		Griglia.setPadding(new Insets(10, 10, 10, 10));
		Griglia.add(eBase,0,0);
		Griglia.add(eAltezza, 0, 1);
		Griglia.add(cBase,1,0);
		Griglia.add(cAltezza, 1, 1);
		Griglia.add(bCalcola, 0, 2,2,1);
		Griglia.add(eArea, 0, 3);
		Griglia.add(ePerimetro,1,3);
		bCalcola.setMaxWidth(500.0);
		eArea.setMinWidth(80.0);
		Scene scena = new Scene(Griglia);
		finestra.setTitle("Prima Interfaccia");
	    finestra.setScene(scena);
	    finestra.show();
	    bCalcola.setOnAction(e -> Calcola());
		
	}
	
	public void Calcola() {
		Double Base,Altezza,Perimetro,Area;
		String A,P;
		A=cBase.getText();
		P=cAltezza.getText();
		
		Base=Double.parseDouble(A);
		Altezza=Double.parseDouble(P);
		Perimetro=(Base+Altezza)*2;
		Area=Base*Altezza;
		eArea.setText("Area="+Area);
		ePerimetro.setText("Perimetro="+Perimetro);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
