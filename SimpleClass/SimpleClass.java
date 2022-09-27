import simplepackage.Rectangle;

public class SimpleClass {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(20, 30); // "constructing" an object
		Rectangle rectangle2 = new Rectangle(900, 100); 
		
		System.out.println("Rectangle 1 width " + rectangle1.getWidth());
		System.out.println("Rectangle 1 height " + rectangle1.getHeight());
		System.out.println("Rectangle 1 area " + rectangle1.getArea());
		System.out.println();
		System.out.println("Rectangle 2 width " + rectangle2.getWidth());
		System.out.println("Rectangle 2 height " + rectangle2.getHeight());
		System.out.println("Rectangle 2 area " + rectangle2.getArea());
	}
}
