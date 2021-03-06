package com.gft.tdd.veiculo.service;

import com.gft.tdd.veiculo.model.Veiculo;

public class VeiculoService {
	private Veiculo veiculo;
	private int velocidade;
	
	public VeiculoService(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public void ligar() {
		
		if(!veiculo.isLigado())
			veiculo.setLigado(true);
	}
	public void desligar() {
		
			velocidade = veiculo.getVelocidade();
			if(velocidade!=0) {
				throw new VeiculoNaoPodeSerDesligadoEmMovimentoException();
			}else if(veiculo.isLigado())
				veiculo.setLigado(false);
		
	}

	public void acelerar() {
		velocidade = veiculo.getVelocidade();
		if(velocidade<=180 && veiculo.isLigado())//Limitando Velocidade maxima para 200km/h
			veiculo.setVelocidade(velocidade+20);
	}

	public void frear() {
		velocidade = veiculo.getVelocidade();
		if(velocidade>20) {
			veiculo.setVelocidade(velocidade-20);
		}else if(velocidade>0) {
			veiculo.setVelocidade(0);
		}
	}

	public void pintar(String string) {
		veiculo.setCor(string);
	}

	public void abastecer(int combustivel) {
		if(veiculo.getLitrosCombustivel()+combustivel <= 60) 
			veiculo.setLitrosCombustivel(veiculo.getLitrosCombustivel()+combustivel);
	}
	
	
	
	
}
