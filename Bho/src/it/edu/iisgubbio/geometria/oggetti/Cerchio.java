package it.edu.iisgubbio.geometria.oggetti;

public class Cerchio {
	double raggio;
	final static double PI_GRECO=3.14;
	public Cerchio (double raggio) {
		this.raggio=raggio;
	}
	
	public double calcoloArea() {
		double area=PI_GRECO*raggio*raggio;
		return area;
	}
}
