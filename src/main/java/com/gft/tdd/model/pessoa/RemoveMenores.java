package com.gft.tdd.model.pessoa;

import java.util.ArrayList;
import java.util.List;

public class RemoveMenores {
	
	
	
	public static List<Pessoa> removeMenores(List<Pessoa> pessoas){
		List<Pessoa> pessoasMaiores = new ArrayList<Pessoa>(pessoas);
		
		for(Pessoa pessoa : pessoasMaiores) {
			if(pessoa.getIdade()<18) {
				pessoasMaiores.remove(pessoa);
			}
		}
		return pessoasMaiores;
	}
}
