package testclient;
import pkg.element.concr.Liquor;
import pkg.element.concr.Necessity;
import pkg.element.concr.Tobacco;
import pkg.visitor.concr.TaxHolidayVisitor;
import pkg.visitor.concr.TaxVisitor;

public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: Visitor");

		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();

		Necessity milk = new Necessity(3.47);
		Liquor vodka = new Liquor(11.99);
		Tobacco cigars = new Tobacco(19.99);

		//
		// Default tax
		//

		System.out.println(milk.accept(taxCalc) + "\n");
		System.out.println(vodka.accept(taxCalc) + "\n");
		System.out.println(cigars.accept(taxCalc) + "\n");

		//
		// Holiday tax
		//

		System.out.println(milk.accept(taxHolidayCalc) + "\n");
		System.out.println(vodka.accept(taxHolidayCalc) + "\n");
		System.out.println(cigars.accept(taxHolidayCalc) + "\n");

	}

}
