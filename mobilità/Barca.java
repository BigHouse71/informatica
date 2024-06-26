package it.edu.iisgubbio.mobilità;

public class Barca extends AMuscoli{
	private int numeroDiRemi;
	private boolean singoloRemo;
	public Barca(String nome, double costo,int numeroDiRemi, boolean singoloRemo) {
		super(nome, costo, "bicipiti");
		this.numeroDiRemi = numeroDiRemi;
		this.singoloRemo = singoloRemo;
	}
	public int getNumeroDiRemi() {
		return numeroDiRemi;
	}
	
	public boolean isSingoloRemo() {
		return singoloRemo;
	}
	
	
	public int numeroVogatori() {
		int vagatori;
		if(singoloRemo) {
			vagatori=numeroDiRemi;
		}else {
			vagatori=numeroDiRemi/2;
		}
		return vagatori;
	}
	@Override
	public String toString() {
		return "Barca "+nome+" con remi "+numeroDiRemi+"("+numeroVogatori()+" per vagatore)";
	}
	
	


}
