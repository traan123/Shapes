
public class Cone extends Circular{

	public Cone(double r, double l, double h) {
		super(r, l, h);
	}
	
	public double getVolume() {
		return super.getH()/3 * Math.pow(super.getR(), 2) * Math.PI;
	}
	
	public double getSurfaceArea() {
		return Math.PI * super.getR() * (super.getR() + Math.sqrt(Math.pow(super.getH(), 2) + Math.pow(super.getR(), 2)));
	}

}
