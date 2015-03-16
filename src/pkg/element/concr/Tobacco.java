package pkg.element.concr;

import pkg.element.Element;
import pkg.visitor.Visitor;

public class Tobacco implements Element {

	private double price;

	//
	// Constructor
	//

	public Tobacco(double item) {
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