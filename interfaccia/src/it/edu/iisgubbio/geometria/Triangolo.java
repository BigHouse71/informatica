package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Triangolo extends Application {

	Label eCateto1 =new Label("Cateto1");
	Label eCateto2=new Label("Cateto2");
	Label eIpotenusa=new Label("Ipotenusa");
	TextField casCateto1=new TextField();
	TextField casCateto2=new TextField();
	TextField casIpotenusa=new TextField();
	Button bCateto1=new Button("Calcola Cateto");
	Button bCateto2=new Button("Calcola Cateto");
	Button bIpotenusa=new Button("Calcola Ipotenusa");
	GridPane Griglia=new GridPane();
	
	public void start(Stage finestra) {
		Griglia.add(eCateto1, 0, 0);
		Griglia.add(casCateto1, 1, 0);
		Griglia.add(bCateto1, 2, 0);
		Griglia.add(eCateto2, 0, 1);
		Griglia.add(casCateto2, 1, 1);
		Griglia.add(bCateto2, 2, 1);
		Griglia.add(eIpotenusa, 0, 2);
		Griglia.add(casIpotenusa, 1, 2);
		Griglia.add(bIpotenusa, 2, 2);
		Scene scena = new Scene(Griglia);
		finestra.setTitle("Tringolo Retangolo ");
	    finestra.setScene(scena);
	    finestra.show();
	    bCateto1.setOnAction(e -> cateto1());
	    bCateto2.setOnAction(e -> cateto2());
	    bIpotenusa.setOnAction(e -> ipotenusa());
	    
	}
	
	public void cateto1() {
		double vCat,vCat2,vIpo;
		String sCat2,sIpo;
		sCat2=casCateto2.getText();
		sIpo=casIpotenusa.getText();
		vCat2=Double.parseDouble(sCat2);
		vIpo=Double.parseDouble(sIpo);
		vCat=Math.sqrt((vIpo*vIpo)-(vCat2*vCat2));
		casCateto1.setText(""+vCat);
		}
	
	
	public void cateto2() {
		Double vCat,vCat2,vIpo;
		String sCat,sIpo;
		sCat=casCateto1.getText();
		sIpo=casIpotenusa.getText();
		vCat=Double.parseDouble(sCat);
		vIpo=Double.parseDouble(sIpo);
		vCat2=Math.sqrt((vIpo*vIpo)-(vCat*vCat));
		casCateto2.setText(""+vCat2);
	}
	
	public void ipotenusa() {
		Double vCat,vCat2,vIpo;
		String sCat2,sCat;
		sCat2=casCateto2.getText();
		sCat=casCateto1.getText();
		vCat2=Double.parseDouble(sCat2);
		vCat=Double.parseDouble(sCat);
		vIpo=Math.sqrt((vCat*vCat)+(vCat2*vCat2));
		casIpotenusa.setText(""+vIpo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
		
		launch(args);
	}
	
}
