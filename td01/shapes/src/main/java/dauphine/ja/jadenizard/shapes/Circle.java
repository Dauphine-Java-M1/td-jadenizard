package dauphine.ja.jadenizard.shapes;

public class Circle {

	private Point center;
	private int rayon;
	
	
	
	public Circle(Point center, int rayon) {
		this.center = center;
		this.rayon = rayon;
	}
	
	public Point getcenter() {
		return center;
	}

	public void setcenter(Point center) {
	this.center = center;
	}

	 public int getRayon() {
	return rayon;
	}

	 public void setRayon(int rayon) {
	this.rayon = rayon;
	}

	 @Override
	public String toString() {
		 return "Circle [center=" + center + ", rayon=" + rayon + ", surface=" + this.surface()+"]";
	}
	

	 
	public void translate(int dx, int dy) {
		center.translate(dx, dy);
	}
	
	
	public Point getCenter() {
		return center;
	}
	
	
	public double surface() {
		return (Math.PI * rayon * rayon);
	}
	

	public boolean contains(Point p) {
		return Math.sqrt(Math.pow(p.getX() - center.getX(),2) + Math.pow(p.getY() - center.getY(),2)) <= rayon;
	}

	
	public static boolean contains(Point p, Circle...circles) {
		for(Circle c:circles) {
			if(c.contains(p)) {
				return true;
			}
		}
		return false;
	}
	

	 
	 
	 
	public static void main(String[] args) {
	Point p1 = new Point(1,2);
	Point p3 = new Point(1,4);
	Point p4 = new Point(1,4);
	Point p5 = new Point(2,2);
	Point p6 = new Point(3,3);

	Circle c2 = new Circle(p5,1);
	Circle c3 = new Circle(p6,1);
	Circle c4 = new Circle(p3,1);
	c2.translate(1,1);

	System.out.println(contains(p4,c3,c4)); 
	}
	
	
	
	
	
}
