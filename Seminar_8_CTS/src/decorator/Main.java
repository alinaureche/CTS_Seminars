package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		APizza pizzaBasic = new PizzaBasic();
		System.out.println("Pizza basic");
		pizzaBasic.getIngredients();
		pizzaBasic.calculateCost();
		
		APizza aPizza = new DecoratorChickenPizza(pizzaBasic);
		System.out.println("\n-----------------\nChicken pizza ");
		aPizza.getIngredients();
		aPizza.calculateCost();
	}

}
