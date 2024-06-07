package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Palindrome extends Application{
	GridPane griglia =new GridPane();
	TextField cFrase=new TextField();
	Label ePrint=new Label();
	Button bPalindrimo=new Button("Palindromo ");
	
	public void start(Stage fienstra) {
		griglia.add(cFrase, 0, 0);
		griglia.add(bPalindrimo, 0, 1);
		griglia.add(ePrint, 0, 2);
		Scene scena=new Scene (griglia);
		fienstra.setScene(scena);
		fienstra.show();
		bPalindrimo.setOnAction(e-> palindromo());
	}
	public void palindromo() {
		String parola=cFrase.getText().toLowerCase();
		char x[]=parola.toCharArray();
		int ultima=x.length-1;
		boolean palindromo=true;
		for(int i=0;i<x.length/2 && palindromo;i++,ultima--) {
			if(x[i]!=x[ultima]) {
				palindromo=false;
			}
		}
		if(palindromo) {
			ePrint.setText("Si");
		}else {
			ePrint.setText("No");	
			}
	}
	public static void main(String[] args) {

		launch(args);
	}
}
