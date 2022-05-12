package s10.test.state;

public class WorkingState implements IState {

	@Override
	public void act(String task) {
		System.out.println("This employee works on: " + task);
	}

}
