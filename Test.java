package test;

import java.util.Scanner;

import bar.Bar;
import kunde.Kunde;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Bar bar = new Bar("Sky Bar");
		Kunde max = new Kunde("Max", bar, in);
		Kunde moritz = new Kunde("Moritz", bar, in);
		max.bestelleCocktail();
		moritz.bestelleCocktail();
		System.out.println("Umsatz: " + bar.getUmsatz());
		in.close();
	}

}
