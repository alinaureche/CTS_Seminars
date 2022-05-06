package composite;

public class ProgMain {

	public static void main(String[] args) throws Exception {
		Structure menu= new Structure("Menu");
       Structure menuDrinks= new Structure("Drinks");
       Structure menuFood=new Structure("Food");
       menu.addNode(menuFood);
       menu.addNode(menuDrinks);
       Structure AlcMenu= new Structure("AlcMenu");
       Structure NonAlcMenu= new Structure("NonAlcMenu");
       menuDrinks.addNode(NonAlcMenu);
       menuDrinks.addNode(AlcMenu);
       Node pizzaCarbonara= new Node("Pizza Carbonara",25);
       menuFood.addNode(pizzaCarbonara);
       menuFood.addNode(new Node("paste Carbonara",27));
       System.out.println(menu.getInfo());
     
       
	}

}
