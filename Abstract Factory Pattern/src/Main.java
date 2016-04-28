
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shapeFactory = MasterFactory.generateFactory("Shape");
		
		Shape shape1 = shapeFactory.createShape("Circle");
		Shape shape2 = shapeFactory.createShape("Triangle");
		Shape shape3 = shapeFactory.createShape("Rectangle");
		
		shape1.draw();
		shape2.draw(); 
		shape3.draw(); 
		
		AbstractFactory colourFactory = MasterFactory.generateFactory("Colour");
		
		Colour red = colourFactory.fillColour("Red");
		Colour blue = colourFactory.fillColour("Blue");
		Colour green = colourFactory.fillColour("Green");
		
		red.fill(); 
		blue.fill(); 
		green.fill();
		
		
	}

}
