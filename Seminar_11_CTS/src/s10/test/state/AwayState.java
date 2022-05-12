package s10.test.state;

public class AwayState implements IState {

	@Override
	public void act(String task) {
		System.out.println("This employee will prioritize this: " + task);
	}

}
