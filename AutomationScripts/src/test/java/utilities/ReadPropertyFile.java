package utilities;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:\\6Degree project\\e-commerce\\AutomationScripts\\src\\test\\resources\\configfiles\\data.properties");
         Properties p = new Properties();
         p.load(fr);
	System.out.println(p.getProperty("browser"));
	System.out.println(p.getProperty("baseUrl"));
	}

}
