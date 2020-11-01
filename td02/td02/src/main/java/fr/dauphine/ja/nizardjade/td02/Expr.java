package fr.dauphine.ja.nizardjade.td02;


public class Expr {
	
	double val;
	
	public double eval() {
		return(val);
	}
	
	@Override
	public String toString() {
		return "valeur :" + val ;
	}
}
