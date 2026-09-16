package com.krakedev.herencia;

public class Hija extends Padre{
	
	public Hija (int virtudes, int defectos) {
		super (virtudes, defectos);
	}
	
	public void escucharBadB() {
		System.out.println("Escuchando esta musica");
	}

	@Override
	public String toString() {
		return "Derfectos: " + getDefectos() + " Virtudes: " + getVirtudes();
				
	}

	
	
}
