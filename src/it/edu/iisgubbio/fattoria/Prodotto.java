package it.edu.iisgubbio.fattoria;

public class Prodotto {
	protected String nome;
	protected double prezzoKg;
	public Prodotto(String nome, double prezzoKg) {
		this.nome = nome;
		this.prezzoKg = prezzoKg;
	}
	public Prodotto() {
		
	}
	public double calcolaPrezzo(double kg) {
		
		return kg*prezzoKg;
	}
	@Override
	public String toString() {
		return "Prodotto è " + nome + " e il prezzo per Kg=" + prezzoKg ;
	}
}

