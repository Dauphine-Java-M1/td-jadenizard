package dauphine.ja.jadenizard.shapes;

public class Ring extends Circle {

	private int rayonInt;
	
	
	
	public Ring(Point center, int rayon, int rayonInt) {
		super(center, rayon);
		if(rayonInt > rayon) {
			throw new IllegalArgumentException("Votre rayon interne est plus grand que le rayon de l'anneau.");
		}
		this.rayonInt = rayonInt;
	}
	
	@Override
	public boolean equals(Object o2) {
		if (!(o2 instanceof Ring)) {
			return false;
		}
	
		Ring r2 = (Ring) o2;
		return this.getRayon() == r2.getRayon() && rayonInt == r2.rayonInt && this.getcenter() == r2.getcenter();
	}

	@Override
	public String toString() {
		return "Ring [rayon interne=" + rayonInt + ", rayon externe="+super.getRayon()+", center="+super.getcenter()+"]";
	}
	
	

	@Override
	public boolean contains(Point p) {
		return ( super.contains(p) && ( Math.sqrt(Math.pow(p.getX() - super.getcenter().getX(),2) + Math.pow(p.getY() - super.getcenter().getY(),2)) >= rayonInt));
	}
	
	
	public static boolean contains(Point p, Ring...rings) {
		for(Ring r:rings) {
			if(r.contains(p)) {
				return true;
			}
		}
		return false;
	}

	 public static void main(String[] args) {
	Point p = new Point(1,1);
	Point p3 = new Point(2,2);
	Point p2 = new Point(2,2);
	Point p5 = new Point(5,5);
	Point p4 = new Point(1,3);
	Ring r = new Ring(p,3,1);
	Ring r2 = new Ring(p3,2,1);
	Ring r5 = new Ring(p,3,1);
	System.out.println(r);
	System.out.println(r.contains(p));
	System.out.println(r.contains(p4));
	System.out.println(contains(p2,r5,r));
	System.out.println(contains(p5,r5,r));

	 }
	
}
