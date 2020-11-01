package fr.dauphine.ja.nizardjade.td02;


public class Main {

	public static void main(String[] args) throws Exception {
		Expr val = new Value(1337.0);
		System.out.println(val.eval());//affiche 1337.0 
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval());//affiche 1664.0 
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); //affiche 2014.0
		System.out.println(add);
		Expr m = new Multiply(new Value(2), e);
		System.out.println(m);
		System.out.println(m.eval()); //affiche 2014.0
		
		
		Expr test = new Value(169.0);
		Expr sq = new SquareRoot(test);
		System.out.println(sq);
		
		Expr sq2 = new SquareRoot(test);
		System.out.println(sq2.eval());
		System.out.println(sq2);
}
}
