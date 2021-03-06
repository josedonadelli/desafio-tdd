package com.gft.tdd.loja.model;

public class Livro extends Produto implements Imposto{
	private String autor;
	private String tema;
	private int qtdPag;
	public Livro() {
		super();
	}
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.qtdPag = qtdPag;
		this.tema = tema;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	public double calculaImposto() {
		return new CalculadoraImpostoLivro(this).calcular();
	}

	@Override
	public String toString() {
		return "[nome=" + this.getNome() + ", autor=" + autor + "]";
	}
	
	
	
}
