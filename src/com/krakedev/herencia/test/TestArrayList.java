package com.krakedev.herencia.test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Hija> listaDeHijas = new ArrayList<Hija>();
		
		//Hija 1
		Hija hija1= new Hija(2,3);
		
		hija1.setDefectos(2);
		hija1.setVirtudes(4);
		
		listaDeHijas.add(hija1);
		
		
		//Hija 2
		Hija hija2= new Hija(5,6);
		
		hija2.setDefectos(6);
		hija2.setVirtudes(1);
		
		listaDeHijas.add(hija2);
		
		//Hija 3
		Hija hija3= new Hija(1,4);
				
		hija3.setDefectos(6);
		hija3.setVirtudes(1);
				
		listaDeHijas.add(hija3);
		
		System.out.println(listaDeHijas);
	}

}
