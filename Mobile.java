package week1.day1;

public class Mobile {
	
	String mobileModel = "OnePlus 9";
	int mobileWeight = 1;
	Boolean isFullCharge = true;
	double mobileCost = 50000;
	
	public void makeCall() {
		
		System.out.println("Call Connected");
	}

	public void sendMsg() {
		System.out.println("Message Sent");
	}
	
	public static void main(String[] args) {
		Mobile Cell1 = new Mobile();
		
		Cell1.makeCall();
		Cell1.sendMsg();
		System.out.println("My Phone model is " +Cell1.mobileModel);
		System.out.println(Cell1.mobileWeight);
		System.out.println(Cell1.isFullCharge);
		System.out.println(Cell1.mobileCost);
		
	}
}
