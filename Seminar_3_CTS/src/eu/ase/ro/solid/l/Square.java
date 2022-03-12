package eu.ase.ro.solid.l;

public class Square extends Rectangle {

	public void setWidth(int val) {
		super.setWidth(val);
		super.setHeight(val);
	}
	
	public void setHeight(int val) {
		super.setWidth(val);
		super.setHeight(val);
	}
	
}
