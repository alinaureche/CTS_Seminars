package eu.ase.ro.solid.o.resolved;

public class VendorEmployee extends Employee {
	
	public VendorEmployee(int id, String name, float salary) {
		super(id, name, salary);
	}

	@Override
	public float calculateBonus() {
		// TODO Auto-generated method stub
		return this.getSalary()*.05f;
	}

}
