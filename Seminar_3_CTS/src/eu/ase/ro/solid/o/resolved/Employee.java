package eu.ase.ro.solid.o.resolved;

public abstract class Employee {

	private int ID;
	private String name;
	private float salary;
//	private String employeeType;
	
	public Employee() {
	
	}
	
	public Employee(int iD, String name, float salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", salary=" + salary+"]";
	}

	public abstract float calculateBonus();
	
}
	
	
