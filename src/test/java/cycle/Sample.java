package cycle;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {

	WebDriver driver;
	
	@BeforeTest
	public void inialize() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void sampleTest() {
		driver.get("https://www.selenium.dev/");
		String expectedResult ="Documentation";
		String actualResult =driver.findElement(By.xpath("(//a[text()='Documentation'])[1]")).getText();
		
		if (expectedResult.equalsIgnoreCase(actualResult)) {
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
