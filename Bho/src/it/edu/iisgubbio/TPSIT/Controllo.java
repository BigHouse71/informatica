package it.edu.iisgubbio.TPSIT;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public  class Controllo extends Application{
	Button bcalcola=new Button("calcola");
	Label print=new Label();

	TextField cInput=new TextField();
	GridPane griglia=new GridPane();
	ToggleGroup genere = new ToggleGroup();
	RadioButton bBho1=new RadioButton(" ");
	RadioButton bBitParità =new RadioButton("BitParità");
	RadioButton bLRC=new RadioButton("");
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		griglia.add(cInput, 0, 0);
		griglia.add(bBitParità,0, 1);
		griglia.add(bLRC,0, 2);
		griglia.add(bBho1,0, 3);
		griglia.add(print,0, 4);
		griglia.add(bcalcola,1, 4);
	
		bcalcola.setOnAction(e-> calcola());
		Scene scena=new Scene(griglia);
		primaryStage.setScene(scena);
		primaryStage.show();
		bLRC.setToggleGroup(genere);
		bBho1.setToggleGroup(genere);
		bBitParità.setToggleGroup(genere);
	}
	public void calcola() {
		String s;

		boolean ok=true;
		int c=0;
		if(bBitParità.isSelected()) {
			char v[]=cInput.getText().toCharArray();
			for(int i=0;i<v.length-2;i++) {
				if(v[i]=='1') {
					c++;
				}
			}
			if(c%2==0 && v[v.length-1]==1) {
				ok=false;
				
			}else {
				ok=true;
			}
		}
		print.setText(""+ok);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
