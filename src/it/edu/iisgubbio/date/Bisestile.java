package it.edu.iisgubbio.date;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
public class Bisestile extends Application  {
	Button bBisestile=new Button("Bisestile?");
	Label eAnno=new Label("Anno");
	Label eBisestile=new Label();
	TextField cAnno=new TextField();
	GridPane griglia=new GridPane();
	public void start(Stage finestra){
		griglia.add(eBisestile, 1, 1);
		griglia.add(cAnno,1,0);
		griglia.add(bBisestile, 0,1);
		griglia.add(eAnno, 0, 0);
		Scene scena = new Scene(griglia);
		finestra.setTitle("Bisestile ");
	    finestra.setScene(scena);
	    finestra.show();
	    bBisestile.setOnAction(e ->bisestile());
	}
	
	public void bisestile() {
		int vAnno=Integer.parseInt(cAnno.getText());
		if( vAnno%4==0 && vAnno%100!=0 || vAnno%400==0 ) {
				eBisestile.setText(""+vAnno+" è bisestile");		
		}else {
			eBisestile.setText(""+vAnno+" non è bisestile");
		}
	}
	
public static void main(String[] args) {
		
		launch(args);
	}
	








	
	
	
	



}
