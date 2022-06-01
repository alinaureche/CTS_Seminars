package classes;

import interfaces.IPerson;

public class Person implements IPerson{
	private String name;
	private String personalNumber;
	private double[]costReceipt;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}
	public double[] getCostReceipt() {
		return costReceipt;
	}
	public void setCostReceipt(double[] costReceipt) {
		this.costReceipt = costReceipt;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
		super();
	}
	public Person(String name, String personalNumber, double[] costReceipt, int age) {
		super();
		this.name = name;
		this.personalNumber = personalNumber;
		this.costReceipt = costReceipt;
		this.age = age;
	}
	
	@Override
	public double getAvgCosts() throws Exception {
		if(this.costReceipt==null || this.costReceipt.length==0)
			throw new Exception();
		double sum=0;
		for(int i=0; i<this.costReceipt.length; i++)
			sum+=this.costReceipt[i];
		return sum/this.costReceipt.length;
	}
}
