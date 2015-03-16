package pkg.element.concr;

import pkg.element.Element;
import pkg.visitor.Visitor;

public class Necessity implements Element {

	private double price;

	//
	// Constructor
	//

	public Necessity(double item) {
		price = item;
	}

	//
	// Getter
	//

	public double getPrice() {
		return price;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

}