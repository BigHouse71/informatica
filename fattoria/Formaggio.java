package it.edu.iisgubbio.fattoria;

public class Formaggio extends Prodotto {
	protected int mese;
	protected boolean dop;
	public Formaggio(String nome, double prezzoKg, int mese) {
		super(nome, prezzoKg);
		this.mese = mese;
		this.dop = false;
	}
	public Formaggio(String nome, double prezzoKg, int mese, boolean dop) {
		super(nome, prezzoKg);
		this.mese = mese;
		this.dop = dop;
	}
	
	public int getMese() {
		return mese;
	}
	public void setMese(int mese) {
		this.mese = mese;
	}
	public boolean getDop() {
		return dop;
	}
	public void setDop(boolean dop) {
		this.dop = dop;
	}
	@Override
	public String toString() {
		String s="";
		if(dop) {
			s+= super.toString()+",è dop ";
		}else {
			s+= super.toString()+",non è  dop ";
		}
		if(mese>0) {
			s+="Stagionato per "+mese;
		}
		return s;
	}
	

	
	
}
