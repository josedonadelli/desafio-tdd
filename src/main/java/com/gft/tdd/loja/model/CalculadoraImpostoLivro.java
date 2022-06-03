package com.gft.tdd.loja.model;

public class CalculadoraImpostoLivro {
	private double preco;
	private String tema="";
	
	public CalculadoraImpostoLivro(Livro livro) {
		this.preco = livro.getPreco();
		this.tema = livro.getTema();	
	}
	
	public double calcular() {
		if(tema.equals("educativo"))//Sem Imposto
			return preco * 0;
		return preco * 0.1;
	}

}
