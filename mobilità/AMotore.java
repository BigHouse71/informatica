package it.edu.iisgubbio.mobilità;

public class AMotore extends MezzoDiTrasporto {
	private double rumorosità;
	private String carburante;
	public AMotore(String nome,double costo,double rumorosità, String carburante) {
		super(nome,costo);
		this.rumorosità = rumorosità;
		this.carburante = carburante;
	}
	public AMotore() {
		super();

	}
	public boolean possibileCentriAbitati() {
		return rumorosità<68;
	}
	@Override
	public String toString() {
		return super.toString()+" che emette "+ rumorosità + "db di rumore e consuma " + carburante ;
	}
	public double getRumorosità() {
		return rumorosità;
	}
	public void setRumorosità(double rumorosità) {
		this.rumorosità = rumorosità;
	}
	public String getCarburante() {
		return carburante;
	}
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	




}
