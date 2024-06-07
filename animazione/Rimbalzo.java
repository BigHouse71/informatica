package it.edu.iisgubbio.animazione;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.geometry.Bounds;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;



public class Rimbalzo extends Application{
	double x=200;
	double y=150;
	final int LARGHEZZA_SCHERMO=300;
	final int ALTEZZA_SCHERMO=300;
	boolean avanti=true;
	boolean vince=false;
	boolean sopra=true;
	boolean ingioco=false;
	boolean premutoW=false;
	boolean premutoUp=false;
	boolean	premutoS=false;
	boolean premutoDown=false;
	GridPane griglia=new GridPane();
	Label ePlayer1 =new Label("Player1");
	Label ePlayer2 =new Label("Player2");
	Label eP1 =new Label("P1");
	Label eP2 =new Label("P2");
	Label eEventi =new Label("PRESS SPACE");
	Label ePunteggio =new Label("0:0");
	Circle pallini=new Circle(7);
	Pane quadro=new Pane();
	int p1=0,p2=0;

	Rectangle racchettaDx=new Rectangle();
	Rectangle racchettaSx=new Rectangle();
	Timeline timelineGame = new Timeline(new KeyFrame(
			  Duration.millis(10),
			      x -> aggiornaTimerGame()));
	Timeline timelineControl = new Timeline(new KeyFrame(
			  Duration.millis(10),
			      x -> aggiornaTimerControl()));
	
