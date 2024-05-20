package it.edu.iisgubbio.animali.cani;

public class Canile {
	
	
	public static void main(String[] args) {
		Cane caneGiulia;
		caneGiulia=new Cane("Athena",2021);
		caneGiulia.razza="bovaro del bernese";
		System.out.println(caneGiulia);
		caneGiulia.annoNascita++;
		System.out.println(caneGiulia.annoNascita);

	}

}
