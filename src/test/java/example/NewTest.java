package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.By;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;	
public class NewTest {
	private WebDriver driver;	
	private WebDriverWait wait;
  @Test
  public void f() {
	  
	  driver.get("https://admin.qa.atrius-iot.com/");  
	  
		//String title = driver.getTitle();
		//System.out.println(title);
		//Assert.assertTrue(title.contains("Demo Guru99 Page")) ;
	  try {
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//*[@id=\'i0116\']")).sendKeys("testqa3@atgqa.onmicrosoft.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("April@2018");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(8000);
	     System.out.println("Login test successfull");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");

	  driver = new ChromeDriver();
	  wait=new WebDriverWait(driver, 30);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
