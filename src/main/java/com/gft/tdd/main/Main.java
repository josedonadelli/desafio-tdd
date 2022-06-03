package com.gft.tdd.main;

import java.io.IOException;
import java.util.Scanner;

import com.gft.tdd.bonificacao.main.RunBonificacao;
import com.gft.tdd.loja.main.RunLoja;
import com.gft.tdd.pessoa.main.RunListaPessoas;
import com.gft.tdd.rpg.main.RunRPG;
import com.gft.tdd.veiculo.main.RunVeiculo;

public class Main {
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {	
		int opcao = 1;
		while(opcao!=0) {
			opcao = menu();
			switch (opcao) {
				case 1:
					new RunVeiculo();
					break;
				case 2: 
					new RunLoja();
					break;
				case 3: 
					new RunRPG();
					break;
				case 4: 
					new RunListaPessoas();
					break;
				case 5: 
					new RunBonificacao();
					break;
				case 0: 
					break;
				default:
					System.out.println("Opcao invalida");
					break;
			}
			System.in.read();
		}
	}
	
	public static int menu() {
		System.out.println("****BEM VINDO AO MENU DA ATIVIDADE DE TDD****");
		System.out.println("Os exercicios deste repositorio sao:");
		System.out.println("1- Veiculo" );
		System.out.println("2- Loja" );
		System.out.println("3- RPG");
		System.out.println("4- Lista Pessoas");
		System.out.println("5- Bonificacao de Funcionarios");
		System.out.println("Ou escolha 0 para finalizar o programa");
		System.out.println("\nQual exercicio gostaria de rodar?");
		
		return ler.nextInt();
	}

}
