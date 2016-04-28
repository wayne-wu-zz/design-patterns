
public class SingleObject {

	private static SingleObject instance = new SingleObject();  
	//static makes sure that it's the only instance
	
	private SingleObject(){} //cannot call constructor from outside

	public static SingleObject getInstance(){ 
		return instance;
	}
	
	public void print(){ 
		System.out.println("SingleObject");
	}
	
}
