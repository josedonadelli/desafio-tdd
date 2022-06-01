package com.gft.tdd.service.veiculo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gft.tdd.model.veiculo.Veiculo;
import com.gft.tdd.service.veiculo.VeiculoNaoPodeSerDesligadoEmMovimentoException;
import com.gft.tdd.service.veiculo.VeiculoService;

public class VeiculoServiceTest {
	private Veiculo veiculo;
	private VeiculoService veiculoService;
	
	@Before
	public void setup(){
		veiculo = new Veiculo();
		veiculoService = new VeiculoService(veiculo);
	}
	@Test
	public void devePermitirCriarCarro() throws Exception {
		Veiculo veiculo_teste = new Veiculo();
	}
	
	@Test
	public void devePermitirLigarCarro() throws Exception {
		veiculoService.ligar();
		assertEquals(true, veiculo.isLigado());
	}
	
	@Test
	public void devePermitirDesligarCarroLigadoEParado() throws Exception {
		veiculoService.desligar();
		assertEquals(false, veiculo.isLigado());
	}
	
	@Test(expected = VeiculoNaoPodeSerDesligadoEmMovimentoException.class)
	public void deveNegarDesligarVeiculo_CasoEmMovimento() throws Exception {
		veiculo.setVelocidade(50);
		veiculoService.desligar();
		assertEquals(false, veiculo.isLigado());
	}
	
	@Test
	public void devePermitirAcelerarVeiculo() throws Exception {
		veiculo.setVelocidade(50);
		veiculoService.acelerar();
		assertEquals(70, veiculo.getVelocidade(), 0.0001);
	}
	
	@Test
	public void devePermitirFrearVeiculo() throws Exception {
		veiculo.setVelocidade(21);
		veiculoService.frear();
		assertEquals(1, veiculo.getVelocidade());
	}
	
	@Test
	public void devePermitirPintarVeiculo() throws Exception {
		String cor = "Vermelho";
		veiculo.setCor("Azul");
		veiculoService.pintar("Vermelho");
		assertEquals(cor, veiculo.getCor());
	}
	
	@Test
	public void devePermitirAbastecer() throws Exception {
		int combustivel=20;
		veiculo.setLitrosCombustivel(20);
		
		veiculoService.abastecer(combustivel);
		assertEquals(40, veiculo.getLitrosCombustivel());
	}
	
}
