
public class Main {

	public static void main(String[] args){
		
		ShapeFactory generateShape = new ShapeFactory();
		
		Shape shape1 = generateShape.createShape("circle");
		Shape shape2 = generateShape.createShape("triangle");
		Shape shape3 = generateShape.createShape("rectangle");
		
		shape1.draw();
		shape2.draw(); 
		shape3.draw();
		
	}
	
	
}
