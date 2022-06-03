package com.gft.tdd.model.loja;

import java.util.List;

public class ImprimeLivros {
	
	public static void imprimeLivros(List<Livro> livros) {
		if(livros.isEmpty())
			System.out.println("A loja nao tem livros no seu estoque");
		else {
			System.out.println("Livros em estoque:\n");
			for(Livro livro : livros) {
				System.out.println(livro.toString());
			}
		}
	}
}
