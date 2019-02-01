
public class ShapesClient {
	public static void main(String[] args) {
		Shapes rp = new Rectangular(3,4,5);
		System.out.println(rp.getVolume());
		Shapes tp = new Triangular(3,4,5);
		System.out.println(tp.getSurfaceArea());
	}
}
