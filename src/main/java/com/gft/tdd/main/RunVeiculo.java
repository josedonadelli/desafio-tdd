package com.gft.tdd.main;

import com.gft.tdd.model.veiculo.Veiculo;
import com.gft.tdd.service.veiculo.VeiculoService;

public class RunVeiculo {

	public RunVeiculo() {
		Veiculo veiculo = new Veiculo("Ford","Ranger", "0000AAAA", "Amarelo", 0.0f, false, 10, 0, 200000.0);
		VeiculoService veiculoService = new VeiculoService(veiculo);
		System.out.println(veiculo.toString());
		int qtdAbastecer=10;
		String corPintar="Laranja";
		
		veiculoService.abastecer(qtdAbastecer);
		veiculoService.pintar(corPintar);
		System.out.println(veiculo.toString());
		
		
		veiculoService.acelerar();
		System.out.println(veiculo.toString());
		
		veiculoService.ligar();
		veiculoService.acelerar();
		System.out.println(veiculo.toString());
		
		veiculoService.acelerar();
		veiculoService.acelerar();
		veiculoService.frear();
		
		System.out.println(veiculo.toString());
		
		
		veiculoService.frear();
		veiculoService.frear();
		veiculoService.desligar();
		System.out.println(veiculo.toString());
		
	}
	
	/*public static void main(String[] args) {
	}*/

}
