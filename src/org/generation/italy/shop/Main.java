package org.generation.italy.shop;

public class Main {
	public static void main(String[] args) {
		
		Prodotto prodotto1 = new Prodotto("Motosega ad aria", "Funziona ad aria! Come non lo so!", 300);
		System.out.println(prodotto1.toString());
		int prodotto1Prezzo = prodotto1.mostraPrezzo(); 
		int prodotto1PrezzoIva = prodotto1.mostraPrezzoIva();
		System.out.println("Prezzo: " + prodotto1Prezzo + " " + "€" + "\nPrezzo con Iva: " + prodotto1PrezzoIva + " " + "€");
		
		Prodotto prodotto2 = new Prodotto("BFG", "Big Fuckin Gun! E anche tu puoi uccidere demoni!", 15000);
		System.out.println(prodotto2.toString());
		int prodotto2Prezzo = prodotto2.mostraPrezzo(); 
		int prodotto2PrezzoIva = prodotto2.mostraPrezzoIva();
		System.out.println("Prezzo: " + prodotto2Prezzo + " " + "€" + "\nPrezzo con Iva: " + prodotto2PrezzoIva + " " + "€");
	} 
}