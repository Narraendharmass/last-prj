package mySel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MainDemo {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Narraen\\Downloads\\firefoxdriver\\geckodriver.exe");
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	WebDriver driver = new FirefoxDriver(capabilities);
	capabilities.setCapability("marionette", true);
	driver.navigate().to("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("yahoo");
	driver.findElement(By.className("gNO89b")).click();



	


}
}
