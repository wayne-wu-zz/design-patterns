
public class ColourFactory extends AbstractFactory {

	public Shape createShape(String shape){ 
		return null;
	}
	
	Colour fillColour(String colour){
		
		if(colour == null) return null; 
		
		if(colour.equalsIgnoreCase("RED")) return new Red();
		if(colour.equalsIgnoreCase("BLUE")) return new Blue();
		if(colour.equalsIgnoreCase("GREEN")) return new Green();
		
		return null; 
	}
	
	
}
