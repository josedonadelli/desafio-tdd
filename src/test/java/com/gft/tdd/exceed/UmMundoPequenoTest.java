package com.gft.tdd.exceed;

import static org.junit.Assert.*;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gft.tdd.exceed.model.Amigo;

public class UmMundoPequenoTest {
	private Amigo amigo;
	private Amigo amigo2;
	private List<Amigo> amigos;
	@Before
	public void setup() {
		amigo = new Amigo("Mare", 50, 50);
		amigo2 = new Amigo("Propa", 0,0);
		amigos = new ArrayList<Amigo>();
	}
	
	@Test
	public void devePoderCriarAmigo() throws Exception {
		Amigo amigo = new Amigo(" ", 0, 0);
	}
	
	@Test
	public void deveCalcularHipotenusa() throws Exception {
		double esperado = Math.pow(amigo.getLatitude(), 2) + Math.pow(amigo.getLongitude(), 2);
		esperado = Math.sqrt(esperado);
		
		assertEquals(esperado, amigo2.calculaHipo(), 0.0001);
	}
	
	@Test
	public void deveCalcularDiferencaAbsoluta() throws Exception {
		double hipo1 = Math.pow(amigo.getLatitude(), 2) + Math.pow(amigo.getLongitude(), 2);
		hipo1 = Math.sqrt(hipo1);
		double hipo2 = Math.pow(amigo2.getLatitude(), 2) + Math.pow(amigo2.getLongitude(), 2);
		hipo2 = Math.sqrt(hipo2);
		double esperado = Math.abs(hipo2-hipo1);
		assertEquals(esperado, amigo.calculaDiferencaAbsoluta(amigo2), 0.0001);
	}
	
	@Test
	public void deveVerificarSeJaExisteNaLista() throws Exception {
		amigos.add(amigo2);
		boolean teste = Amigo.verificaNome(amigos.get(0), amigo2);
		assertEquals(false, teste);
	}
	
	@Test
	public void deveCalcularDiferencaAbsolutaList() throws Exception {
		amigos.add(amigo2);
		double hipo1 = Math.pow(amigo.getLatitude(), 2) + Math.pow(amigo.getLongitude(), 2);
		hipo1 = Math.sqrt(hipo1);
		double hipo2 = Math.pow(amigos.get(0).getLatitude(), 2) + Math.pow(amigos.get(0).getLongitude(), 2);
		hipo2 = Math.sqrt(hipo2);
		double esperado = Math.abs(hipo2-hipo1);
		assertEquals(esperado, amigo.calculaDiferencaAbsoluta(amigos.get(0)), 0.0001);
	}
	

	
}
