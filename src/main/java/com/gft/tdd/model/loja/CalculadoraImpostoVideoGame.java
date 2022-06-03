package com.gft.tdd.model.loja;

public class CalculadoraImpostoVideoGame{
	private double preco;
	private boolean isUsado;
	public CalculadoraImpostoVideoGame(VideoGame vGame) {
		this.preco = vGame.getPreco();
		this.isUsado = vGame.isUsado();
	}
	
	
	public double calcular() {
		if(isUsado) 
			return preco*0.25;
		return preco*0.45;
	}
	
}
