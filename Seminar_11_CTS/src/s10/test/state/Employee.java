package s10.test.state;

import javax.naming.OperationNotSupportedException;

public class Employee {
	IState currentState;

	public IState getCurrentState() {
		return currentState;
	}

//	public void setCurrentState(IState currentState) {
//		this.currentState = currentState;
//	}
	
	public void setCurrentState(EState state) throws OperationNotSupportedException {
		switch(state) {
		case WORKING: {
			this.currentState = new WorkingState();
			break;
		}
		case VACATION: {
			this.currentState = new VacationState();
			break;
		}
		case AWAY: {
			this.currentState = new AwayState();
			break;
		}
		default: {
			throw new OperationNotSupportedException();
		}
		}
	}
	
	public void act(String task) {
		this.currentState.act(task);
	}
	
}
