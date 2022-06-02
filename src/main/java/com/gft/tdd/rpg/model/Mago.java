package com.gft.tdd.rpg.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	
	Random ataqueRNG = new Random();
	
	List<String> magias = new ArrayList<String>();

	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public Mago(String nome) {
		super(nome);
	}	
	
	@Override
	public void lvlUp() {
		LevelUp.voidLvlUpMago(this);
	}

	public int attack() {
		return this.getInteligencia()*this.getLevel() + ataqueRNG.nextInt(301);
	}

	public void aprenderMagia(String magia) {
		magias.add(magia);
	}

}
