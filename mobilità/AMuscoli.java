package it.edu.iisgubbio.mobilità;

public class AMuscoli extends MezzoDiTrasporto {
	private String muscoliCoinvolti;

	public AMuscoli(String nome, double costo, String muscoliCoinvolti) {
		super(nome, costo);
		this.muscoliCoinvolti = muscoliCoinvolti;
	}
	public boolean parteAlta() {
		boolean parteAlta;
		if(muscoliCoinvolti.equals("Trapaezio")) {
			parteAlta=true;
		}else {
			parteAlta=false;
		}
		return parteAlta;
	}
	
	@Override
	public String toString() {
		return "Veicolo a muscoli:"+nome+","+costo+"(" + muscoliCoinvolti+ ")";
	}
	public String getMuscoliCoinvolti() {
		return muscoliCoinvolti;
	}
	public void setMuscoliCoinvolti(String muscoliCoinvolti){
		if(muscoliCoinvolti.toLowerCase().equals(muscoliCoinvolti)) {
		this.muscoliCoinvolti = muscoliCoinvolti;
		}
	}
	
	
}
