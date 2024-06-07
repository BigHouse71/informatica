package it.edu.iisgubbio.vettori;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
;

public class MinMax  extends Application{
	TextField cNumeri=new TextField();
	Button bMin=new Button("Min");
	Button bMax=new Button("Max");
	Label ePrint=new Label();
	GridPane griglia=new GridPane();
	int n[];
	public void start(Stage finestra) {
		griglia.add(cNumeri, 0, 0);
		griglia.add(bMax, 2, 1);
		griglia.add(bMin, 0, 1);
		griglia.add(ePrint, 1,1);

		bMin.setOnAction(e-> min());
		bMax.setOnAction(e-> max());
		Scene scena =new Scene(griglia);
		finestra.setTitle("anagramma");
		finestra.setScene(scena);
		finestra.show();
	}
	public void min() {
		String t=cNumeri.getText();
		String parti[]=t.split(" ");
		int numeri[]=new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			numeri[i]=Integer.parseInt(parti[i]);
		}
		int min=numeri[0];
		for(int i=0;i<numeri.length;i++){
			if(min>numeri[i]) {
				min=numeri[1];
			}
		}
		ePrint.setText(""+min);
	}
	public void max() {
		
	}
	public static void main(String[] args) {
		launch(args);

	}
}
