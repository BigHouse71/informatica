package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Triangoli extends Application{
	
	TextField cPrimo=new TextField();
	TextField cSecondo=new TextField();
	TextField cTerzo=new TextField();
	Label eTriangolo=new Label();
	Button bTipo=new Button("Trova Tipo");
	GridPane griglia =new GridPane();
	
	
	public void start(Stage finestra) {
		griglia.add(cPrimo, 0, 0);
		griglia.add(cSecondo, 1, 0);
		griglia.add(cTerzo, 2, 0);
		griglia.add(bTipo,0,1,3,1);
		griglia.add(eTriangolo, 1, 2,3,1);
		Scene scena = new Scene(griglia,500,500);
		finestra.setTitle("trinagoli");
	    finestra.setScene(scena);
	    finestra.show();
	    cPrimo.setMinWidth(25);
	    bTipo.setMinWidth(490);
	    griglia.setPadding(new Insets(10, 10, 10, 10));
	    griglia.setHgap(20); 
	    griglia.setVgap(40);
	    bTipo.setOnAction(e -> tipo());
	}
	public void tipo() {
		int lato1=Integer.parseInt(cPrimo.getText());
		int lato2=Integer.parseInt(cSecondo.getText());
		int lato3=Integer.parseInt(cTerzo.getText());
		String risp;
		if(lato1+lato2>lato3 && lato2+lato3>lato1 && lato1+lato3>lato2){
			if((lato1*4)+(lato2*4)==(lato3*4)) {
				risp="Retangolo";
				if(lato1==lato2 || lato1==lato3) {
					if(lato2==lato3) {
						eTriangolo.setText(risp+" equilatero");
					}else {
						eTriangolo.setText(risp+" isocele");
					}
					
				}else if(lato3==lato2) {
					eTriangolo.setText(risp+" iscoscele");
				}else{
					eTriangolo.setText(risp+" scaleno");
				}
			
			}else if(lato1==lato2 || lato1==lato3) {
				if(lato2==lato3) {
					eTriangolo.setText("equilatero");
				}else {
					eTriangolo.setText("isocele");
				}
				
			}else if(lato3==lato2) {
				eTriangolo.setText("iscoscele");
			}else{
				eTriangolo.setText("scaleno");
			}
		}else {
			eTriangolo.setText("Non è un trinagolo");
		}
			
			
		
		
		
	
			
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
