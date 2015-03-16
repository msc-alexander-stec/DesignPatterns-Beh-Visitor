package pkg.visitor.concr;
import java.text.DecimalFormat;

import pkg.element.concr.Liquor;
import pkg.element.concr.Necessity;
import pkg.element.concr.Tobacco;
import pkg.visitor.Visitor;

public class TaxHolidayVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");

	//
	// Constructor
	//

	public TaxHolidayVisitor() {

	}

	//
	//
	//

	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: Price with tax");
		return Double.parseDouble(df.format((liquorItem.getPrice() * 0.10)
				+ liquorItem.getPrice()));
	}

	@Override
	public double visit(Tobacco tobacoItem) {
		System.out.println("Tobaco item: Price with tax");
		return Double.parseDouble(df.format((tobacoItem.getPrice() * 0.30)
				+ tobacoItem.getPrice()));
	}

	@Override
	public double visit(Necessity necessityItem) {
		System.out.println("Necessity item: Price with tax");
		return Double.parseDouble(df.format((necessityItem.getPrice() * 0)
				+ necessityItem.getPrice()));
	}

}
