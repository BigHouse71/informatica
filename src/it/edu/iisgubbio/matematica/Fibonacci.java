package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fibonacci extends Application{

	GridPane griglia=new GridPane();
	TextField cNum=new TextField();
	Button bCalcola=new Button("calcola");
	Label eFibonacci=new Label("Fib");
	

	public void start(Stage finestra) {
		griglia.add(cNum, 0, 0);
		griglia.add(bCalcola,1,0 );
		griglia.add(eFibonacci, 0, 2);
		cNum.setMaxWidth(70);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Fattoriale");
		finestra.setScene(scena);
		finestra.show();
		bCalcola.setOnAction(e -> fibonacci());
	}
	int fib(int n) {
		int ris;
		
		if(n==0) {
			ris=0;
		}else {
			if(n==1) {
				ris=1;
			}else {
				ris=fib(n-1)+fib(n-2);

			}
		}
		
		return ris;
	}
	public void fibonacci() {
		int num=Integer.parseInt(cNum.getText());
		int totale;
		totale=fib(num);
		eFibonacci.setText(""+totale);
	}

		

	public static void main(String[] args) {

		launch(args);
	}
	
}
