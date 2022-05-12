package s10.test.state;

import javax.naming.OperationNotSupportedException;

public class ProgMain {

	public static void main(String[] args) throws OperationNotSupportedException {
		Employee employee = new Employee();
		employee.setCurrentState(EState.WORKING);
		employee.act("Excel");
		employee.setCurrentState(EState.VACATION);
		employee.act("Server down");
	}

}
