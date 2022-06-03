package com.gft.tdd.rpg.model;

import java.util.Random;

public class Ataque {
	static Random ataqueRNG = new Random();
	
	public static int attack(Personagem personagem) {
		int multiplicador = 1;
		
		if(personagem.getClass() == Mago.class)		//Se for mago
			multiplicador = personagem.getInteligencia();
		else if(personagem.getClass() == Guerreiro.class)	//Se for guerreiro
			multiplicador = personagem.getForca();
			
		return personagem.getLevel()*multiplicador + ataqueRNG.nextInt(301);
		
	}
}
