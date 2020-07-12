package calcu;

public class Quadrilaterals{

	private double side1;
	private double side2;
	
	public Quadrilaterals(double side1) {
		super();
		this.side1 = side2 = side1;
	}
	
	public Quadrilaterals(double side1, double side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}

	public double areaS(double side1) {
		double area = side1*side1;
		return area;
	}

	public double perimeterS(double side1) {
		double perimeter = 4*side1;
		return perimeter;
	}

	public double areaR(double side1, double side2) {
		double area = side1*side2;
		return area;
	}

	public double perimeterR(double side1, double side2) {
		double perimeter = 2*(side1+ side2);
		return perimeter;
	}
	
}
