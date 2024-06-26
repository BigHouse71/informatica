package it.edu.iisgubbio.rimessa;
import it.edu.iisgubbio.mobilità.*;

public class MezzoRimessa {

	public static void main(String[] args) {
		MezzoDiTrasporto shuttle=new MezzoDiTrasporto("space Shuttle",1000000.0);
		System.out.println(shuttle);
		System.out.println(shuttle.importRata(400));
		
		AMuscoli quadriciclo=new AMuscoli("triciclo",15,"quadricipiti" );
		System.out.println(quadriciclo);
		System.out.println(quadriciclo.parteAlta());

		AMotore elicottero= new AMotore("Elicottero",50000.0,120,"Gasolio");
		System.out.println(elicottero);
		
		Skateboard skateboard=new Skateboard("skateboard",25,91);
		System.out.println(skateboard);
		
		Bicicletta bicigletta=new Bicicletta(0, 0);
		
		bicigletta.setNumeroDiRapporti(8);
		System.out.println(bicigletta);
		
		Barca barca =new Barca("nome", 50, 50, true);
		Terrestre motocarro=new Terrestre();
		motocarro.setCarburante("gasolio");
		motocarro.setNome("motocarro di luigi");
		motocarro.setVelocità(104);
		System.out.println(motocarro);
	
		Motocicletta motoGuzzi=new Motocicletta("MotoGuzzi 345 di giovanni",2000 ,500);
		System.out.println(motoGuzzi);
		
		Motoslitta motoslitta=new Motoslitta("motoslitta di Mark", 30, 50);
		System.out.println(motoslitta);
		
		Automobile mini=new Automobile("mini di mario", 2000, 3);
		mini.setTarga("f45sd4f8");
		System.out.println(mini);
		
	}
	

}
