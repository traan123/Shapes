
public class Triangular extends Prism{

	public Triangular(double w, double l, double h) {
		super(w, l, h);
	}
	
	public double getSurfaceArea() {
		return (2 * (super.getW()*super.getH()/2)) + ((Math.sqrt(Math.pow(super.getW()/2 , 2) + Math.pow(super.getH(), 2)) * super.getL()) * 3);
	}

}
