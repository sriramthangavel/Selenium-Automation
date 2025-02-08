package Episode33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Chrome drivers\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver Driver1 = new ChromeDriver();
		Driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver1.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver1.findElement(By.id("inputUsername")).sendKeys("Sriram");
		Driver1.findElement(By.name("inputPassword")).sendKeys("dfghjk");
		Driver1.findElement(By.className("signInBtn")).click();
		String text = Driver1.findElement(By.cssSelector("p.error")).getText();
		System.out.println(text);
		Driver1.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		Driver1.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
		Driver1.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		Driver1.findElement(By.xpath("//input[@type='text'][2]")).clear();
		Driver1.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		Driver1.findElement(By.xpath("//form/input[3]")).sendKeys("741258963");
		Driver1.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(Driver1.findElement(By.cssSelector("form p")).getText());
		Driver1.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		Driver1.findElement(By.id("inputUsername")).sendKeys("rahul");
		Driver1.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Driver1.findElement(By.id("chkboxOne")).click();
		//Driver1.findElement(By.id("chkboxTwo")).click();
		//Driver1.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Driver1.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(Driver1.findElement(By.xpath("//div[@class='login-container']/p")).getText());
		Driver1.close();
}
}