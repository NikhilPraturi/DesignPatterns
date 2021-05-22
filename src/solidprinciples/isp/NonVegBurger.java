package solidprinciples.isp;

public class NonVegBurger implements Burger {

	public void cookIngredients() {
	
		System.out.println("boil meat for certain degrees");
	}
	
	@Override
	public void addSauce() {
		System.out.println("add ketchup and soya sauce and chilli sauce");
		
	}

	@Override
	public void bakeBurger() {
		System.out.println("add stuff and bake for 25mins");
		
	}

}
