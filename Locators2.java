package Episode33;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver","D:\\Chrome drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver Driver1 = new ChromeDriver();
		Driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(Driver1);
		Driver1.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver1.findElement(By.id("inputUsername")).sendKeys(name);
		Driver1.findElement(By.name("inputPassword")).sendKeys(password);
		Driver1.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(Driver1.findElement(By.xpath("//div[@class='login-container']/p")).getText());
		Assert.assertEquals(Driver1.findElement(By.xpath("//div[@class='login-container']/p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(Driver1.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		Driver1.findElement(By.xpath("//button[text()='Log Out']")).click();
		Driver1.close();
	}
	
	public static String getPassword(WebDriver Driver1) throws InterruptedException {
		
		Driver1.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver1.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		Driver1.findElement(By.xpath("//button[text()='Reset Login']")).click();
		String passwordText = (Driver1.findElement(By.cssSelector("form p")).getText());
		System.out.println(passwordText);
		String [] passwordArray1 = passwordText.split("'");
		String [] PasswordArray2 = passwordArray1 [1].split("'");
		String Password = PasswordArray2[0];
		return Password;
	}
	

}
