package pkg.visitor.concr;
import java.text.DecimalFormat;

import pkg.element.concr.Liquor;
import pkg.element.concr.Necessity;
import pkg.element.concr.Tobacco;
import pkg.visitor.Visitor;

public class TaxVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");

	//
	// Constructor
	//

	public TaxVisitor() {

	}

	//
	//
	//

	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: Price with tax");
		return Double.parseDouble(df.format((liquorItem.getPrice() * .18)
				+ liquorItem.getPrice()));
	}

	@Override
	public double visit(Tobacco tobacoItem) {
		System.out.println("Tobaco item: Price with tax");
		return Double.parseDouble(df.format((tobacoItem.getPrice() * .32)
				+ tobacoItem.getPrice()));
	}

	@Override
	public double visit(Necessity necessityItem) {
		System.out.println("Necessity item: Price with tax");
		return Double.parseDouble(df.format(necessityItem.getPrice()));

	}

}
