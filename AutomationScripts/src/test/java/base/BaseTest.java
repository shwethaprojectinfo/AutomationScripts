package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	@BeforeTest
	public void setUp() throws IOException {
		if(driver==null) {
			System.out.println("the path is "+ System.getProperty("user.dir"));
			FileReader fr = new FileReader("D:\\6Degree project\\e-commerce\\AutomationScripts\\src\\test\\resources\\configfiles\\data.properties");
		    prop.load(fr);
		}
		
		if(prop.getProperty("Browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("baseUrl"));
		}
		if(prop.getProperty("Browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("baseUrl"));
		}
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		System.out.println("TearDown Successfull");
		
	}

}

