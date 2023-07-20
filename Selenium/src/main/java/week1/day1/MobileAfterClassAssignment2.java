package week1.day1;

public class MobileAfterClassAssignment2 {

	public void makeCall() {
		
		String mobileModel = "Motorola";
		float mobileWeight = 2.45F;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}

	public void sendSMS() {
		
		boolean isFullCharged = true;
		 int mobileCost = 15000;
		 System.out.println(isFullCharged);
		 System.out.println(mobileCost);
	}
public static void main(String[] args) {
	MobileAfterClassAssignment2 mob = new MobileAfterClassAssignment2();
	mob.makeCall();
	mob.sendSMS();
	
	System.out.println("This is my Mobile");
}
}
