package s10.test.chain;

public class Waiter extends AHandler {

	@Override
	public void processOrder(Order o) {
		if(o.getDifficulty() > 5) {
			System.out.println("Waiter cannot handle this: " + o.getName());
			this.successor.processOrder(o);
		} else {
			System.out.println("The waiter is handling this: " + o.getName());
		}
		
	}

}
