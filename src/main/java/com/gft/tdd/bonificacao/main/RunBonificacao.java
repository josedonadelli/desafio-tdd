package com.gft.tdd.bonificacao.main;

import com.gft.tdd.bonificacao.model.Gerente;
import com.gft.tdd.bonificacao.model.Supervisor;
import com.gft.tdd.bonificacao.model.Vendedor;

public class RunBonificacao {

	
	public RunBonificacao(){
		Vendedor vendedor = new Vendedor("Ana", 20, 10000);
		Supervisor supervisor = new Supervisor("Maria", 28, 10000);
		Gerente gerente = new Gerente("Braga", 45, 10000);
		
		System.out.println(vendedor.toString());
		System.out.println(supervisor.toString());
		System.out.println(gerente.toString());
	}
	/*public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("Ana", 20, 10000);
		Supervisor supervisor = new Supervisor("Maria", 28, 10000);
		Gerente gerente = new Gerente("Braga", 45, 10000);
		
		System.out.println(vendedor.toString());
		System.out.println(supervisor.toString());
		System.out.println(gerente.toString());
	}*/

}
