package dauphine.ja.jadenizard.shapes;

import java.util.ArrayList;
import java.util.LinkedList;

public class BrokenLine {

	private int capacity;
	private LinkedList<Point> line;



	public BrokenLine(int capacity, LinkedList<Point> line) {
		if (line.size() > capacity) {
			throw new IllegalArgumentException("Your broken line has more points than allowed.");
		}
		this.capacity = capacity;
		this.line = line;
	 }

	
	public void add (Point p) {
		if(line.size() + 1 > capacity) {
			throw new IllegalArgumentException("You can't add another point to this broken line");
		}
		line.add(p);
	}
	
	 public int pointCapacity() {
		 return capacity;
	 }
	
	 public int nbPoints() {
		 return line.size();
	 }
	

	public boolean contains(Point p) {
		for(Point point : line) {
			if(point.equals(p)) {
				return true;
			}
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "BrokenLine [capacity=" + capacity + ", line=" + line + "]";
	}
	
	
	public static void main(String[] args) {
	int nb_max = 4;
	Point p0=new Point(0,0);
	Point p1=new Point(1,1);
	Point p2=new Point(2,2);
	Point p3=new Point(4,4);
	
	LinkedList<Point> line1 = new LinkedList<Point>();
	line1.add(p0);
	line1.add(p1);
	line1.add(p2);

	BrokenLine brokenLine1 = new BrokenLine(nb_max,line1);
	System.out.println(brokenLine1.nbPoints());
	System.out.println(brokenLine1.pointCapacity());
	System.out.println(brokenLine1.contains(p2));
	System.out.println(brokenLine1.contains(p3));
	
	}	

}
