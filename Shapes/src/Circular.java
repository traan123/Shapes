
public class Circular implements Shapes{
	private double r;
	private double l;
	private double h;
	
	public Circular(double r, double l, double h) {
		this.r = r;
		this.l = l;
		this.h = h;
	}
	
	public double getVolume() {
		return Math.pow(r,2) * l * Math.PI;
	}
	
	public double getSurfaceArea() {
		return (2 * Math.PI * r * l) + (2 * Math.PI * Math.pow(r,2));
	}
	
	public double getL() {
		return l;
	}
	
	public double getR() {
		return r;
	}
	
	public double getH() {
		return h;
	}
}
