package it.edu.iisgubbio.animali.cani;

public class Cuccia {
	// la cuccia come propieta : interno = è da intterno o estero,prezzo, numero dei posti, colore 

	private boolean interno;
	private double prezzo;
	private int posti;
	private String colore;
	public Cuccia(boolean interno, double prezzo, int posti, String colore) {
		this.interno = interno;
		this.prezzo = prezzo;
		this.posti = posti;
		this.colore = colore;
	}

	public Cuccia(boolean interno, double prezzo) {
		this.interno = interno;
		this.prezzo = prezzo;

	}

	public boolean isInterno() {
		return interno;
	}


	public double getPrezzo() {
		return prezzo;
	}



	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		if(posti>2) {
			posti = 2;

		}
		this.posti = posti;


	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String toString() {
		if(interno) {
			return "Il colore è"+colore+" "+"è da interno"+" " +"il prezzo è di "+prezzo+"€ "+"i posti sono "+posti+" ";

		}else {
			return "Il colore è "+colore+" "+"non è da interno"+" " +"il prezzo è di "+prezzo+"€ "+"i posti sono "+posti+" ";

		}
	}

}
