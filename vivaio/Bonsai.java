package it.edu.iisgubbio.vivaio;

public class Bonsai extends Pianta{
	private int eta;

	public Bonsai(String n, double c, int e) {
		super(n, c);
		eta = e;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
	public boolean vecchio() {
		return eta>20;
	}

	@Override
	public String toString() {
		return "Bonsai [costo=" + getCosto() + "]";
	}
	
}
