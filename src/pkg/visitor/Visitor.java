package pkg.visitor;
import pkg.element.concr.Liquor;
import pkg.element.concr.Necessity;
import pkg.element.concr.Tobacco;

public interface Visitor {

	public double visit(Liquor liquorItem);

	public double visit(Tobacco tobacoItem);

	public double visit(Necessity necessityItem);

}
