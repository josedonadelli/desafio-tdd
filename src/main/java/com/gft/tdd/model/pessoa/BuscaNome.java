package com.gft.tdd.model.pessoa;

import java.util.ArrayList;
import java.util.List;

public class BuscaNome {
	
	public static int buscaNome(List<Pessoa> pessoas, String nome) {
		List<Pessoa> pessoass = new ArrayList<Pessoa>();
		
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getNome() == nome) {
				return pessoa.getIdade();
			}
		}

		return -1;
	}
}
