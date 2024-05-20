package it.edu.iisgubbio.mobilità;

public class Skateboard extends AMuscoli {
	private int lungezza;

	public Skateboard(String nome, double costo,int lungezza) {
		super(nome, costo, "polpacci");
		this.lungezza = lungezza;
	}

	public Skateboard(String nome, double costo) {
		super(nome, costo, "polpacci");
	}

	public int getLungezza() {
		return lungezza;
	}

	public void setLungezza(int lungezza) {
		this.lungezza = lungezza;
	}
	
	public boolean longboard() {
		 return lungezza>90;
	}

	@Override
	public String toString() {
		if(longboard()) {
		return "Skateboard longboard: lungo " + lungezza + "cm"+"  costa "+ costo+"€";
		}else {
			return "Skateboard: lungo " + lungezza + "cm"+"  costa "+ costo+"€";

		}
		
		
		}
		
		
		
	
	
}
