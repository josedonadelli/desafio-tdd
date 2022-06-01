package com.gft.tdd.main;

import java.util.ArrayList;
import java.util.List;

import com.gft.tdd.model.pessoa.BuscaMaisVelha;
import com.gft.tdd.model.pessoa.ImprimeLista;
import com.gft.tdd.model.pessoa.Pessoa;
import com.gft.tdd.model.pessoa.RemoveMenores;

public class RunListaPessoas {
	public static void main(String[] args) {
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
