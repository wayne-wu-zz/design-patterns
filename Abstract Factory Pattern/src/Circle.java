
public class Circle implements Shape {
	
	private int vertices = Integer.MAX_VALUE;
	
	public void draw(){
		System.out.println("Drawing a circle");
	}
	
	public int getVertices(){ 
		return vertices; 
	}
	
}
