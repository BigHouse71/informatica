package it.edu.iisgubbio.mobilità;

public class Automobile extends Terrestre{
	private String targa;
	private int numeroPorte;
	public Automobile(String nome,double costo, int numeroPorte) {
		super();
		setNome(nome);
		setCosto(costo);
		setRumorosità(78);
		this.numeroPorte = numeroPorte;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public int getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
	@Override
	public String toString() {
		return "Automobile: "+nome+" ["+targa+"]";
	}
	
	
	
	
}
