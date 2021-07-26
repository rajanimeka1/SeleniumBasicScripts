package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\\\Drivers\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
				
		driver.get("https://www.rediff.com/");	
	
		//driver.switchTo().frame("moneyiframe");
		driver.switchTo().frame(0)
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='bseindex']")).click();

		driver.findElement(By.xpath("//img[@class=\"img_ad\"]")).click();
		
	
	}

}
