package fr.dauphine.ja.nizardjade.td02;


public class Multiply extends Expr {
	
	private Value val1;
	private Expr expr;
	
	public Multiply(Value val1, Expr expr) {
		super();
		this.val1 = val1;
		this.expr = expr;
	}
	
	@Override
	public double eval() {
		double total = super.val + expr.val * val1.eval() ;
		super.val= total;
		return super.val;
	}
	
	@Override
	public String toString() {
		return "Expression de " + val1 + " multipliée à ( " + expr + ")" ;
	}
}
