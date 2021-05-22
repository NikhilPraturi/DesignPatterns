package solidprinciples.isp;

public class VergBurger implements Burger {

	private void addIngredients() {

		System.out.println("add vegetables");
	}

	@Override
	public void addSauce() {
		System.out.println("add tomato sauce");
	}

	@Override
	public void bakeBurger() {
		System.out.println("bake for 20 mins");

	}

}
