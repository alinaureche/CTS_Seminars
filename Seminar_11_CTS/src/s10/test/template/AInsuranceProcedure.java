package s10.test.template;

public abstract class AInsuranceProcedure {
	protected abstract void identifyDamage();
	protected abstract void evaluateDamage();
	protected abstract void sendInsurance();
	
	//Template method
	public  void giveInsurance() {
		identifyDamage();
		evaluateDamage();
		sendInsurance();
	}
}
