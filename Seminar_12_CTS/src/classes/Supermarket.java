package classes;

import java.util.ArrayList;

import exc.ExceptionNullMarket;

public class Supermarket {

	private String name;
	//private int area;
	private ArrayList<Market> listMartkets;
	public Supermarket(String name, ArrayList<Market> listMartkets) {
		super();
		this.name = name;
		this.listMartkets = listMartkets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Market> getListMartkets() {
		return listMartkets;
	}
	public void setListMartkets(ArrayList<Market> listMartkets) {
		this.listMartkets = listMartkets;
	}
	
	
	
	public String getBiggestMartkeByArea(ETypeMarket type) throws ExceptionNullMarket {
		
		if (type == null || this.listMartkets.size() == 0 || this.listMartkets == null) {
			throw new ExceptionNullMarket();
		}
		
		String nameMaxMarket = "";
		float areaMax = -1;
		for(int i = 0; i < this.listMartkets.size(); i ++) {
			
			if (areaMax < this.listMartkets.get(i).getArea() && this.listMartkets.get(i).getTypeMarket() == type) {
				areaMax = this.listMartkets.get(i).getArea(); 
				nameMaxMarket = this.listMartkets.get(i).getName();
			}
		}
		
		return nameMaxMarket;
	}
}
