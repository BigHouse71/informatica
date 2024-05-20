package it.edu.iisgubbio.mobilità;

public class Deltaplano extends Volante{
	private int numeroposti;

	public Deltaplano(String nome, double costo, int numeroposti) {
		super(nome, costo);
		this.numeroposti = numeroposti;
	}

	public int getNumeroposti() {
		return numeroposti;
	}

	public void setNumeroposti(int numeroposti) {
		this.numeroposti = numeroposti;
	}
	public boolean accettaPasseggero() {
		return numeroposti>1;
	}

	@Override
	public String toString() {
		String s="Deltaplano:";
		if(accettaPasseggero()) {
			s+="a "+numeroposti;
		}else {
			s+="monoposto";
		}
		return s;
	}
	
}
