package it.edu.iisgubbio.animali.cani.test;

import it.edu.iisgubbio.animali.cani.Cane;
import it.edu.iisgubbio.animali.cani.Cuccia;

public class ProvaAnimali {

	public static void main(String[] args) {
		Cane caneGiulia;
		caneGiulia=new Cane("Athena",2021);
		caneGiulia.setRazza("bovaro del bernese");
		System.out.println(caneGiulia);
		caneGiulia.setAnnoNascita(caneGiulia.getAnnoNascita()+1);
		System.out.println(caneGiulia.getAnnoNascita());
		
		Cuccia cucciaAthena;
		cucciaAthena=new Cuccia(false,12.3,2, "Bianca");
		System.out.println(cucciaAthena);

	}

}
