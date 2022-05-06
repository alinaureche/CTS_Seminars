package FlyWeight;

public class Receipt implements IReceipt{
     private ReceiptEnum receiptType;
     
	public Receipt(ReceiptEnum receiptType) {
		super();
		this.receiptType = receiptType;
	}    
	

	public ReceiptEnum getReceiptType() {
		return receiptType;
	}


	public void setReceiptType(ReceiptEnum receiptType) {
		this.receiptType = receiptType;
	}

   
	@Override
	public void printReceipt(ReceiptData data) {
		System.out.println("This is a receuot " + receiptType);
		
	}

}
