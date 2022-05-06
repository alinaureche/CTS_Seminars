package composite;

import java.util.ArrayList;

public class Structure extends ANode {
    private ArrayList<ANode> list=new ArrayList<ANode>();
    String nameStructure;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.nameStructure;
	}
    
	@Override
	public float getPrice() {
		throw new UnsupportedOperationException();
	}

	public Structure(ArrayList<ANode> list) {
		super();
		this.list = list;
	}

	public Structure(String string) {
         this.nameStructure=string;	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		//return super.getInfo();
		String info=" "+this.nameStructure+" \n";
		for(ANode node:list) {
			info+= " "+ node.getInfo()+" \n";
		}
		return info;
	}

	@Override
	public void addNode(ANode elem) throws Exception {
		// TODO Auto-generated method stub
		list.add(elem);
	}

	@Override
	public void removeNode(ANode elem) throws Exception {
		// TODO Auto-generated method stub
		list.remove(elem);
	}

	@Override
	public ANode getNode(int index) throws Exception {
		// TODO Auto-generated method stub
		return list.get(index);
	}
	

}
