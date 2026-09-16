package com.krakedev.herencia;

public class Hijo extends Padre {
	private int juguetes;
	
	public Hijo (int virtudes, int defectos, int juguetes) {
		super (virtudes, defectos);
		this.juguetes = juguetes;
	}

	@Override
	public String toString() {
	    return "Hijo [virtudes=" + getVirtudes() 
	            + ", defectos=" + getDefectos() 
	            + ", juguetes=" + juguetes + "]";
	}
	
	@Override
	public void ahorrar (double monto) {
		super.ahorrar(monto* 0.5);
	}

	
	
	

}
