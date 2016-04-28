
public class Rectangle implements Shape{

	private int vertices = 4;
	
	public void draw(){
		System.out.println("Drawing a rectangle");
	}
	
	public int getVertices(){
		return vertices;
	}
	
}
