package org.generation.italy.shop;

import java.util.Random;

public class Prodotto {
	
	
	int codice;
	int prezzo;
	int iva;
	String nome;
	String descrizione;
	
	public Prodotto (String nome, String descrizione, int prezzo){
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		iva = 20;
		Random rnd = new Random();
		this.codice = rnd.nextInt(10000, 100000); //numero casuale di 5 cifre
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
