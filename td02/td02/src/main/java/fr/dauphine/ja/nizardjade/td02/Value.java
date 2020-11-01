package fr.dauphine.ja.nizardjade.td02;



public class Value extends Expr {
	
	
	public Value (double val) {
		super.val =val;
	}
	
	@Override
	public double eval() {
		return super.val;
	}

}
