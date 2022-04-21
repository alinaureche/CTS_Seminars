package adapter;

public class DiscountA implements IDiscountA {

	@Override
	public double calculateDiscountA(int value) {
		// TODO Auto-generated method stub
		
		System.out.println("Method A ");
		
		// value = total nr orders
		
		if (value > 100) {
			return 0.1;
		}
		if (value > 50 && value <= 100) {
			return 0.05;
		}
		
		return 0;
	}

}
