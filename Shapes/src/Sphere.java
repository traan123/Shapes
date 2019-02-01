
public class Sphere extends Circular{

	public Sphere(double r, double l, double h) {
		super(r, l, h);
	}
	
	public double getVolume() {
		return (4 / 3) * Math.PI * Math.pow(super.getR(), 3);
	}
	
	public double getSurfaceArea() {
		return 4 * Math.PI * Math.pow(super.getR(), 2);
	}

}
