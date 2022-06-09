package com.gft.tdd.exceed.model;

import java.util.ArrayList;
import java.util.List;

public class Amigo {
	private String nome;
	//private String latitude;
	//private String longitude;
	private int longitude;
	private int latitude;
	
	public Amigo(String nome, int latitude, int longitude) {
		this.nome = nome;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getLongitude() {
		return longitude;
	}



	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}



	public int getLatitude() {
		return latitude;
	}



	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	
	public double calculaHipo() {
		return Math.sqrt((Math.pow(this.getLatitude(),2) + Math.pow(this.getLongitude(), 2)));
	}


	
	public static boolean verificaNomeLista(List<Amigo> amigos, Amigo b) {
		for(int i=0; i<amigos.size(); i++) {
			if(amigos.get(i).getNome().equals(b.getNome()))
				return false;
		}
		
		return true;
	}
	
	public static boolean verificaNome(Amigo a, Amigo b) {
		
			if(a.getNome().equals(b.getNome()))
				return false;
		
		
		return true;
	}
	
	public double calculaDiferencaAbsoluta( Amigo b) {
		double result = this.calculaHipo() - b.calculaHipo();
		result = Math.abs(result);
		return result;
	}
	
	public static List<Amigo> amigosProximos(List<Amigo> amigos, Amigo referencial) {
		
		List<Amigo> amigosProximos = new ArrayList<Amigo>();
		List<Amigo> amigosLonge = new ArrayList<Amigo>();
		
		
		for(Amigo amigoLista : amigos) {
			int tamanho;
			if(amigosProximos.size() < 3 && verificaNome(referencial, amigoLista) && verificaNomeLista(amigosProximos, amigoLista))
				amigosProximos.add(amigoLista);
			else if(amigosProximos.size()>0 && verificaNome(referencial, amigoLista)){
				tamanho = amigosProximos.size();
				for(int i = 0; i < tamanho; i++) {
					if(referencial.calculaDiferencaAbsoluta(amigoLista) < referencial.calculaDiferencaAbsoluta(amigosProximos.get(i))
							&& verificaNomeLista(amigosProximos, amigoLista)) {
						//amigosLonge.add(amigo);
						System.out.println(referencial.calculaDiferencaAbsoluta(amigoLista) + " < " + referencial.calculaDiferencaAbsoluta(amigosProximos.get(i)) );
						amigosProximos.add(amigoLista);
						amigosLonge.add(amigosProximos.remove(i));
					}
				}
				
			}
		}
		
		amigosProximos.sort(null);
		for(int i = 0; i < amigosProximos.size(); i++) {
			for(Amigo amigoLonge : amigosLonge) {
			
				if(referencial.calculaDiferencaAbsoluta(amigoLonge) < referencial.calculaDiferencaAbsoluta(amigosProximos.get(i))) {
					System.out.println(referencial.calculaDiferencaAbsoluta(amigoLonge) + " < " + referencial.calculaDiferencaAbsoluta(amigosProximos.get(i)) );
					amigosProximos.add(amigoLonge);
					amigosProximos.remove(i);
				}
			}
		
		}
		
		return amigosProximos;
	}



	@Override
	public String toString() {
		return "Amigo [nome=" + nome + ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}
	
	
	
}
