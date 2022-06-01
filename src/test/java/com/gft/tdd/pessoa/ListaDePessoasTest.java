package com.gft.tdd.pessoa;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gft.tdd.model.pessoa.Pessoa;
import com.gft.tdd.model.pessoa.RemoveMenores;

public class ListaDePessoasTest {
	private List<Pessoa>pessoas;
	
	@Before
	public void setup() {
		pessoas = new ArrayList<Pessoa>();
	}
	@Test
	public void devePermitirCriarPessoa() throws Exception {
		Pessoa pessoa = new Pessoa();
	}
	
	@Test
	public void devePermitirCriarUmaListaDePessoas() throws Exception {
		List<Pessoa> pessoas_ = new ArrayList<Pessoa>();
	}
	
	@Test
	public void devePermitirAdicionarUmaPessoaNaListaDePessoas() throws Exception {
		Pessoa pessoa = new Pessoa("Joao", 15);
		pessoas.add(pessoa);
		assertEquals(pessoa,pessoas.get(0));
	}
	
	@Test
	public void deveRemoverPessoasMenoresDeIdadeDaLista() throws Exception {
		pessoas.add(new Pessoa("Joao", 15));
		pessoas.add(new Pessoa("Fernanda", 27));
		int qtdPessoasMenores = 1;
		List<Pessoa>pessoasMaiores = RemoveMenores.removeMenores(pessoas);
		assertEquals(pessoas.size()-qtdPessoasMenores, pessoasMaiores.size());
	}
	
	@Test
	public void deveImprimirAsInformacoesDasPessoasDaLista() throws Exception {
		
	}
	
	
	
	
	
}
