package it.edu.iisgubbio.oggetti.tempo;


public class Orario{
	private int ora;
	private int minuto;
	private int secondo;
	public Orario(int ora, int minuto, int secondo) {
		this.ora = ora;
		this.minuto = minuto;
		this.secondo = secondo;
	}


	public void addOre(int ora) {
		this.ora+=ora;
	}
	public void addMinuti(int minuto) {
		this.minuto+=minuto;

		if(this.minuto+minuto>=60) {
			ora++;
			this.minuto+=-60;
		}
	}
	public void addSecondo(int secondo) {
		this.secondo+=secondo;
		if(this.secondo+secondo>=60) {
			addMinuti(this.secondo/60);
			this.secondo=this.secondo%60;
		}

	}
	public void addOrario(Orario daAggiungere) {

		ora+=daAggiungere.ora;

		addMinuti(daAggiungere.minuto);

		addSecondo(daAggiungere.secondo);
	}
	public void tic() {
		addSecondo(1);
	}

	@Override
	public String toString() {
		String testo="";

		if(ora>=10) {
			testo+="Orario ["+ora+":";
		}else {
			testo+="Orario ["+"0"+ora+":";
		}
		if(minuto>=10) {
			testo+=minuto+":";
		}else {
			testo+="0"+minuto+":";
		}
		if(secondo>=10) {
			testo+=secondo+"]";
		}else {
			testo+="0"+secondo+"]";
		}
		return testo;
	}



}
