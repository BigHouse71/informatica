package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;

public class Geometria extends Application{

	Button bArea=new Button("Area");
	Label eLato=new Label("lato");
	Label eArea=new Label();
	TextField cLato=new TextField();
	GridPane Griglia=new GridPane();
	Label ePerimetro=new Label();
	Button bPerimetro=new Button("Perimetro");
	public void start(Stage finestra){
		
		Griglia.add(eLato, 0, 0);
		Griglia.add(cLato, 1, 0);
		Griglia.add(bArea, 0, 1);
		Griglia.add(eArea, 1, 1);
		Griglia.add(ePerimetro, 1, 2);
		Griglia.add(bPerimetro, 0, 2);
		bArea.setMaxWidth(3000.0);
		Scene scena = new Scene(Griglia);
		finestra.setTitle("Prima Interfaccia");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    bArea.setOnAction(e -> area());
	    bPerimetro.setOnAction(e -> perimetro());
	}
	
		public void area(){
			String latoStringa;
			int lato;
			int area;
			latoStringa=cLato.getText();
			lato =Integer.parseInt(latoStringa);
			area=lato*lato;
			eArea.setText(""+area);
		
		
		
		}
	
		public void perimetro() {
			String latoStringa;
			int lato;
			int perimetro;
			latoStringa=cLato.getText();
			lato=Integer.parseInt(latoStringa);
			perimetro=lato*4;
			ePerimetro.setText(""+perimetro);
		
		}
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
