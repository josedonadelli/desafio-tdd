package com.gft.tdd.bonificacao.model;

public class Vendedor extends Funcionario {

	public Vendedor() {
		super();
	}

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	
	@Override
	public double bonificacao() {
		
		return this.getSalario() + 3000;
	}
}
