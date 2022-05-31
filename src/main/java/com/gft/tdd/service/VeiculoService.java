package com.gft.tdd.service;

import com.gft.tdd.model.Veiculo;

public class VeiculoService {
	private Veiculo veiculo;
	
	public VeiculoService(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Veiculo ligar() {
		if(!veiculo.isLigado())
			veiculo.setLigado(true);
		return veiculo;
	}
	public Veiculo desligar() {
		if(veiculo.getVelocidade()!=0) {
			throw new VeiculoNaoPodeSerDesligadoEmMovimentoException();
		}else if(veiculo.isLigado())
			veiculo.setLigado(false);
		
		return veiculo;
	}
}
