package com.gft.tdd.pessoa.model;

import java.util.ArrayList;
import java.util.List;

public class RemoveMenores {
	
	
	public static List<Pessoa> removeMenoress(List<Pessoa> pessoas){
		List<Pessoa> pessoasMaiores = pessoas;
		int i;
		for(i=0; i<pessoasMaiores.size(); i++) {
			if(pessoasMaiores.get(i).getIdade()<18) {
				pessoasMaiores.remove(i);	
				i--;
			}
		}
		return pessoasMaiores;
	}
	
	public static List<Pessoa> removeMenores(List<Pessoa> pessoas){
		List<Pessoa> pessoasMaiores = new ArrayList<Pessoa>(pessoas);
		int i;
		for(i=0; i<pessoasMaiores.size(); i++) {
			if(pessoasMaiores.get(i).getIdade()<18) {
				pessoasMaiores.remove(i);	
				i--;
			}
		}
		return pessoasMaiores;
	}
	
}

