package com.gft.tdd.loja;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.gft.tdd.loja.model.Livro;
import com.gft.tdd.loja.model.Loja;
import com.gft.tdd.loja.model.VideoGame;

public class LojaServiceTest {
	private Livro livro;
	private VideoGame vGame;
	private Loja loja, lojaA;
	private List<Livro> livros;
	private List<VideoGame> games;
	private double esperado;
	private double totalTest;
	
	@Before
	public void setup() {
		livro = new Livro("Harry Potter", 100.0, 10, "J.K. Rolling", "fantasia", 230);
		vGame = new VideoGame("Xbox", 500, 1, "Microsoft", "360", true);
		loja = new Loja();
		livros = new ArrayList<Livro>();
		games = new ArrayList<VideoGame>();
	}
	

	@Test
	public void devePermitirCriarLivro() throws Exception {
		Livro livro1 = new Livro();
	}
	
	@Test
	public void devePermitirCriarViedoGames() throws Exception {
		VideoGame vGame1 = new VideoGame();
	}
	
	@Test
	public void deveCalcularImpostoParaLivroComTemaEducativo() throws Exception {
		livro.setTema("educativo");
		esperado = livro.getPreco() + livro.getPreco() * 0;
		totalTest = livro.getPreco() + livro.calculaImposto();
		assertEquals(esperado, totalTest, 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoParaLivroComTemaDiferenteDeEducativo() throws Exception {
		esperado = livro.getPreco() + livro.getPreco() * 0.10;
		totalTest = livro.getPreco() + livro.calculaImposto();
		assertEquals(esperado,totalTest, 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoParaVideoGameNovo() throws Exception {
		vGame.setUsado(false);
		esperado = vGame.getPreco() + vGame.getPreco() * 0.45;
		totalTest = vGame.getPreco() + vGame.calculaImposto();
		assertEquals(esperado, totalTest, 0.0001);
	}
	
	@Test
	public void deveCalcularImpostoParaVideoGameUsado() throws Exception {
		vGame.setUsado(true);
		esperado = vGame.getPreco() + vGame.getPreco() * 0.25;
		totalTest = vGame.getPreco() + vGame.calculaImposto();
		assertEquals(esperado, totalTest, 0.0001);
	}
	
	@Test
	public void devePermitirCriarLoja() throws Exception {
		Loja loja1 = new Loja();
	}
	
	@Test
	public void deveInformarQueNaoTemLivrosEmEstoque() throws Exception {
		loja.listaLivros();
	}
	
	@Test
	public void deveInformarQueNaoTemVideoGamesEmEstoque() throws Exception {
		loja.listaVideoGames();
	}
	
	@Test
	public void deveImprimirLivrosEmEstoque() throws Exception {
		livros.add(new Livro("O Cortico", 100.0, 10, "Aluisio Azevedo", "fantasia", 230));
		livros.add(livro);
		lojaA = new Loja("Americanas", "12345678", livros, games);
		lojaA.listaLivros();
		
	}
	
	@Test
	public void deveImprimirVideoGameEmEstoque() throws Exception {
		games.add(vGame);
		games.add(new VideoGame("PS4", 1000, 10, "Sony", "Slim", false));
		lojaA = new Loja("Americanas", "12345678", livros, games);
	}
	
	@Test
	public void deveCalcularPatrimonioTotalDaLoja() throws Exception {
		//preenchendo listas com games e livros
		livros.add(new Livro("O Cortico", 100.0, 10, "Aluisio Azevedo", "fantasia", 230));
		livros.add(livro);
		games.add(vGame);
		games.add(new VideoGame("PS4", 1000, 10, "Sony", "Slim", false));
		
		//instanciando objeto Loja
		lojaA = new Loja("Americanas", "12345678", livros, games);
		
		//somando valores dos produtos
		esperado = 0;
		for(Livro livro : livros)
			esperado += (livro.getPreco() + livro.calculaImposto()) * livro.getQtd();
		for(VideoGame game : games)
			esperado += (game.getPreco() + game.calculaImposto()) * game.getQtd();
		
		assertEquals(esperado, lojaA.calculaPatrimonio(), 0.0001);
	}
	
}
