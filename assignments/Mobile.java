package week1.day1.assignments;

public class Mobile {
	
	public void makeCall(String mobileModel, float mobileWeight) {
		System.out.println("Mobile model is:" +mobileModel+ "\n"+ "Mobile weight is : " +mobileWeight);
	}
	public void sendMsg(Boolean isFullCharged, int mobileCost) {
		System.out.println("Mobile is full charged:" +isFullCharged+ "\n"+ "Mobile cost is : " +mobileCost);
	}

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.makeCall("Redmi", 123.45f);
		m.sendMsg(true, 1000);
		
	}

}
