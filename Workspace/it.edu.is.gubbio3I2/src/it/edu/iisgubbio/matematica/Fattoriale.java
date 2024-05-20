package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fattoriale  extends Application{
	
	GridPane griglia=new GridPane();
	TextField cNum=new TextField();
	Button bCalcola=new Button("!");
	Label eFattoriale=new Label();

	
	public void start(Stage finestra) {
		griglia.add(cNum, 0, 0);
		griglia.add(bCalcola,1,0 );
		griglia.add(eFattoriale, 2, 0);
		cNum.setMaxWidth(70);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Fattoriale");
		finestra.setScene(scena);
		finestra.show();
		bCalcola.setOnAction(e -> fattoriale());
	}
	public void fattoriale() {
		int num=Integer.parseInt(cNum.getText());
		int totale=1;
		for(int fatto=1;fatto<=num;fatto++) {
			totale*=fatto;
		}
		eFattoriale.setText(""+totale);
	}
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
