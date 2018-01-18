package appjekins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	
	public void d(){
		System.setProperty("webdriver.gecko.driver","E:\\extensions\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}
	

}
