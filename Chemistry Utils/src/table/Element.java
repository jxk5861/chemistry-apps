package table;

public class Element {
	String name;
	String symbol;
	int number;
	double mass;

	public Element(String name, String symbol, int number, double mass) {
		this.name = name;
		this.symbol = symbol;
		this.number = number;
		this.mass = mass;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNumber() {
		return (double) this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getMass() {
		return this.mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public String toString() {
		return this.symbol + " " + this.number + " " + this.name;
	}
}
