package decorator;

public abstract class DecoratorPizza extends APizza {

	// concrete object
	protected APizza aPizza;
	
	@Override
	public void getIngredients() {
		// TODO Auto-generated method stub
		
		aPizza.getIngredients();
	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		
		aPizza.calculateCost();
	}

	public DecoratorPizza(APizza p) {
		super();
		this.aPizza = p;
	}

	
	
}
