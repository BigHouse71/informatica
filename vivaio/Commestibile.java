package it.edu.iisgubbio.vivaio;

public class Commestibile extends Pianta implements Imballabile{
	private int quantità;
	private double volume;
	private int stagioneProduzione;
	public Commestibile(String n, Double c) {
		super(n, c);
		// TODO Auto-generated constructor stub
	}
	public int getQuantità() {
		return quantità;
	}
	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	public int getStagioneProduzione() {
		return stagioneProduzione;
	}
	public void setStagioneProduzione(int stagioneProduzione) {
		this.stagioneProduzione = stagioneProduzione;
	}
	
	public double getVolumeSingolaQuantità() {
		return volume;
	}
	public void getVolumeSingolaQuantità(double volume) {
		this.volume = volume;
	}
	@Override
	public double getVolumeImballo() {
		return volume*quantità;
	}
	@Override
	public int getPezziPerImballo() {
		return quantità;
	}
	@Override
	public int dozzine() {
		// TODO Auto-generated method stub
		return getPezziPerImballo()/12 ;
	}
	@Override
	public String toString() {
		return "Commestibile [quantità=" + quantità + ", stagioneProduzione=" + stagioneProduzione + "]";
	}
}
