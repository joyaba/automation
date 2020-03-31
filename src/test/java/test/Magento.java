package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Magento {
	
	@Test(priority=1, enabled=false)
	public void register() {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	        driver.get("http://magento.com");
	     driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[8]/a/span[1]/i")).click();
	     driver.findElement(By.name("login[username]")).sendKeys("eg_lisa@hotmail.com");
	      driver.findElement(By.id("pass")).sendKeys("welcome");
	      driver.findElement(By.name("send")).click();
	   	      String error=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div")).getText();
		  System.out.println(error);
		  if (error.equals("Invalid login or password"))
		  {
			  System.out.println("Testcase pass");
		  }
		  else
			  System.out.println("Test case fail");
		  driver.quit();
		}
	@Test(priority=2)
	public void negative_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("http://magento.com");
	    driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[8]/a/span[1]/i")).click();
	    driver.findElement(By.id("register")).click();
	    driver.findElement(By.id("First Name")).sendKeys("First");
	    driver.findElement(By.id("Last Name")).sendKeys("Last");
	    driver.findElement(By.name("email_address")).sendKeys("eg_lisa@hotmail.com");
	    Select type = new Select(driver.findElement(By.id("company_type")));
	    Select role = new Select(driver.findElement(By.id("individual_role")));
        
}

	}



