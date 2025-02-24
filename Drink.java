package drink;

public class Drink {
	private String name; 
	private double preis;
	public Drink(String name, double preis) {
		super();
		this.name = name;
		this.preis = preis;
	}
	public double getPreis() {
		return preis;
	}
	@Override
	public String toString() {
		return  name + ",\t preis=" + preis;
	} 
	
}
