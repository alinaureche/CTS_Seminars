package s10.test.chain;

public class Chef extends AHandler{

	@Override
	public void processOrder(Order o) {
		if(o.getDifficulty() > 5) {
			System.out.println("The chief is handling this: " + o.getName());
		}
		
	}

}
