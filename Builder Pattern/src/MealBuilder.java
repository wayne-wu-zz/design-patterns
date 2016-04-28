
public class MealBuilder {

	public Meal meal;
	
	public MealBuilder(){
		meal = new Meal(); 
	}
	
	public void prepareBigMac(int num){ 
		for(int i = 0; i< num; i++){
			meal.addItem(new BigMac());
			meal.addItem(new Coke());
		}
	}
	
	public void prepareWhopper(int num){
		for(int i =0; i< num; i++){
			meal.addItem(new Whopper());
			meal.addItem(new RootBeer());
		}
	}
	
}
