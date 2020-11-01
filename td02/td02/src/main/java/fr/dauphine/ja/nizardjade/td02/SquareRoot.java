package fr.dauphine.ja.nizardjade.td02;

public class SquareRoot extends Expr{

	private Expr expr;

	
	public SquareRoot(Expr expr) {
		this.expr = expr;
	}
	
	@Override
	public double eval() {
		double nb = Math.sqrt(expr.val);
		super.val= nb;
		return nb;

	}

	@Override
	public String toString() {
		return "\u221a " + expr ;
	}
	
}
