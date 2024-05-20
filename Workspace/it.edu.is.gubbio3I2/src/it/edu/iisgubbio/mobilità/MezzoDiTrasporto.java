package it.edu.iisgubbio.mobilità;

public class MezzoDiTrasporto {
	protected double costo;
	protected String nome;
	public MezzoDiTrasporto( String nome,double costo) {
		super();
		this.costo = costo;
		this.nome = nome;
	}
	
	public MezzoDiTrasporto( ) {
		super();

	}

	@Override
	public String toString() {
		return "MezzoDiTrasporto "+nome +" ,"+ costo+"€";
	}

	public double importRata(int numeroRata) {
		return costo/numeroRata;
	}
	
	
	
	
	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
