package it.edu.iisgubbio.vivaio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NegozioPiante extends Application{
	ListView<Pianta> listaSpesa =new ListView<>();
	ListView<Pianta> listaScaffale =new ListView<>();
	Button bAggiungi =new Button("Aggingi");
	GridPane griglia=new GridPane();
	Label totale=new Label();
	
	public void start(Stage primaryStage) throws Exception {
		griglia.add(listaScaffale, 0, 0,1,15);
		griglia.add(listaSpesa, 1, 0,1,15);
		griglia.add(totale, 1, 16);

		Fiore marcherita=new Fiore("Margherita",5,"Bianco","Estate");
		Fiore rosa=new Fiore("rosa",15,"rosa","Primavera");

		Bonsai acero=new Bonsai("Acero",5,15);
		Bonsai pino=new Bonsai("pino",5,15);
		listaScaffale.addEventHandler(MouseEvent.MOUSE_CLICKED, e-> scelta());
		listaSpesa.addEventHandler(MouseEvent.MOUSE_CLICKED, e-> carrello(e));

		listaScaffale.getItems().add(acero);
		listaScaffale.getItems().add(pino);
		listaScaffale.getItems().add(rosa);
		listaScaffale.getItems().add(marcherita);

		griglia.setHgap(50);
		griglia.setVgap(10);
		
		//bAggiungi.setOnAction(e->aggiungi());
		Scene scena=new Scene (griglia);
		primaryStage.setScene(scena);
		primaryStage.show();
	}
	
	
	public void carrello(MouseEvent e) {
		if(e.getClickCount()==2) {
			int  index=listaSpesa.getSelectionModel().getSelectedIndex();
			listaSpesa.getItems().remove(index);
			totale.setText(""+totale());
			
		}
		
	}
	private void  scelta() {
		Pianta appoggioNome=listaScaffale.getSelectionModel().getSelectedItem();
		listaSpesa.getItems().add(appoggioNome);
	
		totale.setText(""+totale());

	}
	public double totale() {
		double somma=0;
		/*for(int i=0;i<listaSpesa.getItems().size();i++) {
			somma+=listaSpesa.getItems().get(i).getCosto();
			
		}
		*/
		for (Pianta x: listaSpesa.getItems()) {
			somma+=x.getCosto();
		}
		return somma;
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
