package FlyWeight;

public class ProgMain {
     public static void main(String[] args) {
     	 Receipt[] listReceipt= new Receipt(ReceiptEnum type);
           ReceiptData[] listReceiptData= newReceiptData[50];
           for(int i=0;i<60;i++) {
        	   listReceipt[i]=FlyWeightFactory.getReceipt(ReceiptEnum.valueOf("FORMAT" + i%3+1));
        	   ReceiptData data= new ReceiptData(100+i);
        	   
           }
     
     }
}
