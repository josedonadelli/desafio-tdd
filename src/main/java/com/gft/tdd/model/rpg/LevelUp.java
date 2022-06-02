package com.gft.tdd.model.rpg;


public class LevelUp {
		
	public static void lvlUp(Personagem personagem) {
		int bonusMana = 0, bonusInteligencia = 0; //Bonus da classe Mago
		int bonusForca = 0, bonusVida = 0; //Bonus da classe Guerreiro
		
		if(personagem.getClass() == Mago.class) {
			bonusMana = 5;
			bonusInteligencia = 2;
		}else if(personagem.getClass() == Guerreiro.class) {
			bonusVida = 5;
			bonusForca = 2;
		}
		personagem.setLevel(personagem.getLevel() + 1);
		personagem.setVida(personagem.getVida() + 5 + bonusVida);
		personagem.setMana(personagem.getMana() + 5 + bonusMana);
		personagem.setInteligencia(personagem.getInteligencia() + 1 + bonusInteligencia);
		personagem.setForca(personagem.getForca() + 1 + bonusForca);
	}
}