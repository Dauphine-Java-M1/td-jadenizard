package dauphine.ja.jadenizard.shapes;

import java.util.ArrayList;

public class Point {

	private int x;
	private int y;
	private static int cpt =0;
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		cpt++;
	}

	
	public Point ( Point p) {
		this.x=p.getX();
		this.y=p.getY();
	}
	
	


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}



	@Override
	public boolean equals(Object o2) {
		if (!(o2 instanceof Point)) {
			return false;
		}
		Point p2 = (Point) o2;
		return x == p2.x && y == p2.y;
	}


	@Override
	public String toString() {
		return " (" + x + "," + y + ")";
	}
	
	
	
	public boolean isSamePoint(Point p) {
		return this.getX()==p.getX() && this.getY()==p.getY();
	}


	
	public void translate(int dx, int dy) {
		x = dx;
		y = dy;
	}
	
	
	public static void main(String[] args) {
		Point p=new Point(2,4);
		System.out.println(p.x+" "+p.y);
		System.out.println(p);

		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3) + "\n");
		
		
	}

}
