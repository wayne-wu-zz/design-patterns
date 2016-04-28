
public class Main {

	public static void main(String[] args){
		
		MealBuilder mealbuilder = new MealBuilder(); 
		mealbuilder.prepareBigMac(2);
		mealbuilder.prepareWhopper(1);
		
		mealbuilder.meal.showItem();
		
		System.out.printf("Total Cost: %f", mealbuilder.meal.getCost());
		
	}
	
}
