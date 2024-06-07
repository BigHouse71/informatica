package it.edu.iisgubbio.vivaio;

public class Fiore extends Pianta implements Imballabile{
	private String colore;
	private double volumeImballo;
	private int pezzoPerImballo;
	private int stagioneFioritura;
	public Fiore(String n, double c, String colore, String s) {
		super(n, c);
		this.colore = colore;
		setStagioneFioritura(s);
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getStagioneFioritura() {
		String s="";
		switch (stagioneFioritura) {
		case 2:
			s= "Estate";
			break;
		case 3:
			s= "Autunno";
			break;
		case 1:
			s= "Primavera";
			break;
		case 4:
			s= "autunno";
		}
		return s;
	}
	public void setStagioneFioritura(String s) {
		switch (s) {
		case "Estate":
			stagioneFioritura=2;
			break;
		case "Autunno":
			stagioneFioritura=3;
			break;
		case"Primavera":
			stagioneFioritura=1;
			break;
		case"Inverno":
			stagioneFioritura=4;
			break;
		}
	}

	
	public void setVolumeImballo(double volume) {
		this.volumeImballo = volume;
	}
	public int getQuantità() {
		return pezzoPerImballo;
	}
	public void setQuantità(int quantita) {
		this.pezzoPerImballo = quantita;
	}
	public void setPezziPerImballo(int n) {
		if(n%12==0) {
			pezzoPerImballo=n;
		}
	}
	@Override
	public double getVolumeImballo() {
		return volumeImballo ;
	}
	@Override
	public int getPezziPerImballo() {
		return pezzoPerImballo;
	}
	@Override
	public int dozzine() {
		return getPezziPerImballo()/12 ;
	}

}
