package it.edu.iisgubbio.fattoria;

public class Ortaggio extends Prodotto{
	boolean biologico;

	public Ortaggio(String nome, double prezzoKg, boolean biologico) {
		super(nome, prezzoKg);
		this.biologico = biologico;
	}

	@Override
	public String toString() {
		if(biologico) {
			return super.toString()+",è biologico ";
		}else {
			return super.toString()+",non è  biologico ";

		}
	}	

}
