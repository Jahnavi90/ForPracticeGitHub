package week1.day1;

public class Mobile {
public void sendSMS() {
	System.out.println("Hi, SMS sent successfully");
}
public void takeSnap() {
	System.out.println("Snap saved in Gallery");
}
public static void main(String[] args) {
	Mobile mob = new Mobile();
	mob.sendSMS();
	mob.takeSnap();
}
}
