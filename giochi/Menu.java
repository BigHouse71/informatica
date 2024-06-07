
package it.edu.iisgubbio.giochi;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Menu extends Application{
	Pane quadro=new Pane();
	final int LARGHEZZA_QUADRO = 400;
	final int ALTEZZA_QUADRO = 400;
	public void start(Stage primaryStage){
		Scene scene = new Scene(quadro,ALTEZZA_QUADRO,LARGHEZZA_QUADRO);
		Button start=new Button("Start");
		Label nome=new Label("Nome Gioco");
		start.setPrefWidth(150);
		start.setPrefHeight(40);
		start.setStyle("-fx-background-radius: 10; -fx-font-size: 16;");
		start.setOnAction(e -> startGame());
		start.setLayoutX(LARGHEZZA_QUADRO-290);
		start.setLayoutY(ALTEZZA_QUADRO-250);
		nome.setLayoutX(LARGHEZZA_QUADRO-280);
		nome.setLayoutY(ALTEZZA_QUADRO-370);
		nome.setStyle("-fx-font-size: 24;");
		quadro.getChildren().add(start);
		quadro.getChildren().add(nome);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Image Color Extractor");
		primaryStage.show();
	}


	private void startGame() {
		quadro.getChildren().clear();
		String imagePath = "C:\\Users\\fabie\\Downloads\\prova 2.jpg";
		Image image = new Image(new File(imagePath).toURI().toString());
		ImageView ig=new ImageView(image);
		String imagePath2 = "C:\\Users\\fabie\\Downloads\\prova 2.jpg";
		Image image2 = new Image(new File(imagePath).toURI().toString());
		ImageView ig2=new ImageView(image);
		String imagePath3 = "C:\\Users\\fabie\\Downloads\\prova 3.jpg";
		Image image3 = new Image(new File(imagePath).toURI().toString());
		ImageView ig3=new ImageView(image);
		
		ig.setLayoutX(LARGHEZZA_QUADRO);
		ig.setLayoutY(ALTEZZA_QUADRO-250);
		
		quadro.getChildren().add(ig3);
		
		
	}











	public static void main(String[] args) {
		launch(args);
	}
}
