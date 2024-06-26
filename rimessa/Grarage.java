package it.edu.iisgubbio.rimessa;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import it.edu.iisgubbio.mobilità.*;

public class Grarage extends Application {
	GridPane griglia=new GridPane();
	TextField c1=new TextField();
	TextField c2=new TextField();
	TextField c3=new TextField();
	TextField c4=new TextField();
	TextField c5=new TextField ();
	TextField c6=new TextField();
	TextField c7=new TextField();
	Label e1=new Label("");
	Label e2=new Label("");
	Label e3=new Label("");
	Label e4=new Label("");
	Label e5=new Label ("");
	Label e6=new Label();
	Label e7=new Label();
	RadioButton bSingoloRemoTrue=new RadioButton("Si");
	RadioButton bSingoloRemoFalse=new RadioButton("No");
	ToggleGroup genere = new ToggleGroup();

	Button bAggiungi=new Button("Aggiungi");
	Label eScegli=new Label("Scegli opzione ->");
	ComboBox<String> box=new ComboBox<>();
	ListView<MezzoDiTrasporto> lista =new ListView<>();
	@Override
	public void start(Stage primaryStage) throws Exception {
		griglia.add(lista, 0, 0,1,15);
		griglia.add(eScegli, 1, 1);

		bSingoloRemoTrue.setToggleGroup(genere);
		bSingoloRemoFalse.setToggleGroup(genere);

		griglia.add(e1, 1, 2);
		griglia.add(e2,1,3);
		griglia.add(e3,1,4);
		griglia.add(e4, 1, 5);
		griglia.add(e5,1,6);
		griglia.add(e6,1,7);
		griglia.add(e7,1,8);

		griglia.add(box, 2, 1);

		griglia.add(c1, 2, 2,2,1);
		griglia.add(c2,2,3,2,1);
		griglia.add(c3,2,4,2,1);
		griglia.add(c4,2, 5,2,1);
		griglia.add(c5,2,6,2,1);
		griglia.add(c6, 2, 7,2,1);
		griglia.add(c7, 2, 8,2,1);
		griglia.add(bAggiungi, 2, 9,2,1);

		griglia.setVgap(20);
		griglia.setHgap(20);
		griglia.setAlignment(Pos.CENTER);
		box.getItems().add("Skateboard");
		box.getItems().add("Barca");
		box.getItems().add("Bicicletta");
		box.getItems().add("Automobile");
		box.getItems().add("MotoCicletta");
		box.getItems().add("Motoslitta");
		box.getItems().add("Deltaplano");
		box.getItems().add("Aereo");

		box.setOnAction(e->veicolo());
		bAggiungi.setOnAction(e->aggiungi());
		lista.addEventHandler(MouseEvent.MOUSE_CLICKED, e-> click(e));
		Scene scena=new Scene(griglia);
		primaryStage.setScene(scena);
		primaryStage.show();
	}
	public void click(MouseEvent x) {
		if(x.getClickCount()==2) {
			int indiceSelezionato = lista.getSelectionModel().getSelectedIndex();

			MezzoDiTrasporto mezzoScelto = lista.getItems().get(indiceSelezionato);
			if(mezzoScelto instanceof Skateboard c) {
				box.setValue("Skateboard");
				if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c5,2,6);
				}else {
					if(griglia.getChildren().contains(bSingoloRemoFalse)) {
						griglia.getChildren().remove(bSingoloRemoTrue);
						griglia.getChildren().remove(bSingoloRemoFalse);
						griglia.add(c4,2,5);
					}

				}
				c1.setText(c.getNome());
				c2.setText(""+c.getCosto());
				c3.setText(""+c.getLungezza());
				c4.setText(c.getMuscoliCoinvolti());
				e3.setText("Lungezza");
				e4.setText("muscoliCoinvolti");
				e5.setText("");
				e6.setText("");
				e7.setText("");
				c5.setDisable(true);
				c7.setDisable(true);
				c6.setDisable(true);
			
			}
			if(mezzoScelto instanceof Barca c) {
				box.setValue("Barca");
				if(griglia.getChildren().contains(bSingoloRemoFalse)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.getChildren().remove(c5);
					griglia.getChildren().remove(c4);
					griglia.add(c4, 2, 5);
					griglia.add(bSingoloRemoTrue, 2, 6);
					griglia.add(bSingoloRemoFalse, 3, 6);
				}else {
					griglia.getChildren().remove(c5);
					griglia.add(bSingoloRemoTrue, 2, 6);
					griglia.add(bSingoloRemoFalse, 3, 6);
				}
				c1.setText(c.getNome());
				c2.setText(""+c.getCosto());
				c3.setText(""+c.getNumeroDiRemi());
				c4.setText(c.getMuscoliCoinvolti());
				e3.setText("NumeroRemi");
				e5.setText("SingoloRemo");
				e4.setText("muscoliCoinvolti");
				e6.setText("");
				e7.setText("");
				c6.setDisable(false);
				c6.setDisable(true);
				c7.setDisable(true);
				
			}
	

