import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gft.tdd.model.loja.Livro;
import com.gft.tdd.model.loja.VideoGame;

public class LojaServiceTest {
	private Livro livro;
	private VideoGame vGame;
	
	@Before
	public void setup() {
		livro = new Livro("Harry Potter", 100.0, 10, "J.K. Rolling", "Fantasia", 230);
		vGame = new VideoGame("Xbox", 500, 1, "Microsoft", "360", true);
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
	public void calculaImpostoParaLivroComTemaEducativo() throws Exception {
		livro.setTema("educativo");
		double esperado = livro.getPreco() + livro.getPreco()*0;
		assertEquals(esperado,livro.getPreco()+livro.calculaImposto(), 0.0001);
	}
	
	@Test
	public void calculaImpostoParaLivroComTemaDiferenteDeEducativo() throws Exception {
		
	}
	
	
}
