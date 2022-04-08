package semrinar6.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bookstore carturesti = Bookstore.loadDataFromDB("carturesti");
		System.out.println(carturesti);
		
		Bookstore diverta = carturesti;
		diverta.getListBooks().remove(2);
		
		System.out.println("SHALLOW COPY");
		System.out.println(carturesti);

	}

}
