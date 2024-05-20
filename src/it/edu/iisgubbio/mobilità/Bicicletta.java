package it.edu.iisgubbio.mobilità;

public class Bicicletta extends AMuscoli  {
	
	private int numeroDiRapporti;
	private double peso;
	public Bicicletta(double costo,double peso) {
		super("bicigletta", costo, "quadricipiti");
		this.peso=peso;
	}
	public int getNumeroDiRapporti() {
		return numeroDiRapporti;
	}
	public void setNumeroDiRapporti(int numeroDiRapporti) {
		this.numeroDiRapporti = numeroDiRapporti;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean leggera() {
		return peso<10;
	}
	@Override
	public String toString() {
		if(leggera()) {
			return "Bicicletta; pesa "+ peso + "Kg"+"(leggera)" +" costa "+costo+"€"+"(ha "+numeroDiRapporti+" rapporti)";

		}else {
			return "Bicicletta: pesa "+ peso + "Kg"+"(non è leggera)" +" costa "+costo+"€"+"(ha "+numeroDiRapporti+" rapporti)";

		}
	}
	
	
}
