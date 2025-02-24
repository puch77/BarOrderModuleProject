package bar;

import drink.Drink;

public class Bar {
	private String name;
	private double umsatz;
	private Drink[] cocktails;
	public Bar(String name) {
		super();
		this.name = name;
		cocktails = new Drink[] {
				new Drink("Margarita", 12.50),
				new Drink("Mojito", 9.90),
				new Drink("Tequila sunris", 10.90),
				new Drink("Martini dry", 7.50),
				new Drink("Cosmopolitan", 14.50)
		};
	}
	public String getName() {
		return name;
	}
	public double getUmsatz() {
		return umsatz;
	}
	public Drink[] getCocktails() {
		return cocktails;
	}
	public void kaufeCocktail (Drink d) {
		umsatz += d.getPreis();
	}
	
}
