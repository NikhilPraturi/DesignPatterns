package solidprinciples.liskov;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(20);
		rectangle.setHeight(30);
//		compute(rectangle);
		Square square = new Square();
		square.setSide(20);
//		compute(square);
		
		useRectangle(rectangle);
	}
	public static void compute(Shape shape) {
		System.out.println(shape.computeArea());
	}
	
	public static void useRectangle(Rectangle rectangle) {
		assert rectangle.getHeight() == 20 : "not a valid height";
		assert rectangle.getWidth() == 20 : "not a valid width";
	}
}
