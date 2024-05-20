package it.edu.iisgubbio.animazione;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Barra extends Application{
	
	Label eSimbolo=new Label("Simbolo");
	Label eMilli=new Label("millisecondi");
	TextField cSimbolo=new TextField();
	TextField cMilli=new TextField();
	Button bVai=new Button("Via");
	Label eRipetizione=new Label();
	GridPane griglia=new GridPane();
	int n=1;
	public void start(Stage finestra) {
		
		griglia.add(eSimbolo, 0, 0);
		griglia.add(cSimbolo, 1, 0);
		griglia.add(eMilli, 0, 1);
		griglia.add(cMilli, 1, 1);
		griglia.add(bVai, 2, 0,1,2);
		griglia.add(eRipetizione, 0, 2,3,1);
		bVai.setOnAction(e -> vai());
		Scene scena = new Scene(griglia,200,200);
		finestra.setTitle("Quadro");
		finestra.setScene(scena);
		finestra.show();
	}
	
	public void vai () {
		int tempo=Integer.parseInt(cMilli.getText());
		Timeline timeline = new Timeline(new KeyFrame(
				  Duration.millis(tempo),
				      x -> aggiornaTimer()));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}
	public void aggiornaTimer() {
		boolean avanti=true;
		String ripeti="";
		String parola=cSimbolo.getText();
		for(int cont=1;n>=cont;cont++) {
			ripeti+=parola;
		}
		if(n==20) {
			avanti=false;
		}
		if(n==0) {
			avanti=true;
		}
		if(avanti) {
			n++;
		}else {
			n--;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		 
		launch(args);
	}
}
