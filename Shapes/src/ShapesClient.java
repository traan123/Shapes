
public class ShapesClient {
	public static void main(String[] args) {
		Shapes rp = new Rectangular(4,10,2);
		System.out.println("Rectangular Prism");
		System.out.println(rp.getSurfaceArea() + " Surface Area");
		System.out.println(rp.getVolume() + " Volume");
		
		Shapes tp = new Triangular(4,10,3);
		System.out.println("Triangular Prism");
		System.out.println(tp.getSurfaceArea() + " Surface Area");
		System.out.println(tp.getVolume() + " Volume");
		
		Shapes cube = new Cube(2,2,2);
		System.out.println("Cube");
		System.out.println(cube.getSurfaceArea() + " Surface Area");
		System.out.println(cube.getVolume() + " Volume");
		
		Shapes sphere = new Sphere(2,0,0);
		System.out.println("Sphere");
		System.out.println(sphere.getSurfaceArea() + " Surface Area");
		System.out.println(sphere.getVolume() + " Volume");
		
		Shapes cylinder = new Cylinder(2,10,0);
		System.out.println("Cylinder");
		System.out.println(cylinder.getSurfaceArea() + " Surface Area");
		System.out.println(cylinder.getVolume() + " Volume");
		
		Shapes cone = new Cone(2,0,10);
		System.out.println("Cone");
		System.out.println(cone.getSurfaceArea() + " Surface Area");
		System.out.println(cone.getVolume() + " Volume");
	}
}
