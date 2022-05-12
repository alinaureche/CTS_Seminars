package s10.test.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	private List<IOrder> ordersList = new ArrayList<IOrder>();
	
	public void noteOrder(IOrder command) {
		this.ordersList.add(command);
	}
	
	public void sendOrders() {
		for(IOrder o : ordersList) {
			o.processOrder();
		}
		ordersList.clear();
	}
}

