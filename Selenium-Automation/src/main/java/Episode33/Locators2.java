package Episode33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Chrome drivers\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver Driver1 = new ChromeDriver();
		Driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver1.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver1.findElement(By.id("inputUsername")).sendKeys("rahul");
		Driver1.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Driver1.findElement(By.className("signInBtn")).click();
		System.out.println(Driver1.findElement(By.xpath("//div[@class='login-container']/p")).getText());
		Driver1.close();
	}

}
