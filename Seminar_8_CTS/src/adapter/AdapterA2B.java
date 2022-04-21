package adapter;

public class AdapterA2B extends DiscountB implements IDiscountA {

	@Override
	public double calculateDiscountA(int value) {
		// TODO Auto-generated method stub
		// in cazul acesta nu merge A2B ptc in A nu avem client
		
		
		return 0;
	}

}