	int racchettaSPosY=100;
	int racchettaDPosY=100;
	public void start(Stage finestra) {
		ColumnConstraints vincoliPrimaColonna = new ColumnConstraints();
		vincoliPrimaColonna.setHalignment(HPos.LEFT);
		ColumnConstraints vincoliSecondaColonna = new ColumnConstraints();
		vincoliSecondaColonna.setHalignment(HPos.CENTER);
		ColumnConstraints vincoliTerzaColonna = new ColumnConstraints();
		vincoliTerzaColonna.setHalignment(HPos.CENTER);
		ColumnConstraints vincoliQuartaColonna = new ColumnConstraints();
		vincoliQuartaColonna.setHalignment(HPos.CENTER);
		griglia.getColumnConstraints().addAll(vincoliPrimaColonna, vincoliSecondaColonna,vincoliTerzaColonna);
		
		RowConstraints vincoliRiga0 = new RowConstraints();
		vincoliRiga0.setValignment(VPos.CENTER);
		RowConstraints vincoliRiga1 = new RowConstraints();
		vincoliRiga1.setValignment(VPos.CENTER);
		RowConstraints vincoliRiga2 = new RowConstraints();
		vincoliRiga2.setValignment(VPos.CENTER);
		RowConstraints vincoliRiga3 = new RowConstraints();
		vincoliRiga3.setValignment(VPos.CENTER);
		RowConstraints vincoliRiga4 = new RowConstraints();
		vincoliRiga4.setValignment(VPos.CENTER);
		griglia.getRowConstraints().addAll(vincoliRiga0, vincoliRiga1, vincoliRiga2,vincoliRiga3,vincoliRiga4);
		
		quadro.setPrefSize(ALTEZZA_SCHERMO, LARGHEZZA_SCHERMO);
		racchettaDx.setY(racchettaDPosY);
		racchettaDx.setX(10);
		racchettaDx.setWidth(10);
		racchettaDx.setHeight(100);
		
		racchettaSx.setY(racchettaSPosY);
		racchettaSx.setX(LARGHEZZA_SCHERMO);
		racchettaSx.setWidth(10);
		racchettaSx.setHeight(100);
		
		pallini.setCenterX(160);
		pallini.setCenterY(y);
		
		quadro.getChildren().add(pallini);
		quadro.getChildren().add(racchettaDx);
		quadro.getChildren().add(racchettaSx);
		
		
		griglia.add(ePlayer1, 0, 1);
		griglia.add(ePunteggio, 1, 1);
		griglia.add(ePlayer2, 2,1);
		griglia.add(eP1,0,2);
		griglia.add(eP2, 2, 2);
		griglia.add(eEventi,1,2);
		eEventi.setPrefSize(LARGHEZZA_SCHERMO/2, ALTEZZA_SCHERMO-280);
		griglia.add(quadro, 0,3,3,1);
		griglia.setGridLinesVisible(true);
		

		
		

		timelineGame.setCycleCount(Animation.INDEFINITE);
		timelineControl.setCycleCount(Animation.INDEFINITE);
		timelineControl.play();
		Scene scena = new Scene(griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/animazione/Racchette.css");
		griglia.setId("griglia");
		quadro.setId("quadro");
		racchettaSx.getStyleClass().add("racchette");
		racchettaDx.getStyleClass().add("racchette");
		pallini.getStyleClass().add("racchette");
		finestra.setTitle("Quadro");
		finestra.setScene(scena);
		finestra.show();
		scena.setOnKeyPressed(e -> pigiato(e));
		scena.setOnKeyReleased(e ->rilasciato(e));
	}
	
	public void aggiornaTimerControl() {
		if(premutoUp) {
			if(racchettaSx.getY()<=0) {
			}else {
				racchettaSx.setY(racchettaSx.getY()-2);
			}
		}
		if(premutoDown) {
			if(racchettaSx.getY()>=200) {
				
			}else {
				racchettaSx.setY(racchettaSx.getY()+2);
			}
		}
		if(premutoW) {
			if(racchettaDx.getY()<=0) {
			}else {
				racchettaDx.setY(racchettaDx.getY()-2);
			}
		}
		if(premutoS) {
			if(racchettaDx.getY()>=200) {
				
			}else {
				racchettaDx.setY(racchettaDx.getY()+2);
			}
		}
		
		if(vince) {
			timelineGame.stop();
			
		}
	}
	
	public void rilasciato(KeyEvent rilasciato) {
		
		if(rilasciato.getCode()== KeyCode.DOWN) {
			premutoDown=false;
		}
		
		if(rilasciato.getCode()==KeyCode.UP) {
			premutoUp=false;
		}
		if(rilasciato.getText().equals("w")){
			premutoW = false;
		}
		if(rilasciato.getText().equals("s")) {
			premutoS=false;
		}
		
	}
	public void pigiato(KeyEvent evento) {

		if(!vince) {
			if(evento.getCode()==KeyCode.SPACE) {
					timelineGame.play();
					ingioco=true;
					eEventi.setText("");
				}
		}else {
			if(evento.getCode()==KeyCode.ENTER ) {
				timelineGame.play();
				eEventi.setText("");
				p1=0;
				p2=0;
				ePunteggio.setText("0:0");
				vince=false;
			}
		}
		if(evento.getCode()== KeyCode.DOWN) {       
			premutoDown=true;
			
		}
		if(evento.getCode()== KeyCode.UP) {
			premutoUp=true;
		}
	
		if(evento.getText().equals("w")){
			premutoW=true;
		}
		
		if(evento.getText().equals("s")) {
			premutoS=true;
		}
}
	
	
	 
	public void aggiornaTimerGame() {
		Bounds rD = racchettaDx.getBoundsInParent();
		Bounds rS = racchettaSx.getBoundsInParent();
		Bounds p = pallini.getBoundsInParent();
		if(x<=10) {
			pallini.setCenterX(x=160);
			pallini.setCenterY(y=150);
			timelineGame.stop();
			ingioco=false;
			p2+=1;
			ePunteggio.setText(""+p1+":"+p2);
			eEventi.setText("PRESS SPACE");
			if(p2==2) {
				eEventi.setText("P2 Vince");
				p2=0;
				p1=0;
				vince=true;
			}
		}
		if(x>=LARGHEZZA_SCHERMO) {
			ingioco=false;
			pallini.setCenterX(x=160);
			pallini.setCenterY(y=150);
			timelineGame.stop();
			p1+=1;
			ePunteggio.setText(""+p1+":"+p2);	
			eEventi.setText("PRESS SPACE");
			if(p1==2) {
				eEventi.setText("P1 Vince");
				p2=0;
				p1=0;
				vince=true;
			}
		}
		if(y<=10) {
			sopra=true;
			
		}
		if(y>=ALTEZZA_SCHERMO-10) {
			sopra=false;
		}
		if(sopra) {
			pallini.setCenterY(y++);
		}else {
			pallini.setCenterY(y--);

		}
		if(rD.intersects(p)) {
			avanti=true;
		}
		if(rS.intersects(p)) {
			avanti=false;
		}
		if(avanti) {
			pallini.setCenterX(x++);
		}else {
			pallini.setCenterX(x--);
		}
	
	}
	public static void main(String[] args) {
		 
		launch(args);
	}

}
