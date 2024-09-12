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
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeTest
	public void setUp() throws IOException {
		if(driver==null) {
			//System.out.println("the path is "+ System.getProperty("user.dir"));
			FileReader fr = new FileReader("C:\\Users\\kruth\\git\\AutomationScripts\\AutomationScripts\\src\\test\\resources\\configfiles\\data.properties");
			FileReader fr1 = new FileReader("C:\\Users\\kruth\\git\\AutomationScripts\\AutomationScripts\\src\\test\\resources\\configfiles\\locators.properties");
		    prop.load(fr);
		    loc.load(fr1);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("baseUrl"));
		}
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
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

