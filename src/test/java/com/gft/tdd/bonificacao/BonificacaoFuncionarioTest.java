package com.gft.tdd.bonificacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gft.tdd.bonificacao.model.Funcionario;
import com.gft.tdd.bonificacao.model.Gerente;
import com.gft.tdd.bonificacao.model.Supervisor;
import com.gft.tdd.bonificacao.model.Vendedor;

public class BonificacaoFuncionarioTest {
	private Vendedor vendedor;
	private Supervisor supervisor;
	private Gerente gerente;
	private double esperado;
	
	@Before
	public void setup(){
		vendedor = new Vendedor("Irmao do Jorel", 30, 10000);
		supervisor = new Supervisor("Nico", 40, 10000 );
		gerente = new Gerente("Jorel", 35, 10000);
	}
	
	@Test
	public void devePermitirCriarFuncionario() throws Exception {
		Funcionario funcionario;
	}
	
	@Test
	public void devePermitirCriarVendedor() throws Exception {
		Vendedor vendedor_ = new Vendedor();
	}
	
	@Test
	public void devePermitirCriarSupervisor() throws Exception {
		Supervisor supervisor_ = new Supervisor();
	}
	
	@Test
	public void devePermitirCriarGerente() throws Exception {
		Gerente gerente_ = new Gerente();
	}
	
	@Test
	public void deveVerificarBonificacaoDoVendedor() throws Exception {
		esperado = vendedor.getSalario() + 3000;
		
		assertEquals(esperado, vendedor.bonificacao(), 0.0001);
	}
	
	@Test
	public void deveVerificarBonificacaoDoSupervisor() throws Exception {
		esperado = supervisor.getSalario() + 5000;
		assertEquals(esperado, supervisor.bonificacao(), 0.0001);
	}
	

	@Test
	public void deveVerificarBonificacaoDoGerente() throws Exception {
		double esperado = gerente.getSalario() + 10000;
		assertEquals(esperado, gerente.bonificacao(),0.0001);
	}
}
