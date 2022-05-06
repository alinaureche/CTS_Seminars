package composite;

public abstract class ANode {
  public  abstract String getName();
  public  abstract float getPrice();
  public String getInfo() {
	   return this.getName()+this.getPrice();
  }
  public void addNode(ANode elem) throws Exception {
	  throw new Exception();
  }
  
  public void removeNode(ANode elem) throws Exception {
	  throw new Exception();
  }
  
  public ANode getNode(int index) throws Exception {
	   throw new Exception();
  }
}
