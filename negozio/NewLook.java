package it.edu.iisgubbio.negozio;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
public class NewLook extends Application{
	GridPane griglia=new GridPane();
	RadioButton rBici = new RadioButton("Bici");
	RadioButton rNuoto=new RadioButton("Nuoto");
	RadioButton rPiedi=new RadioButton("Corsa");
	CheckBox chBracciali=new CheckBox("Bracciali");
	CheckBox chCavigliere=new CheckBox("Cavigliera");
	Label eKcal=new Label();
	Label eKm=new Label("Inserisci i Km percorsi");
	Label eAttività=new Label("Attività");
	Label ePesi=new Label("Pesi");
	TextField cKm=new TextField();
	ToggleGroup genere = new ToggleGroup();
	Button bCalcola=new Button("Calcola");
	public void start(Stage finestra) {
		griglia.add(eKm, 0, 0);
		griglia.add(cKm, 1, 0);
		griglia.add(eAttività, 0, 1);
		griglia.add(rPiedi, 0, 2);
		griglia.add(rNuoto,1, 2);
		griglia.add(rBici, 2, 2);
		griglia.add(ePesi, 0, 3);
		griglia.add(chCavigliere, 0, 4);
		griglia.add(chBracciali, 1, 4);
		griglia.add(eKcal, 1, 5);
		griglia.add(bCalcola, 0,5 );
		Scene scena = new Scene(griglia);
		finestra.setTitle("Sconto ");
	    finestra.setScene(scena);
	    finestra.show();
	    rPiedi.setToggleGroup(genere);
	    rNuoto.setToggleGroup(genere);
	    rBici.setToggleGroup(genere);
	    cKm.setMaxWidth(50);
	    eKm.setAlignment(Pos.CENTER);
	    bCalcola.setOnAction(e->calcola());
	}
	public void calcola() {
		double km=Double.parseDouble(cKm.getText());
		double kcal=0;
		if(rPiedi.isSelected()) {
			kcal=km*12;
		}
		if(rNuoto.isSelected()) {
			kcal=km*21;
		}
		if(rBici.isSelected()) {
			kcal=km*7;
		}
		if(chBracciali.isSelected()) {
			kcal=kcal*1.18;
			
		}
		if(chCavigliere.isSelected()) {
			kcal=kcal*1.35;
		}
		eKcal.setText("Le calorie bruciate sono "+kcal);
	
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
