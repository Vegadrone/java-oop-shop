package org.generation.italy.shop;

import java.util.Random;

public class Prodotto {
	
	Random rnd = new Random();
	
	int codice;
	int prezzo;
	int iva = 20;
	String nome;
	String descrizione;
	
	public Prodotto (String nome, String descrizione, int prezzo){
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.codice = rnd.nextInt(10000, 99999);		
	}
	
	public int mostraPrezzo() {
		return prezzo;
	}
	
	public int mostraPrezzoIva() {
		return prezzo + (prezzo * iva /100);
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + nome + "\nDescrizione: " + descrizione + "\nCodice: " + codice + "\nPrezzo: " + prezzo  + " " + "€";
	}
}
