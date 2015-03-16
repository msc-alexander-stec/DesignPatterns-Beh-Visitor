package pkg.element;
import pkg.visitor.Visitor;

public interface Element {

	public double accept(Visitor visitor);

}
