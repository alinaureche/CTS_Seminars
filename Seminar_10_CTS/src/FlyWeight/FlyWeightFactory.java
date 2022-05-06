package FlyWeight;

public class FlyWeightFactory {
    private static Map<ReceiptEnum,,Receipt> listReceipe= new HashMap<ReceiptEnum,Receipt>();
    public Receipt getReceipt(ReceiptType type) {
    	Receipt = new Receipt(type);
    	listReceipe.put(type,receipt);
    	return receipt;
    /*	switch(type) {
    	case:type:{
    		
    	}
    	default:
    		throw new IllegalArgumentException();
    	}*/
    }
}
