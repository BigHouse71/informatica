package it.edu.iisgubbio.giochi;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
public class AcchiappaLaTalpa extends Application{
	Pane quadro=new Pane();
	Label eVinto=new Label("Vinto");
	Circle pallino=new Circle(15);
	Timeline timelineGame = new Timeline(new KeyFrame(
			  Duration.seconds(3),
			      x -> aggiornaTimerGame()));
	int posX;
	int posY;
	int nRandomY,nRandomX;
	public void start(Stage finestra) {
		timelineGame.setCycleCount(Animation.INDEFINITE);
		timelineGame.play();
		
		Scene scena =new Scene(quadro,400,400);
		scena.addEventHandler(MouseEvent.MOUSE_CLICKED, e-> click(e) );
		finestra.setTitle("prendi la talpa");
		finestra.setScene(scena);
		finestra.show();
	}
	
	public void click(MouseEvent e) {
		if(e.getButton().equals(MouseButton.PRIMARY)){
			posX=(int) e.getX();
			posY=(int) e.getY();
			int distanza=(int) Math.sqrt((nRandomX-posX)*(nRandomX-posX)+(nRandomY-posY)*(nRandomY-posY));
			if(distanza<15) {
				eVinto.setLayoutX(200);
				quadro.getChildren().add(eVinto);
				
			}
		}
	}

	public void aggiornaTimerGame() {

		quadro.getChildren().clear();
		nRandomY=(int)(Math.random()*400+1);
		nRandomX=(int)(Math.random()*400+1);
		pallino.setLayoutX(nRandomX);
		pallino.setLayoutY(nRandomY);
		quadro.getChildren().add(pallino);
		
	
	}

	public static void main(String[] args) {

		launch(args);
	}
}
