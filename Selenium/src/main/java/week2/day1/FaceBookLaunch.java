package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLaunch {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jantheunique@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("AatmaDhyaanam@143@");
		driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	System.out.println(title);
}
}
