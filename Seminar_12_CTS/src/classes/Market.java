package classes;

public class Market {

	private String name;
	private float area;
	private ETypeMarket typeMarket;
	public Market(String name, float area, ETypeMarket typeMarket) {
		super();
		this.name = name;
		this.area = area;
		this.typeMarket = typeMarket;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public ETypeMarket getTypeMarket() {
		return typeMarket;
	}
	public void setTypeMarket(ETypeMarket typeMarket) {
		this.typeMarket = typeMarket;
	}
	
	
	
}
