package it.edu.iisgubbio.oggetti.tempo;

public class ProvaOrario {

	public static void main(String[] args) {
		Orario orologio=new Orario(8,58,23);
		System.out.println(orologio);
		orologio.tic();
		System.out.println(orologio);

	}

}
