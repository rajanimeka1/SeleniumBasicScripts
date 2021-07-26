package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Drivers\\\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		WebElement elem = driver.findElement(By.cssSelector("input[id='srchquery_tbox']"));
		
				
		System.out.println("element is displayed "+ elem.isDisplayed());
		
		System.out.println("element is enabled "+ elem.isEnabled());
		
//		driver.switchTo().frame("moneyiframe");
//		driver.findElement(By.xpath("//span[@id='bseindex']")).click();
//		
		
		
		
		/*
		WebElement searchBox =	driver.findElement(By.id("srchword"));
		System.out.println("searchBox.isDisplayed()" +searchBox.isDisplayed());
	//	searchBox.isDisplayed()

		System.out.println("searchBox.isEnabled()"+searchBox.isEnabled());
		
		//searchBox.isEnabled()
		
		*/
		
	//	driver.switchTo().frame("google_ads_iframe_/21677187305/Rediff_Home_728x90_ATF_IN_0");
		
		
	//	driver.findElement(By.linkText("Learn More")).click();
		
		
		
	}

}
