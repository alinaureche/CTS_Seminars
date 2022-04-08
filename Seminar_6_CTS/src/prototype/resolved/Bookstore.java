package prototype.resolved;

import java.util.ArrayList;

public class Bookstore implements Cloneable {
	
	private String name;
	private ArrayList<Book>listBooks = new ArrayList<>();
	
	public Bookstore(String name, ArrayList<Book> listBooks) {
		super();
		this.name = name;
		this.listBooks = listBooks;
	}
	
	
	public Bookstore() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getListBooks() {
		return listBooks;
	}
	public void setListBooks(ArrayList<Book> listBooks) {
		this.listBooks = listBooks;
	}
	
	
	@Override
	public String toString() {
		return "Bookstore [name=" + name + "]";
	}
	
	
	public static Bookstore loadDataFromDB(String name) {
		Bookstore b = new Bookstore();
		b.setName(name);
		
		
		Book book;
		for(int i = 0; i < 10; i ++) {
			book = new Book(name + " - " + i, "alina", i*100);
			b.listBooks.add(book);
			book = null;
		}
		
		return b;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		
		Bookstore bClone = new Bookstore();
		bClone.name = this.name;
		bClone.listBooks = (ArrayList<Book>) this.listBooks.clone();
		
		return bClone;
	}
	
	

}