			if(mezzoScelto instanceof Bicicletta c) {
				box.setValue("Bicicletta");

				
				
				if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c5,2,6);
				}else {
					if(griglia.getChildren().contains(bSingoloRemoFalse)) {
						griglia.getChildren().remove(bSingoloRemoTrue);
						griglia.getChildren().remove(bSingoloRemoFalse);
						griglia.add(c4,2,5);
					}

				}
				c1.setText(c.getNome());
				c2.setText(""+c.getCosto());
				c3.setText(""+c.getNumeroDiRapporti());
				c4.setText(""+c.getPeso());
				c5.setText(c.getMuscoliCoinvolti());
				e3.setText("Numero rapporti");
				e4.setText("peso");
				e5.setText("muscoli coinvolti");
				e7.setText("");
				e6.setText("");

				c5.setDisable(false);
				c6.setDisable(false);
				c7.setDisable(false);
			}
			if(mezzoScelto instanceof Automobile c) {
				box.setValue("Automobile");
				if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c5,2,6);
				}else {
					if(griglia.getChildren().contains(bSingoloRemoFalse)) {
						griglia.getChildren().remove(bSingoloRemoTrue);
						griglia.getChildren().remove(bSingoloRemoFalse);
						griglia.add(c4,2,5);
					}

				}
				c1.setText(c.getNome());
				c2.setText(""+c.getCosto());
				c3.setText(""+c.getRumorosità());
				c4.setText(""+c.getVelocità());
				c5.setText(""+c.getNumeroPorte());
				c6.setText(""+c.getTarga());
				c7.setText(c.getCarburante());
				e3.setText("ruborosita");
				e4.setText("velocità");
				e5.setText("Porte");
				e6.setText("Targa");
				e7.setText("Carburante");
				c5.setDisable(false);
				c6.setDisable(false);
				c7.setDisable(false);
				
			}
			if(mezzoScelto instanceof Motocicletta c) {
				box.setValue("Motocicletta");
				if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c5,2,6);
				}else {
					if(griglia.getChildren().contains(bSingoloRemoFalse)) {
						griglia.getChildren().remove(bSingoloRemoTrue);
						griglia.getChildren().remove(bSingoloRemoFalse);
						griglia.add(c4,2,5);
					}

				}
				c1.setText(c.getNome());
				c2.setText(""+c.getCosto());
				c3.setText(""+c.getCilindrata());
				c4.setText(""+c.getVelocità());
				c5.setText(""+c.getRumorosità());
				c6.setText(c.getCarburante());
				c7.setText(""+c.getNumeroPosti());
				e3.setText("Cilindrata");
				e4.setText("velocità");
				e5.setText("rumorosità");
				e6.setText("Carburante");
				e7.setText("NumeroPosti");
				c5.setDisable(false);
				c6.setDisable(false);
				c7.setDisable(false);
			}
			
			if(mezzoScelto instanceof Motoslitta c) {
				box.setValue("Motoslitta");

				if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c5,2,6);
				}else {
					if(griglia.getChildren().contains(bSingoloRemoFalse)) {
						griglia.getChildren().remove(bSingoloRemoTrue);
						griglia.getChildren().remove(bSingoloRemoFalse);
						griglia.add(c4,2,5);
					}

				}
				c1.setText(c.getNome());
				c2.setText(""+c.getCosto());
				c3.setText(""+c.getRumorosità());
				c4.setText(""+c.getVelocità());
				c5.setText(""+c.getTemperaturaMinima());
				c6.setText(c.getCarburante());
				e3.setText("rumorosita");
				e4.setText("velocità");
				e5.setText("temperatura minima");
				e6.setText("Carburante");
				c5.setDisable(false);
				c6.setDisable(false);
				e7.setText("");
				c7.setDisable(true);
			}
			
			if(mezzoScelto instanceof Deltaplano c) {
				box.setValue("Deltaplano");

				
				if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c5,2,6);
				}else {
					if(griglia.getChildren().contains(bSingoloRemoFalse)) {
						griglia.getChildren().remove(bSingoloRemoTrue);
						griglia.getChildren().remove(bSingoloRemoFalse);
						griglia.add(c4,2,5);
					}

				}
				c1.setText(c.getNome());
				c2.setText(""+c.getCosto());
				c3.setText(""+c.getNumeroposti());
				c4.setText(c.getCarburante());
				c5.setText(""+c.getQuataMassima());
				c6.setText(""+c.getRumorosità());
				e3.setText("numero posti");
				e4.setText("Carburante");
				e5.setText("Quaota massima");
				e6.setText("Rumorosità");
				e7.setText("");
				c5.setDisable(false);
				c6.setDisable(false);
				c7.setDisable(true);
			}
			
			if(mezzoScelto instanceof Aereo c) {
				box.setValue("Aereo");

				
				if(griglia.getChildren().contains(bSingoloRemoFalse)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.getChildren().remove(c5);
					griglia.getChildren().remove(c4);
					griglia.add(c4, 2, 5);
					griglia.add(bSingoloRemoTrue, 2, 6);
					griglia.add(bSingoloRemoFalse, 3, 6);
				}else {
					griglia.getChildren().remove(c5);
					griglia.add(bSingoloRemoTrue, 2, 6);
					griglia.add(bSingoloRemoFalse, 3, 6);
				}
				if(c.isReazione()) {
					bSingoloRemoTrue.setSelected(true);
				}else {
					bSingoloRemoTrue.setSelected(false);

				}
				if(griglia.getChildren().contains(bSingoloRemoFalse)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.getChildren().remove(c5);
					griglia.getChildren().remove(c4);
					griglia.add(c4, 2, 5);
					griglia.add(bSingoloRemoTrue, 2, 6);
					griglia.add(bSingoloRemoFalse, 3, 6);
				}else {
					griglia.getChildren().remove(c5);
					griglia.add(bSingoloRemoTrue, 2, 6);
					griglia.add(bSingoloRemoFalse, 3, 6);
				}
				c1.setText(c.getNome());
				c2.setText(""+c.getCosto());
				c3.setText(c.getCarburante());
				c4.setText(""+c.getDistanzaMassima());
				c6.setText(""+c.getQuataMassima());
				c7.setText(""+c.getRumorosità());
				e3.setText("carburante");
				e4.setText("Distanza massima");
				e6.setText("Quata Massima");
				e5.setText("Reazione");
				e7.setText("rumorosità");
				c5.setDisable(false);
				c6.setDisable(false);
				c7.setDisable(false);
			}


			lista.getItems().remove(indiceSelezionato);
		}


	}
	public void aggiungi() {
		String muscoli;

		String selezione= box.getValue();
		switch(selezione) {
		case "Deltaplano":
			Deltaplano deltaplano=new Deltaplano(c1.getText(), Double.parseDouble(c2.getText()), Integer.parseInt(c3.getText()));
			deltaplano.setCarburante(c4.getText());
			deltaplano.setQuataMassima(Double.parseDouble(c5.getText()));
			deltaplano.setRumorosità(Double.parseDouble(c6.getText()));
			lista.getItems().add(deltaplano);
			break;

		case"Aereo":
			Aereo aereo=new Aereo(c1.getText());
			aereo.setCosto(Double.parseDouble(c2.getText()));
			aereo.setCarburante(c3.getText());
			aereo.setDistanzaMassima(Integer.parseInt(c4.getText()));
			aereo.setReazione(bSingoloRemoTrue.isSelected());
			aereo.setQuataMassima(Double.parseDouble(c6.getText()));
			aereo.setRumorosità(Double.parseDouble(c7.getText()));
			lista.getItems().add(aereo);
			break;

		case"Skateboard":
			muscoli=c4.getText();
			Skateboard skate=new Skateboard(c1.getText(), Double.parseDouble(c2.getText()),Integer.parseInt(c3.getText()));
			skate.setMuscoliCoinvolti(muscoli);
			lista.getItems().add(skate);
			break;
		case "Barca":
			Barca barca=new Barca(c1.getText(), Double.parseDouble(c2.getText()),Integer.parseInt(c3.getText()),bSingoloRemoTrue.isSelected());
			muscoli=c4.getText();
			barca.setMuscoliCoinvolti(muscoli);
			lista.getItems().add(barca);
			break;
		case"Bicicletta":
			Bicicletta bici=new Bicicletta(Double.parseDouble(c2.getText()),Integer.parseInt(c4.getText()));
			bici.setNome(c1.getText());
			bici.setNumeroDiRapporti(Integer.parseInt(c3.getText()));
			muscoli=c5.getText();
			bici.setMuscoliCoinvolti(muscoli);
			lista.getItems().add(bici);
			break;
		case"Automobile":
			Automobile auto=new Automobile(c1.getText(), Double.parseDouble(c2.getText()),Integer.parseInt(c5.getText()));
			auto.setCarburante(c7.getText());
			auto.setRumorosità(Double.parseDouble(c3.getText()));
			auto.setTarga(c6.getText());
			auto.setVelocità(Double.parseDouble(c4.getText()));
			lista.getItems().add(auto);
			break;
		case"MotoCicletta":
			Motocicletta moto=new Motocicletta(c1.getText(), Double.parseDouble(c2.getText()),Double.parseDouble(c3.getText()));
			moto.setCarburante(c6.getText());
			moto.setNumeroPosti(Integer.parseInt(c7.getText()));
			moto.setRumorosità(Double.parseDouble(c5.getText()));
			moto.setVelocità(Double.parseDouble(e4.getText()));
			lista.getItems().add(moto);
			break;
			
		case"Motoslitta":
			Motoslitta slitta=new Motoslitta(c1.getText(), Double.parseDouble(c2.getText()), Double.parseDouble(c4.getText()));
			slitta.setCarburante(c6.getText());
			slitta.setRumorosità(Double.parseDouble(c3.getText()));
			slitta.setTemperaturaMinima(Double.parseDouble(c7.getText()));
			lista.getItems().add(slitta);
			break;

		}
		bSingoloRemoTrue.setSelected(false);
		bSingoloRemoFalse.setSelected(false);
		c1.setText("");
		c2.setText("");
		c3.setText("");
		c4.setText("");
		c5.setText("");
		c6.setText("");
		c7.setText("");



	}


	public void veicolo() {
		c1.setText("");
		c2.setText("");
		c3.setText("");
		c4.setText("");
		c5.setText("");
		c6.setText("");
		c7.setText("");
		bSingoloRemoTrue.setSelected(false);
		bSingoloRemoFalse.setSelected(false);
		c5.setDisable(false);
		c6.setDisable(false);
		c7.setDisable(false);
		String t = box.getValue();
		e1.setText("nome");
		e2.setText("costo");
		switch (t){

		case"Aereo":
			if(griglia.getChildren().contains(bSingoloRemoFalse)) {
				griglia.getChildren().remove(bSingoloRemoTrue);
				griglia.getChildren().remove(bSingoloRemoFalse);
				griglia.getChildren().remove(c5);
				griglia.getChildren().remove(c4);
				griglia.add(c4, 2, 5);
				griglia.add(bSingoloRemoTrue, 2, 6);
				griglia.add(bSingoloRemoFalse, 3, 6);
			}else {
				griglia.getChildren().remove(c5);
				griglia.add(bSingoloRemoTrue, 2, 6);
				griglia.add(bSingoloRemoFalse, 3, 6);
			}
			e3.setText("carburante");
			e4.setText("Distanza massima");
			e6.setText("Quata Massima");
			e5.setText("Reazione");
			e7.setText("rumorosità");
			break;

		case"Deltaplano":

			if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
				griglia.getChildren().remove(bSingoloRemoTrue);
				griglia.getChildren().remove(bSingoloRemoFalse);
				griglia.add(c5,2,6);
			}else {
				if(griglia.getChildren().contains(bSingoloRemoFalse)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c4,2,5);
				}

			}
			e3.setText("numero posti");
			e4.setText("Carburante");
			e5.setText("Quaota massima");
			e6.setText("Rumorosità");
			e7.setText("");
			c7.setDisable(true);

			break;

		case "Barca":
			if(griglia.getChildren().contains(bSingoloRemoFalse)) {
				griglia.getChildren().remove(bSingoloRemoTrue);
				griglia.getChildren().remove(bSingoloRemoFalse);
				griglia.getChildren().remove(c5);
				griglia.getChildren().remove(c4);
				griglia.add(c4, 2, 5);
				griglia.add(bSingoloRemoTrue, 2, 6);
				griglia.add(bSingoloRemoFalse, 3, 6);
			}else {
				griglia.getChildren().remove(c5);
				griglia.add(bSingoloRemoTrue, 2, 6);
				griglia.add(bSingoloRemoFalse, 3, 6);
			}


			e3.setText("NumeroRemi");
			e5.setText("SingoloRemo");
			e4.setText("muscoliCoinvolti");
			e6.setText("");
			e7.setText("");
			c7.setDisable(true);
			c6.setDisable(true);

			break;
		case "Automobile":
			if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
				griglia.getChildren().remove(bSingoloRemoTrue);
				griglia.getChildren().remove(bSingoloRemoFalse);
				griglia.add(c5,2,6);
			}else {
				if(griglia.getChildren().contains(bSingoloRemoFalse)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c4,2,5);
				}

			}

			e3.setText("ruborosita");
			e4.setText("velocità");
			e5.setText("Porte");
			e6.setText("Targa");
			e7.setText("Carburante");
			break;
		case "MotoCicletta":
			if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
				griglia.getChildren().remove(bSingoloRemoTrue);
				griglia.getChildren().remove(bSingoloRemoFalse);
				griglia.add(c5,2,6);
			}else {
				if(griglia.getChildren().contains(bSingoloRemoFalse)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c4,2,5);
				}

			}
			e3.setText("Cilindrata");
			e4.setText("velocità");
			e5.setText("rumorosità");
			e6.setText("Carburante");
			e7.setText("NumeroPosti");
			break;
		case "Skateboard":
			if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
				griglia.getChildren().remove(bSingoloRemoTrue);
				griglia.getChildren().remove(bSingoloRemoFalse);
				griglia.add(c5,2,6);
			}else {
				if(griglia.getChildren().contains(bSingoloRemoFalse)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c4,2,5);
				}

			}
			e3.setText("Lungezza");
			e4.setText("Muscolo coinvolto");
			e5.setText("");
			e7.setText("");
			e6.setText("");
			c5.setDisable(true);
			c6.setDisable(true);
			c7.setDisable(true);
			break;
		case "Motoslitta":
			if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
				griglia.getChildren().remove(bSingoloRemoTrue);
				griglia.getChildren().remove(bSingoloRemoFalse);
				griglia.add(c5,2,6);
			}else {
				if(griglia.getChildren().contains(bSingoloRemoFalse)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c4,2,5);
				}

			}
			e3.setText("rumorosita");
			e4.setText("velocità");
			e5.setText("temperatura minima");
			e6.setText("Carburante");
			e7.setText("");
			c7.setDisable(true);
			break;
		case "Bicicletta":
			if(griglia.getChildren().contains(bSingoloRemoFalse)&& griglia.getChildren().contains(c4)) {
				griglia.getChildren().remove(bSingoloRemoTrue);
				griglia.getChildren().remove(bSingoloRemoFalse);
				griglia.add(c5,2,6);
			}else {
				if(griglia.getChildren().contains(bSingoloRemoFalse)) {
					griglia.getChildren().remove(bSingoloRemoTrue);
					griglia.getChildren().remove(bSingoloRemoFalse);
					griglia.add(c4,2,5);
				}

			}
			e3.setText("Numero rapporti");
			e4.setText("peso");
			e5.setText("muscoli coinvolti");
			e7.setText("");
			c7.setDisable(true);
			e6.setText("");
			c6.setDisable(true);
			break;
		}

	}
	public static void main(String[] args) {
		launch(args);
	}
}
