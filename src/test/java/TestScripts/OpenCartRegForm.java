package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenCartRegForm {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();	
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//body/nav[@id='top']/div[2]/div[2]/ul[1]/li[2]/div[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Akhil");
		driver.findElement(By.id("input-lastname")).sendKeys("Balachandran");
		driver.findElement(By.id("input-email")).sendKeys("akhil");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Password@1");
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(10, document.body.scrollHeight)");
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).submit();
		WebElement chkbox = driver.findElement(By.xpath("//body/main[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		if(!chkbox.isSelected()) {
				chkbox.click();
		
	  
  }
  }
}
