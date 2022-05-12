package s10.test.command;

public class ProgMain {

	public static void main(String[] args) {
		Chef c1 = new Chef("Michael");
		Chef c2 = new Chef("Rose");
		
		Waiter waiter = new Waiter();
		waiter.noteOrder(new PizzaOrder(c1, "Diavola"));
		waiter.noteOrder(new PizzaOrder(c2, "Margerita"));
		waiter.noteOrder(new PastaOrder(c1, "Carbonara"));
		waiter.sendOrders();
	}

}
