package com.gft.tdd.pessoa.main;

import java.util.ArrayList;
import java.util.List;

import com.gft.tdd.pessoa.model.BuscaMaisVelha;
import com.gft.tdd.pessoa.model.ImprimeLista;
import com.gft.tdd.pessoa.model.Pessoa;
import com.gft.tdd.pessoa.model.RemoveMenores;

public class RunListaPessoas {
	
	public RunListaPessoas() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa maisVelha;
		int antes;

		pessoas.add(new Pessoa("João", 15)); 
		pessoas.add(new Pessoa("Leandro", 21));
		pessoas.add(new Pessoa("Paulo", 17));
		pessoas.add(new Pessoa("Jessica", 18));

		maisVelha = BuscaMaisVelha.buscaMaisVelha(pessoas);
		System.out.println("Pessoa mais velha: " + maisVelha.getNome());
		
		antes = pessoas.size();
		

		System.out.println("Antes da remocao, o tamanho da lista era de " + antes + 
				"\nE apos a remocao, ficou com tamanho:" + RemoveMenores.removeMenores(pessoas).size());
		
		pessoas = RemoveMenores.removeMenores(pessoas);
		ImprimeLista.imprimeLista(pessoas);
	}
	
	
	

}
