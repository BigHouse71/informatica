package it.edu.iisgubbio.mobilità;

public class Terrestre  extends AMotore{
	private double velocità;

	public Terrestre() {
		super();
	}

	public double getVelocità() {
		return velocità;
	}

	public void setVelocità(double velocità) {
		this.velocità = velocità;
	}
	
	public double tempoDipercorrenza(int distanza) {
		return  distanza/velocità;
		
	}

	@Override
	public String toString() {
		return "Veicolo terrestre a motore:"+nome+
				", va a "+getCarburante()+ " e al massimo percorre  "+velocità+"kmin'ora";
	}
	
}
