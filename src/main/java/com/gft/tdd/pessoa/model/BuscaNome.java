package com.gft.tdd.pessoa.model;


import java.util.List;

public class BuscaNome {
	
	public static int buscaNome(List<Pessoa> pessoas, String nome) {
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getNome() == nome) {
				return pessoa.getIdade();
			}
		}
		return -1;
	}
}
