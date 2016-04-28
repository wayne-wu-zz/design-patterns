
public class MasterFactory {
	public static AbstractFactory generateFactory(String factory){ 
		
		if(factory.equalsIgnoreCase("SHAPE")) 
			return new ShapeFactory(); 
		else if(factory.equalsIgnoreCase("COLOUR")) 
			return new ColourFactory();
		
		return null;
	}
	
	
}
