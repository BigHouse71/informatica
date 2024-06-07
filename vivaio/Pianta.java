package it.edu.iisgubbio.vivaio;

public class Pianta {
	private String nome;
	private Double costo;
	public Pianta(String n, Double c) {
		super();
		this.nome = n;
		this.costo = c;
	}
	public String getNome() {
		return nome;
	}
	
	public Double getCosto() {
		return costo;
	}
	@Override
	public String toString() {
		return "Pianta [nome=" + nome + ", costo=" + costo + "]";
	}
	
	
	
}
