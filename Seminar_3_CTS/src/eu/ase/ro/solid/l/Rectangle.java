package eu.ase.ro.solid.l;

public class Rectangle {
	
	int width;
	int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public int getArea() {
		return this.height*this.width;
	}

}
