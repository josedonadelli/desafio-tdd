package com.gft.tdd.exceed.main;

import java.util.ArrayList;
import java.util.List;

import com.gft.tdd.exceed.model.Amigo;

public class RunAmigosProximos {

	public static void main(String[] args) {
		
		Amigo amigo1 = new Amigo("Pedro", 50, 50);
		Amigo amigo2 = new Amigo("Bino", 0, 0);
		Amigo amigo3 = new Amigo("Agostinho", 10, 10);
		Amigo amigo4 = new Amigo("Lineu", 12, 25);
		Amigo amigo5 = new Amigo("Bebel", 150, 100);
		
		List<Amigo> amigos = new ArrayList<Amigo>();
		
		amigos.add(amigo5);
		amigos.add(amigo4);
		amigos.add(amigo3);
		amigos.add(amigo2);
		amigos.add(amigo1);
		
		
		List<Amigo> teste = Amigo.amigosProximos(amigos, amigo5); 
		
		//amigo1.calculaHipo()
		System.out.println(amigo5.calculaDiferencaAbsoluta(amigo1));
		System.out.println(amigo5.calculaDiferencaAbsoluta(amigo2));
		System.out.println(amigo5.calculaDiferencaAbsoluta(amigo3));
		System.out.println(amigo5.calculaDiferencaAbsoluta(amigo4));
		System.out.println(amigo5.calculaDiferencaAbsoluta(amigo5));
		
		System.out.println(teste);
		
	}

}
