
public class Prism implements Shapes{
	private double w;
	private double l;
	private double h;
	
	public Prism(double w, double l, double h) {
		this.w = w;
		this.l = l;
		this.h = h;
	}
	
	public double getVolume() {
		return w*l*h;
	}
	
	public double getSurfaceArea() {
		return 2*(w*l + l*h + h*w);
	}
	
	public double getL() {
		return l;
	}
	
	public double getW() {
		return w;
	}
	
	public double getH() {
		return h;
	}
}
