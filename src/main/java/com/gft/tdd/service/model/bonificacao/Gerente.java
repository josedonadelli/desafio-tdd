package com.gft.tdd.service.model.bonificacao;

public class Gerente extends Funcionario {
	
	public Gerente() {
		super();
	}
	public Gerente (String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao(){
		return this.getSalario() + 10000;
	}
}
