package s10.test.chain;

public abstract class AHandler {
	protected AHandler successor;
	
	public abstract void processOrder(Order o);
	public void setSuccessor(AHandler successor ) {
		this.successor = successor;
	}
		
}
