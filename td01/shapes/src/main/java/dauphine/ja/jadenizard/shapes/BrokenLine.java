package dauphine.ja.jadenizard.shapes;

import java.util.ArrayList;

public class BrokenLine {

	private Point[] tab;
	private int nbMax;

	
	public BrokenLine(Point[] tab, int nbMax) {
		if (nbMax<tab.length) {
			throw new IllegalArgumentException("Your tab is bigger than what can fit  in out broken line");
		}
		this.nbMax = nbMax;
		this.tab = new Point[nbMax];
	
		for (int i =0; i<nbMax; i++) {
			this.tab[i]=tab[i];
		}
	}
	
	
	public void add(Point p) {
		
		//TODO();
	}
	
	
	
	
}
