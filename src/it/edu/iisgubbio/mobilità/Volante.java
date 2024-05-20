package it.edu.iisgubbio.mobilità;

public class Volante extends AMotore{
	private double quataMassima;

	public Volante(String nome, double costo) {
		super();
		setNome(nome);
		setCosto(costo);
		this.quataMassima=2400;
	}

	public Volante() {
	}

	public double getQuataMassima() {
		return quataMassima;
	}

	public void setQuataMassima(double quataMassima) {
		this.quataMassima = quataMassima;
	}
	public boolean isNecessariaPressurizzazione() {
		return quataMassima>300;
	}

	@Override
	public String toString() {
		return "Mezzo volante: "+ nome+" ("+costo+")"+"vola fino a "+ quataMassima+"m di quota";
	}
	
	
	

}
 