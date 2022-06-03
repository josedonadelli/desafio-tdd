package com.gft.tdd.bonificacao.model;

public class Supervisor extends Funcionario {

	public Supervisor() {
		super();
	}

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		return this.getSalario() + 5000;
	}
	
}
