package com.gft.tdd.model.loja;

public class VideoGame extends Produto implements Imposto{
	private String marca;
	private String modelo;
	private boolean isUsado;
	public VideoGame() {
		super();	
	}
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	public double calculaImposto() {
		return new CalculadoraImpostoVideoGame(this).calcular();
	}

	@Override
	public String toString() {
		return "[nome=" + this.getNome() +", modelo=" + modelo +  ", isUsado=" + isUsado + "]";
	}
	
	
	
	
}
