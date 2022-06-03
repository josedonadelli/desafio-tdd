package com.gft.tdd.main;

import com.gft.tdd.service.model.bonificacao.Gerente;
import com.gft.tdd.service.model.bonificacao.Supervisor;
import com.gft.tdd.service.model.bonificacao.Vendedor;

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
