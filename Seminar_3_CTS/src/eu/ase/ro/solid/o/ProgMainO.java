package eu.ase.ro.solid.o;

public class ProgMainO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empJohn = new Employee(1, "John", 2000, "FTE");
		System.out.println(empJohn.toString() + " BONUS:" + empJohn.calculateBonus());
		
		Employee empMichael = new Employee(1, "Michael", 2000, "Vendor");
		System.out.println(empMichael.toString() + " BONUS:" + empMichael.calculateBonus());
	}
	

}
