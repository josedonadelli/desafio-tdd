package com.gft.tdd.main;

import com.gft.tdd.model.rpg.Ataque;
import com.gft.tdd.model.rpg.Guerreiro;
import com.gft.tdd.model.rpg.Mago;

public class RunRPG {
	
	public RunRPG() {
		Mago mago = new Mago("Gandalf");
		Guerreiro guerreiro = new Guerreiro("Darius");
		String magia, habilidade;
		//A variavel cont esta declarado como static na classe Pai (Personagem). 
		System.out.println("Quantidade de personagens criados:" + mago.getCont());
		
		//LevelUp
		System.out.println('\n' + mago.toString());
		mago.lvlUp();
		System.out.println(mago.toString());
		
		System.out.println('\n' + guerreiro.toString());
		guerreiro.lvlUp();
		System.out.println(guerreiro.toString());
		
		System.out.println('\n');
		
		//Aprendendo Magias/Habilidades
		magia = "Chuva de Meteoro";
		habilidade = "Golpe Fulminante";
		mago.aprenderMagia(magia);
		guerreiro.aprenderHabilidade(habilidade);
		magia = "Lanca de Gelo";
		habilidade = "Perfurar";
		mago.aprenderMagia(magia);
		guerreiro.aprenderHabilidade(habilidade);
		System.out.println("Magias=" + mago.getMagias());
		System.out.println("Habilidades=" + guerreiro.getHabilidades());
		
		System.out.println('\n');
		
		//Ataques
		System.out.println(mago.getNome() + " atacou, causando " + Ataque.attack(mago) +" de dano");
		System.out.println(guerreiro.getNome() + " atacou, causando " + Ataque.attack(guerreiro) + " de dano");
		
	}
}
