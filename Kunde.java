package kunde;

import java.util.Scanner;

import bar.Bar;
import drink.Drink;


public class Kunde {
	private String name;
	private Bar bar; 
	private Scanner in;
	public String getName() {
		return name;
	}
	public Kunde(String name, Bar bar, Scanner in) {
		super();
		this.name = name;
		this.bar = bar;
		this.in = in;
	}
	public void bestelleCocktail() {
		System.out.println("\n" + name + "\n");
		Drink[] cocktails = bar.getCocktails();
		System.out.println(bar.getName() + " - Liste der Cocktails");
		for(int i=0;i<cocktails.length;i++) {
			System.out.println((i+1) + " " + cocktails[i]);
		}
		System.out.println("Wählen Sie einen Cocktail aus durch Eingabe der Nummer");
		int auswahl = Integer.parseInt(in.nextLine());
		if(1 <= auswahl && auswahl <= cocktails.length) {
			bar.kaufeCocktail(cocktails[auswahl - 1]);
		}
		else {
			System.out.println("Falsche Eingabe");
		}
	}
}
