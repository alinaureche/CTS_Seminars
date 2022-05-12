package s10.test.command;

public class PizzaOrder implements IOrder {
	private Chef chef;
	private String pizzaType;
	
	public PizzaOrder(Chef chef, String pizzaType) {
		super();
		this.chef = chef;
		this.pizzaType = pizzaType;
	}
	
	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	@Override
	public void processOrder() {
		this.chef.cookPizza(this.pizzaType);
	}

}
