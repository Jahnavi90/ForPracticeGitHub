package week1.SeleniumSetUp;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetUp {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
}
