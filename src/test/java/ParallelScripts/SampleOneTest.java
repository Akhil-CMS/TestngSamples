package ParallelScripts;

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

public class SampleOneTest {
	@Test
	  public void TestOne() {
		long id=Thread.currentThread().getId();
		System.out.println("Test1 in Sample One"+id);
	}
	@Test 
	  public void TestTwo() {	
		long id=Thread.currentThread().getId();
		System.out.println("Test2 in Sample One"+id);
	}
		@Test 
		  public void TestThree() {	
			long id=Thread.currentThread().getId();
			System.out.println("Test21 in Sample One"+id);
		}
		@Test(invocationCount = 6, threadPoolSize = 3, timeOut=2000)
		  public void TestFour() {	
			long id=Thread.currentThread().getId();
			System.out.println("Test11 in Sample One"+id);
		}
}
