package it.edu.iisgubbio.fattoria;

public class CalcolaPrezzo {
	public static void main(String[] args) {
		Prodotto carote=new Prodotto("carote",2.50);
		//System.out.println(carote.calcolaPrezzo(4));
		//System.out.println(carote);

		Ortaggio pomodoro=new Ortaggio("pomodoro",2.50,true);
		//System.out.println(pomodoro.calcolaPrezzo(0.5));
		//System.out.println(pomodoro);
		
		Formaggio taleggio=new Formaggio("taleggio",25,1,true);

		Formaggio ricotta=new Formaggio("ricotta",4,0);
		//System.out.println("Totale: "+taleggio.calcolaPrezzo(2));
		System.out.println(taleggio);

		//System.out.println("Totale: "+ricotta.calcolaPrezzo(2));
		System.out.println(ricotta);
		
		Muffa gorgonzola=new Muffa("gorgonzola",20,"penicillium roqueforti");
		gorgonzola.setDop(true);
		gorgonzola.setMese(3);
		System.out.println(gorgonzola);


	}
}
