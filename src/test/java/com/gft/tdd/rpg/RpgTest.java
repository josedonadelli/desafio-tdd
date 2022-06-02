package com.gft.tdd.rpg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gft.tdd.model.rpg.Ataque;
import com.gft.tdd.model.rpg.Guerreiro;
import com.gft.tdd.model.rpg.LevelUp;
import com.gft.tdd.model.rpg.Mago;
import com.gft.tdd.model.rpg.Personagem;

public class RpgTest {
	Mago mago;
	Guerreiro guerreiro;
	Personagem personagem;
	private int esperadoMana;
	private int esperadoVida;
	private int esperadoInteligencia;
	private int esperadoForca;

	@Before
	public void setup() {
		
		mago = new Mago("Merlin");
		guerreiro = new Guerreiro("Jobson");
	}
	@Test
	public void devePermitirCriarPersonagem() throws Exception {
		Personagem personagem = new Personagem("Jobson");
	}
	
	@Test
	public void deveEvoluirPersonagem() throws Exception {
		Personagem personagem = new Personagem("Jobson");
		personagem.lvlUp();
	}
	
	@Test
	public void devePermitirCriarMago() throws Exception {
		Mago mago1 = new Mago("Merlin");
	}
	
	@Test
	public void deveEvoluirMago() throws Exception {
		int esperado = mago.getLevel() + 1;
		mago.lvlUp();
		assertEquals(esperado, mago.getLevel());
	}
	
	@Test
	public void deveAumentarStatusDeMago() throws Exception {
		esperadoMana = mago.getMana() + 10;
		esperadoInteligencia = mago.getInteligencia() + 3;
		esperadoForca = mago.getForca() + 1;
		esperadoVida = mago.getVida() + 5;

		LevelUp.lvlUp(mago);
		assertEquals(esperadoMana, mago.getMana());
		assertEquals(esperadoInteligencia, mago.getInteligencia());
		assertEquals(esperadoForca, mago.getForca());
		assertEquals(esperadoVida, mago.getVida());
	}
	
	@Test
	public void devePermitirMagoAtacar() throws Exception {
		System.out.println(Ataque.attack(mago));
	}
	
	@Test
	public void deveAprenderMagia() throws Exception {
		String esperado = "Super Nova";
		
		mago.aprenderMagia(esperado);
		
		assertEquals(esperado, mago.getMagias().get(0));
	}
	
	@Test
	public void devePermitirCriarGuerreiro() throws Exception {
		Guerreiro guerreiro1 = new Guerreiro("Pedro	");
	}
	
	@Test
	public void deveEvoluirGuerreiro() throws Exception {
		int esperado = guerreiro.getLevel() + 1;
		
		LevelUp.lvlUp(guerreiro);
		assertEquals(esperado, guerreiro.getLevel());
	}
	
	@Test
	public void deveAumentarStatusGuerreiro() throws Exception {
		esperadoMana = guerreiro.getMana() + 5;
		esperadoInteligencia = guerreiro.getInteligencia() + 1;
		esperadoForca = guerreiro.getForca() + 3;
		esperadoVida = guerreiro.getVida() + 10;
		
		LevelUp.lvlUp(guerreiro);
		
		assertEquals(esperadoMana, guerreiro.getMana());
		assertEquals(esperadoInteligencia, guerreiro.getInteligencia());
		assertEquals(esperadoForca, guerreiro.getForca());
		assertEquals(esperadoVida, guerreiro.getVida());
	}
	
	@Test
	public void devePermitirGuerreiroAtacar() throws Exception {
		System.out.println(Ataque.attack(guerreiro));
	}
	
	@Test
	public void deveAprenderHabilidade() throws Exception {
		String esperado = "Vigor";
		guerreiro.aprenderHabilidade(esperado);
		
		assertEquals(esperado, guerreiro.getHabilidades().get(0));
		
	}
	
	@Test
	public void deveAumentarStatusSemBonusSeNaoForMagoOuGuerreiro() throws Exception {
		personagem = new Personagem("Aprendiz");
		esperadoMana = personagem.getMana() + 5;
		esperadoInteligencia = personagem.getInteligencia() + 1;
		esperadoVida = personagem.getVida() + 5;
		esperadoForca = personagem.getForca() + 1;
		
		LevelUp.lvlUp(personagem);
		
		assertEquals(esperadoMana, personagem.getMana());
		assertEquals(esperadoInteligencia, personagem.getInteligencia());
		assertEquals(esperadoVida, personagem.getVida());
		assertEquals(esperadoForca, personagem.getForca());
		
	}
	
}
