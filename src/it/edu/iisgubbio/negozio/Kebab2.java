package it.edu.iisgubbio.negozio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Kebab2  extends Application{
	GridPane griglia=new GridPane();
	Label eCarne=new Label("Carne");
	Label eContorno=new Label("Contorno");
	Label eSasla=new Label("Salsa");
	ComboBox <String> cbCarne=new ComboBox<>();
	ComboBox <String> cbContorno=new ComboBox<>();
	ComboBox <String> cbSalsa=new ComboBox<>();
	Button bTotale=new Button("Totale");
	Label eTotale=new Label();
	
	
	
	public void start(Stage finestra) {
			griglia.add(eCarne, 0, 0);
			griglia.add(cbCarne, 0, 1);
			griglia.add(eContorno, 0, 2);
			griglia.add(cbContorno, 0, 3);
			griglia.add(eSasla, 0, 4);
			griglia.add(cbSalsa, 0, 5);
			griglia.add(bTotale, 0, 6);
			griglia.add(eTotale, 0, 7);
			cbCarne.getItems().add("Pollo");
			cbCarne.getItems().add("Maiale");
			cbCarne.getItems().add("Vitello");
			cbCarne.getItems().add("Tofu");
			cbContorno.getItems().add("Insalata");
			cbContorno.getItems().add("Cipolla");
			cbContorno.getItems().add("Pomodoro");
			cbContorno.getItems().add("Carota");
			cbSalsa.getItems().add("Mayonese");
			cbSalsa.getItems().add("Piccante");
			cbSalsa.getItems().add("Yougurt");
			cbSalsa.getItems().add("Tzatiziki");
			griglia.setPadding(new Insets(10, 10, 10, 10));
			griglia.setHgap(5); 
			griglia.setVgap(5);
			Scene scena = new Scene(griglia);
			finestra.setTitle("Kebab2");
		    finestra.setScene(scena);
		    finestra.show();
		    cbCarne.setOnAction(e -> carneprezzo());
		    cbContorno.setOnAction(e -> contornoprezzo());
		    cbSalsa.setOnAction(e -> saleprezzo());
			bTotale.setOnAction(e-> totale());
		}
	public void carneprezzo() {
		String carne=cbCarne.getValue();
		switch (carne) {
		case "pollo":
		case "Tofu":
			
			break;
		case "Maiale":
			
		default:
		}
	}
	public void contornoprezzo() {
		String contorno=cbContorno.getValue();
	}
	public void saleprezzo() {
		String salsa=cbSalsa.getValue();
	}
	
	public void totale() {
		String carne=cbCarne.getValue();
		String contorno=cbContorno.getValue();
		String salsa=cbSalsa.getValue();
		double totale = 0;
		switch (carne) {
		case "Pollo":
			totale+=3;
			break;
		case "Maiale":
			totale+=2.5;
			break;
		case "Vitello":
			totale+=4;
			break;
		default:
			totale+=3;
		}
				
		switch (contorno) {
		case "Insalata":
			totale+=0.5;
			break;
		case "Cipolla":
			totale+=0.5;
			break;
		case "Pomodoro":
			totale+=1;
			break;
		default:
			totale+=1;
		}
		switch (salsa) {
		case "Piccante":
			totale+=1;
			break;
		case "Mayonese":
			totale+=0.5;
			break;
		case "Yougurt":
			totale+=0.5;
			break;
		default:
			totale+=0.5;
		}
		totale++;
		eTotale.setText(""+totale);
		}

	
	public static void main(String[] args) {
			
		launch(args);
	}	
		
}
