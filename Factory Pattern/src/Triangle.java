
public class Triangle implements Shape{

	private int vertices = 3;
	
	public void draw(){ 
		System.out.println("Drawing a triangle");
	}
	
	public int getVertices(){ 
		return vertices;
	}
	
}
