package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Primi  extends Application{
	
	Label eNum=new Label("Num");
	GridPane griglia=new GridPane();
	TextField cNum =new TextField();
	Button bCalcola=new Button("Primi ");
	Label eTotale=new Label();

	public void start(Stage finestra) {
		griglia.add(eNum, 0, 0);
		griglia.add(cNum, 1, 0);
		griglia.add(bCalcola, 1, 2);
		griglia.add(eTotale, 0, 3,2,1);
		bCalcola.setMinWidth(200);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Primi");
		finestra.setScene(scena);
		finestra.show();
		bCalcola.setOnAction(e -> calcola());
	}
	public void calcola() {
		int num=Integer.parseInt(cNum.getText());
		boolean primo= true;
		for(int n=2;n<num&& primo;n++) {
			if(num%n==0) {
				primo=false;
			}
			
				if(primo) {
					eTotale.setText("è primo");
				}else {
					eTotale.setText("non è primo");

				}
			
		}
			
	}
public static void main(String[] args) {
		
		launch(args);
	}
	}