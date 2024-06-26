package it.edu.iisgubbio.mobilità;

public class Aereo extends Volante {
	private boolean reazione ;
	private int distanzaMassima;
	public Aereo(String nome) {
		super();
		setNome(nome);
		
	}
	public boolean isReazione() {
		return reazione;
	}
	public void setReazione(boolean reazione) {
		this.reazione = reazione;
	}
	public int getDistanzaMassima() {
		return distanzaMassima;
	}
	public void setDistanzaMassima(int distanzaMassima) {
		this.distanzaMassima = distanzaMassima;
	}
	
	public boolean puoRaggiungere(int dist){
		return distanzaMassima>dist;
	}
	@Override
	public String toString() {
		return "Aereo: "+nome+" percorre massimo "+distanzaMassima+"Km";
	}
	
	
	}

