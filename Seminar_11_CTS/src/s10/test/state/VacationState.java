package s10.test.state;

public class VacationState implements IState{

	@Override
	public void act(String task) {
		System.out.println("This employee is unavaliable, cannot handle this: " + task);
	}

}
