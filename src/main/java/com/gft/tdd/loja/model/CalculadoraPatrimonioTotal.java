package com.gft.tdd.loja.model;

import java.util.List;

public class CalculadoraPatrimonioTotal {
	
	public static double calcular(List<Livro> livros, List<VideoGame> games) {
		double total=0;
		
		for(Livro livro : livros) 
			total += (livro.getPreco() + livro.calculaImposto()) * livro.getQtd();
		
		for(VideoGame game : games)
			total+= (game.getPreco() + game.calculaImposto()) * game.getQtd();
		
		return total;
		
	}
}
