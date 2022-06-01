package mock;

import interfaces.IPerson;

public class PersonMock implements IPerson{
	private String name;
	private String personalNumber;
	private double[]costReceipt;
	private int age;

	public PersonMock() {
		super();
		this.name = "Lar";
		this.personalNumber = "0123456789";
		this.age = 16;
	}
	public String getName() {
		return name;
	}
	public String getPersonalNumber() {
		return personalNumber;
	}
	public double[] getCostReceipt() {
		return costReceipt;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public double getAvgCosts() throws Exception {
		// TODO Auto-generated method stub
		return (Double)null;
	}
}
