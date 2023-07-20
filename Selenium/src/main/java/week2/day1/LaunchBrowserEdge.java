package week2.day1;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowserEdge {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
}
}