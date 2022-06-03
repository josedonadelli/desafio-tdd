package com.gft.tdd.pessoa.model;

import java.util.List;

public class ImprimeLista {
	
	public static void imprimeLista(List<Pessoa> pessoas) {
		for(Pessoa pessoa : pessoas) 
			System.out.println("[nome=" + pessoa.getNome() + ", idade=" + pessoa.getIdade()+
			"]");	
	}
}
