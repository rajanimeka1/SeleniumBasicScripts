package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEventsDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\\\Drivers\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Aparna M");
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("H.NO 34, lane 12 near abc school");
		address.sendKeys(Keys.ENTER);
		address.sendKeys(Keys.ENTER);
		address.sendKeys("PUNE");
		address.sendKeys(Keys);
		address.sendKeys("MH - 500029");
		
		
	}

}
