package adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []v = new int[2];
		v[0] = 100;
		v[1] = 150;
		Client c = new Client("Alina", 2, v);
		IDiscountB discount = new AdapterB2A();
		
		discount.calculateDiscountB(c);
	}

}
