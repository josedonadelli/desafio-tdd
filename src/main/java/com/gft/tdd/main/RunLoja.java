package com.gft.tdd.main;

import java.util.ArrayList;
import java.util.List;

import com.gft.tdd.model.loja.Livro;
import com.gft.tdd.model.loja.Loja;
import com.gft.tdd.model.loja.VideoGame;

public class RunLoja {
public RunLoja() {
	Livro l1 = new Livro("Harry Potter", 40, 50, "J.K. Rowling", "fantasia", 300);
	Livro l2 = new Livro("Senhor dos Aneis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
	Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
	
	VideoGame ps4 = new VideoGame("Ps4", 1800, 100, "Sony", "Slim", false);
	VideoGame ps4Usado = new VideoGame("Ps4", 1000, 7, "Sony", "Slim", true);
	VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
	
	List<Livro> livros = new ArrayList<Livro>();
	livros.add(l1);
	livros.add(l2);
	livros.add(l3);
	
	List<VideoGame> games = new ArrayList<VideoGame>();
	games.add(ps4);
	games.add(ps4Usado);
	games.add(xbox);
	
	Loja americanas = new Loja("Americanas", "12345678", livros, games);
	
	System.out.println(l2.calculaImposto());
	System.out.println(l3.calculaImposto());

	System.out.println(ps4Usado.calculaImposto());
	System.out.println(ps4.calculaImposto());
	
	}

	public void run() {
		
		Livro l1 = new Livro("Harry Potter", 40, 50, "J.K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Aneis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("Ps4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("Ps4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		List<VideoGame> games = new ArrayList<VideoGame>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		
		Loja americanas = new Loja("Americanas", "12345678", livros, games);
		
		System.out.println(l2.calculaImposto());
		System.out.println(l3.calculaImposto());

		System.out.println(ps4Usado.calculaImposto());
		System.out.println(ps4.calculaImposto());
	}
	/*public static void main(String[] args) {
		Livro l1 = new Livro("Harry Potter", 40, 50, "J.K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Aneis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("Ps4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("Ps4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		List<VideoGame> games = new ArrayList<VideoGame>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		
		Loja americanas = new Loja("Americanas", "12345678", livros, games);
		
		
		System.out.println(l2.calculaImposto());
		System.out.println(l3.calculaImposto());

		System.out.println(ps4Usado.calculaImposto());
		System.out.println(ps4.calculaImposto());
	}*/
	
}
