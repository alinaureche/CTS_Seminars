package eu.ase.ro.solid.o;

public class Employee {

	private int ID;
	private String name;
	private float salary;
	private String employeeType;
	
	public Employee() {
	
	}
	
	public Employee(int iD, String name, float salary, String employeeType) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.employeeType = employeeType;
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
	
	

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	
	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", salary=" + salary + ", employeeType=" + employeeType + "]";
	}

	public float calculateBonus() {
		if(this.employeeType == "FTE") {
			return this.salary*.1f;
		}
		else {
			return this.salary*.05f;
		}
	}
	
	
	
}
