package com.gft.tdd.pessoa;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gft.tdd.pessoa.model.BuscaMaisVelha;
import com.gft.tdd.pessoa.model.BuscaNome;
import com.gft.tdd.pessoa.model.ImprimeLista;
import com.gft.tdd.pessoa.model.Pessoa;
import com.gft.tdd.pessoa.model.RemoveMenores;
import com.gft.tdd.pessoa.model.BuscaMaisVelha.*;

public class ListaDePessoasTest {
	private List<Pessoa>pessoas;
	private int esperado;
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
		List<Pessoa>pessoasMaiores = RemoveMenores.removeMenores(pessoas);
		int qtdPessoasMenores = 1;
		assertEquals(pessoas.size()-qtdPessoasMenores, pessoasMaiores.size());
	}
	
	@Test
	public void deveImprimirAsInformacoesDasPessoasDaLista() throws Exception {
		pessoas.add(new Pessoa("Joao", 15));
		pessoas.add(new Pessoa("Fernanda", 27));
		pessoas.add(new Pessoa("Tomas", 29));
		ImprimeLista.imprimeLista(pessoas);
	}
	
	@Test
	public void deveEncontrarAPessoaMaisVelha() throws Exception {
		pessoas.add(new Pessoa("Joao", 15));
		pessoas.add(new Pessoa("Fernanda", 27));
		pessoas.add(new Pessoa("Tomas", 29));
		
		Pessoa pessoa = BuscaMaisVelha.buscaMaisVelha(pessoas);
		System.out.println(pessoa.toString());
	}
	
	@Test
	public void deveBuscarNomeEspecificoERetornarAIdade() throws Exception {
		pessoas.add(new Pessoa("Joao", 15));
		pessoas.add(new Pessoa("Fernanda", 27));
		pessoas.add(new Pessoa("Jessica", 29));
		esperado = 27;
		String nome = "Fernanda";
		
		assertEquals(esperado, BuscaNome.buscaNome(pessoas, nome));
	}
	
	
	
	
}
