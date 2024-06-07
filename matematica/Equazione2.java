package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Equazione2 extends Application {
	TextField casA=new TextField();
	TextField casB=new TextField();
	TextField casC=new TextField();
	GridPane griglia=new GridPane();
	Label eX2=new Label("X2+");
	Label eX=new Label("X+");
	Button bCalcola=new Button("Calcola soluzioni");
	Label eTotale=new Label();
	Label eZero=new Label("=0");
	public void start(Stage finestra) {
		griglia.add(casA, 0, 0);
		griglia.add(eX2, 1, 0);
		griglia.add(casB, 2, 0);
		griglia.add(casC, 4, 0);
		griglia.add(eX, 3, 0);
		griglia.add(bCalcola, 0, 1,4,1);
		griglia.add(eTotale, 0, 2,4,1);
		griglia.add(eZero, 5, 0);
		eX.setAlignment(Pos.CENTER);
		eX2.setAlignment(Pos.CENTER);
		bCalcola.setMinWidth(500);
		Scene scena = new Scene(griglia,500,500);
		finestra.setTitle("");
		finestra.setScene(scena);
		finestra.show();
		Image immagine = new Image(getClass().getResourceAsStream("apple.png"));
		ImageView visualizzatoreImmagine = new ImageView(immagine);
		visualizzatoreImmagine.setFitHeight(40);
		visualizzatoreImmagine.setPreserveRatio(true);
		bCalcola.setGraphic(visualizzatoreImmagine);
		bCalcola.setOnAction(e -> calcola());
	}
	
	public void calcola() {
		if(casA.getText().equals("")) {
			casA.setText("0");
		}
		if(casB.getText().equals("")) {
			casB.setText("0");
		}
		if(casC.getText().equals("")) {
			casC.setText("0");
		}
		
		double a=Double.parseDouble(casA.getText());
		double b=Double.parseDouble(casB.getText());
		double c=Double.parseDouble(casC.getText());
		double delta,x1,x2;
		delta=(b*b)-4*(a)*(c);
		if(a==0) {
			x1=(c/b);
			eTotale.setText("la soluzione è "+x1);
		}else if(c==0) {
			x1=0;
			x2=((-b)/a);
			eTotale.setText("X1= "+x1+" X2= "+x2);
		}else if (b==0) {
			x1=+(Math.sqrt((c/a)));
			x2=-(Math.sqrt((c/a)));
			eTotale.setText(""+x2+x1);
		}else if(delta<0) {
			eTotale.setText("è imposibile");
		}else if(delta>0){
			x1=((-b+Math.sqrt(delta))/(2*a));
			x2=((-b-Math.sqrt(delta))/(2*a));
			eTotale.setText("X1= "+x1+" X2= "+x2);
		}else {
			x1=((-b+Math.sqrt(delta))/(2*a));
			x2=((-b-Math.sqrt(delta))/(2*a));
			eTotale.setText("le soluzioni sono uguali"+x1+"="+x2);
		}
	}
	
	
	
	
	
	
	
public static void main(String[] args) {
		
		launch(args);
	}
}
