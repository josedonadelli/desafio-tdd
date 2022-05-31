package com.gft.tdd.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import com.gft.tdd.model.Veiculo;

public class VeiculoServiceTest {
	private Veiculo veiculo;
	private VeiculoService veiculoService;
	@Before
	public void setup(){
		
		veiculoService = new VeiculoService(veiculo);
	}
	@Test
	public void devePermitirCriarCarro() throws Exception {
		//Veiculo veiculo = new Veiculo();
	}
	
	@Test
	public void devePermitirLigarCarro() throws Exception {
		//Veiculo veiculo = new Veiculo();
		veiculo = new VeiculoService(veiculo).ligar();
		
		assertEquals(true, veiculo.isLigado());
	}
	
	@Test
	public void devePermitirDesligarCarroLigadoEParado() throws Exception {
		Veiculo veiculo = new Veiculo();
		veiculo = new VeiculoService(veiculo).desligar();
		assertEquals(false, veiculo.isLigado());
	}
	
	@Test(expected = VeiculoNaoPodeSerDesligadoEmMovimentoException.class)
	public void deveNegarDesligarVeiculoCasoEmMovimento() throws Exception {
		Veiculo veiculo = new Veiculo();
		veiculo.setVelocidade(50);
		veiculo = new VeiculoService(veiculo).desligar();
		assertEquals(false, veiculo.isLigado());
	}
}
