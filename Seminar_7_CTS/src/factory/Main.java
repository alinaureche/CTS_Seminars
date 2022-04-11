package factory;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		FactoryWeapon factory = new FactoryWeapon();
		
		try {
			IWeapon weapon = FactoryWeapon.create(200); 
			// hide this: = new MagicWeapon();
			
			weapon.power();
		}catch (Exception e) {
			
		}
		
		
	}
	


}
