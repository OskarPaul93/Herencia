package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Padre padre = new Padre (5,2);
		padre.ahorrar(100);
		System.out.println("Ahorro Padre: " + padre.getTotalAhorrado());
		
		//Ahorro Hija
		
		Hija hija = new Hija (5,2);
		hija.ahorrar(100);
		System.out.println("Ahorro Hija: " + hija.getTotalAhorrado());

		//Ahorro Hijo
		
		Hijo hijo = new Hijo (5,2,1);
		hijo.ahorrar(100);
		System.out.println("Ahorro Hijo: " + hijo.getTotalAhorrado());

	}

}
