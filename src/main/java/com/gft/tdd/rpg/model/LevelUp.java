package com.gft.tdd.rpg.model;


public class LevelUp {
	
	public static void voidLvlUpMago(Mago mago) {
		mago.setVida(mago.getVida()+5);
		mago.setMana(mago.getMana() + 10);
		mago.setInteligencia(mago.getInteligencia() + 3);
		mago.setForca(mago.getForca() + 1);
		mago.setLevel(mago.getLevel() + 1);
	}
	
	
	
	
	
}