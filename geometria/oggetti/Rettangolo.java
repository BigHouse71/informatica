package it.edu.iisgubbio.geometria.oggetti;

public class Rettangolo {
	int base;
	int altezza;
	public Rettangolo(int base, int altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}
	public int area() {
		return base*altezza;
	}
	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
	}
	
}
