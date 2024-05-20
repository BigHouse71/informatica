package it.edu.iisgubbio.fattoria;

public class Muffa extends Formaggio{
	String nomeMuffa;
	boolean fuori;
	
	

	public Muffa(String nome, double prezzoKg,String nomeMuffa) {
		super(nome, prezzoKg, 0, false);
		this.nomeMuffa=nomeMuffa;
		this.fuori=true;
	}

	public String getNomeMuffa() {
		return nomeMuffa;
	}

	public void setNomeMuffa(String nomeMuffa) {
		this.nomeMuffa = nomeMuffa;
	}

	public boolean isFuori() {
		return fuori;
	}

	public void setFuori(boolean fuori) {
		this.fuori = fuori;
	}

	@Override
	public String toString() {
		String s= super.toString()+"nome della muffa è" + nomeMuffa+" La muffa è interna" ;
		return s;
	
	}
	
	
}
