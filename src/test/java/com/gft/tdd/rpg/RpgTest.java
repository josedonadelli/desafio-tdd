package com.gft.tdd.rpg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.gft.tdd.rpg.model.LevelUp;
import com.gft.tdd.rpg.model.Mago;
import com.gft.tdd.rpg.model.Personagem;

public class RpgTest {
	Mago mago;
	Personagem guerreiro;
	@Before
	public void setup() {
		mago = new Mago("Merlin");
		
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
		int esperadoMana = mago.getMana() + 10;
		int esperadoInteligencia = mago.getInteligencia() + 3;
		int esperadoForca = mago.getForca() + 1;
		int esperadoVida = mago.getVida() + 5;
		
		mago.lvlUp();
		
		assertEquals(esperadoMana, mago.getMana());
		assertEquals(esperadoInteligencia, mago.getInteligencia());
		assertEquals(esperadoForca, mago.getForca());
		assertEquals(esperadoVida, mago.getVida());
	}
	
	@Test
	public void devePermitirMagoAtacar() throws Exception {
		
		System.out.println(mago.attack());
	}
	
	@Test
	public void deveAprenderMagia() throws Exception {
		mago.aprenderMagia("Super Nova");
	}
	
}
