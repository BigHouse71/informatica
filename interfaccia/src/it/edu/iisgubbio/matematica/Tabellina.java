package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tabellina extends Application  {
	
	Label eNum=new Label("Num");
	GridPane griglia=new GridPane();
	TextField cNum=new TextField();
	Button bCalcola=new Button("Tabellina ");
	Label eTabellina=new Label();
	
	
	public void start(Stage finestra) {
		griglia.add(eNum, 0, 0);
		griglia.add(cNum, 1, 0);
		griglia.add(bCalcola, 0, 2,2,1);
		griglia.add(eTabellina, 0, 3);
		Scene scena = new Scene(griglia);
		bCalcola.setMaxWidth(100);
		cNum.setMinWidth(50);
		scena.getStylesheets().add("it/edu/iisgubbio/matematica/StileTabelline.css");
		finestra.setTitle("Tabellina");
		finestra.setScene(scena);
		finestra.show();
		bCalcola.setOnAction(e -> tabellina());
	}
	
	public void tabellina() {
		String sequenza="0";
		int num =Integer.parseInt(cNum.getText());
		for(int n=1;n<=10;n++) {
			sequenza +=" "+(n*num);
		}
		eTabellina.setText(sequenza);
	
	}
	
	
	
public static void main(String[] args) {
		
		launch(args);
	}
}
