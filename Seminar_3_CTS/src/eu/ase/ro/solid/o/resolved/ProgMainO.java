package eu.ase.ro.solid.o.resolved;

public class ProgMainO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empJohn = new FteEmployee(1, "John", 2000);
		System.out.println(empJohn.toString() + " BONUS:" + empJohn.calculateBonus());
		
		Employee empMichael = new VendorEmployee(1, "Michael", 2000);
		System.out.println(empMichael.toString() + " BONUS:" + empMichael.calculateBonus());
		
		Employee empMada = new ContractEmployee(1, "Mada", 2000);
		System.out.println(empMada.toString() + " BONUS:" + empMada.calculateBonus());
	}
	

}
