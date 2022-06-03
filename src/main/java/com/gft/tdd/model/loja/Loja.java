package com.gft.tdd.model.loja;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private List<Livro> livros;
	private List<VideoGame> vGames;
	private String nome;
	private String cnpj;
	public Loja() {
		livros = new ArrayList<Livro>();
		vGames = new ArrayList<VideoGame>();
	}
	
	public Loja(String nome,String cnpj,List<Livro> livros, List<VideoGame> vGames  ) {
		this.livros = livros;
		this.vGames = vGames;
		this.nome = nome;
		this.cnpj = cnpj;
	}


	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getvGames() {
		return vGames;
	}

	public void setvGames(List<VideoGame> vGames) {
		this.vGames = vGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void listaLivros() {
		ImprimeLivros.imprimeLivros(livros);
	}

	public void listaVideoGames() {
		ImprimeVideoGames.imprimeVideoGames(vGames);
	}
	
	
	
	
	
	
	
}
