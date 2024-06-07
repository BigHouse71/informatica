package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;

public class GiocoGiocoso extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Percorso dell'immagine
		String imagePath = "C:\\Users\\fabiocasagrande\\Pictures\\prova.png";

		// Carica l'immagine
		Image image = new Image(new File(imagePath).toURI().toString());
		//ImageView imageView = new ImageView(image);

		// Estrai i colori dall'immagine
		Color[][] colors = extractColors(image);
		displayColors(colors);

		//Group root = new Group();
		//root.getChildren().add(imageView);

		//Scene scene = new Scene(root, image.getWidth(), image.getHeight());
		//primaryStage.setScene(scene);
		primaryStage.setTitle("Image Color Extractor");
		primaryStage.show();
	}

	private Color[][] extractColors(Image image) {
		int width = (int) image.getWidth();
		int height = (int) image.getHeight();

		Color[][] colors = new Color[height][width];

		// Scansione di ogni pixel dell'immagine
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				colors[y][x] = image.getPixelReader().getColor(x, y);
			}
		}

		return colors;
	}

	private void displayColors(Color[][] colors) {
		for (int y = 0; y < colors.length; y++) {
			for (int x = 0; x < colors[0].length; x++) {
				Color color = colors[y][x];

				if(color.equals(color.WHITE)) {
					colors[y][x]=color.RED;
				}
			}
		}
		controllo(colors);


	}
	private void controllo(Color[][] colors) {
		for (int y = 0; y < colors.length; y++) {
			for (int x = 0; x < colors[0].length; x++) {
				Color color = colors[y][x];
				System.out.println(color);
			}

		}
	}
		public static void main(String[] args) {
			launch(args);
		}
	}

