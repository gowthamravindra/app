package appjekins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {
	
	public void d(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Harish\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("bssbfgg");
		
	}
	

}
