package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	
//	@Override
//	public String toString() {
//		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
//	}
	

	
	
//	public Padre () {
//		System.out.println("Soy el constructor vacio del padre");
//	}
	
	public Padre (int virtudes, int defectos) {
		this.defectos= defectos;
		this.virtudes = virtudes;
		
	}
	
	@Override
	public String toString() {
		return "Padre [defectos=" + defectos 
				+ ", virtudes=" + virtudes 
				+ ", totalAhorrado=" + totalAhorrado + "]";
	}

	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	
	
	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}

	public void imprimir() {
		System.out.println("Virtudes: " + virtudes);
		System.out.println("Defectos: " + defectos);
	}
	
	public void ahorrar (double monto) {
		totalAhorrado += monto;
	}
		
	public void guardarSecreto () {
		System.out.println("Esto no se hereda");
	}
		
	
	
	

}
