package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.testng.annotations.Test;
import base.BaseTest;


public class MyFirstTest extends BaseTest{
	
	@Test
	public static void LoginTest() throws IOException {
		
		
		//Date currentdate = new Date();
	
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath(loc.getProperty("login_Button"))).click();
		//driver.findElement(By.xpath(loc.getProperty("email_Field"))).sendKeys("82966shwe@gmail.com");
		//driver.findElement(By.xpath(loc.getProperty("login_Button"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_Icon"))).click();
		driver.findElement(By.xpath(loc.getProperty("search_Field"))).sendKeys("iphone16pro");
		driver.findElement(By.xpath(loc.getProperty("search_Button"))).click();
		driver.findElement(By.xpath(loc.getProperty("mobile_Phone"))).click();
		driver.findElement(By.xpath(loc.getProperty("add_to_Cart"))).click();
		driver.get("baseUrl");
		driver.findElement(By.xpath(loc.getProperty("cart_Icon"))).click();
		
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File(".//screenshot.screen.png"));
		//driver.findElement(By.xpath(loc.getProperty("mobile_In_Cart"))).getScreenshotAs(null);
	}

}
