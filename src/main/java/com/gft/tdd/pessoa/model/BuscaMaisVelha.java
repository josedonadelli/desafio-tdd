package com.gft.tdd.pessoa.model;


import java.util.List;

public class BuscaMaisVelha {
	
	public static Pessoa buscaMaisVelha(List<Pessoa> pessoas){
		
		Pessoa pessoaMaisVelha = new Pessoa("Null", 0);
		for(Pessoa pessoa : pessoas ) {
			if(pessoa.getIdade() > pessoaMaisVelha.getIdade()) {
				pessoaMaisVelha.setNome(pessoa.getNome());
				pessoaMaisVelha.setIdade(pessoa.getIdade());
			}
		}
		return pessoaMaisVelha;
	}
}
