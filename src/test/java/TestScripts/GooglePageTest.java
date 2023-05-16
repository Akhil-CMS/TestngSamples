package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GooglePageTest {
	WebDriver driver;
	
	//@BeforeTest
	@BeforeMethod
	public void setup() {
	driver = new ChromeDriver();	
	driver.get("https://www.google.com/"); //get--dynamic refresh n launch again
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	}
	
	//dependency --/*//Dependency: depends on another method. But fails if the method dependent on fails
//  @Test (dependsOnMethods = "seleniumSearchTest")//(priority=1) //when annotation os commented then that test method will not run
//  public void JavaSearchTest() {
//	  	driver.get("https://www.google.com/"); //get--dynamic refresh n launch again
//		WebElement searchBox=driver.findElement(By.name("q"));
//		searchBox.sendKeys("Java Tutorial");
//		//searchBox.sendKeys(Keys.ENTER);
//		searchBox.submit();
//		Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
//  }
  
	
//	//AlwaysRun = true, will run even if method depended on fails.
  @Test (alwaysRun=true, dependsOnMethods = "seleniumSearchTest")//(priority=1) //when annotation os commented then that test method will not run
  public void JavaSearchTest() {
	  	driver.get("https://www.google.com/"); //get--dynamic refresh n launch again
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Java Tutorial");
		//searchBox.sendKeys(Keys.ENTER);
		searchBox.submit();
		Assert.assertEquals(driver.getTitle(),"Java Tutorial - Google Search");
  }
  //Hard Assertion
  @Test   //(priority=2)                      //(enabled=false)
  public void seleniumSearchTest()
  {	  
		driver.get("https://www.google.com/"); //get--dynamic refresh n launch again
		//Assert.assertEquals(driver.getTitle(), "Google");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium Tutorial");
		//searchBox.sendKeys(Keys.ENTER);
		searchBox.submit();
		Assert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search1");
  }
//  @Test(priority=3)
//  public void cucumberSerchTest() 
//  {
//	  
//		driver.get("https://www.google.com/"); //get--dynamic refresh n launch again
//		Assert.assertEquals(driver.getTitle(), "Google");
//		WebElement searchBox=driver.findElement(By.name("q"));
//		searchBox.sendKeys("Cucumber Tutorial");
//		//searchBox.sendKeys(Keys.ENTER);
//		searchBox.submit();
//		Assert.assertEquals(driver.getTitle(),"Cucumber Tutorial - Google Search");
//  }
  
//  @Test(priority=4)
//  public void appiumSerchTest() 
//  {
//	  	driver.get("https://www.google.com/"); //get--dynamic refresh n launch again
//		Assert.assertEquals(driver.getTitle(), "Google");
//		WebElement searchBox=driver.findElement(By.name("q"));
//		searchBox.sendKeys("Appium Tutorial");
//		//searchBox.sendKeys(Keys.ENTER);
//		searchBox.submit();
//		Assert.assertEquals(driver.getTitle(),"Appium Tutorial - Google Search");
//  }
  
  //Soft Assertion
//  @Test
//  public void SeleniumSerchTest() 
//  {	  
//		driver.get("https://www.google.com/");//get--dynamic refresh n launch again
//		SoftAssert SoftAssert= new SoftAssert();
//		SoftAssert.assertEquals(driver.getTitle(), "Google");
//		WebElement searchBox=driver.findElement(By.name("q"));
//		searchBox.sendKeys("Selenium Tutorial");
//		//searchBox.sendKeys(Keys.ENTER);
//		searchBox.submit();
//		SoftAssert.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Serch");
//		SoftAssert.assertAll();
//}
  
  //@AfterTest
		@AfterMethod //after method will run even if test is failed or passed
		public void teardown() {
			driver.close();
		}
}


//TestSuite-> Test -> TestClasses-> TestMethods
