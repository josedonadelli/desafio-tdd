package com.gft.tdd.model.rpg;

import java.util.ArrayList;
import java.util.List;

public class Guerreiro extends Personagem{
	private List<String> habilidades = new ArrayList<String>();
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public Guerreiro(String nome) {
		super(nome);
	}
	
	public void aprenderHabilidade(String habilidade) {
		habilidades.add(habilidade);
	}
	
	public List<String> getHabilidades(){
		return habilidades;
	}

	@Override
	public String toString() {
		return "Guerreiro [getNome()=" + getNome() + ", getVida()=" + getVida() + ", getMana()=" + getMana()
				+ ", getXp()=" + getXp() + ", getInteligencia()=" + getInteligencia() + ", getForca()=" + getForca()
				+ ", getLevel()=" + getLevel() + "]";
	}


	
}
