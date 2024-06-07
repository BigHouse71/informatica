package it.edu.iisgubbio.vivaio;

public class Container {
	private int contatoreDelImballaggio=0;
	private double volumeMassimo;
	private double volumeDisponibile;

	private Imballabile pezzi[]=new Imballabile [100];
	public Container(double volumeMassimo) {
		super();
		this.volumeMassimo = volumeMassimo;
		volumeDisponibile=volumeMassimo;

	}
	public boolean add(Imballabile c) {
		if(volumeDisponibile>=c.getVolumeImballo()) {
			pezzi[contatoreDelImballaggio]=c;
			volumeDisponibile-=c.getVolumeImballo();
			return true;
		}else {
			return false;
		}
	
	}
	
	public int getDozzie() {
		int dozzine=0;
		for(int i=0;i<=contatoreDelImballaggio;i++) {
			dozzine+=pezzi[i].dozzine();
		}
		return dozzine;
	}





}
