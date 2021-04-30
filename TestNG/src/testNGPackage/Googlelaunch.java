package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Googlelaunch {
	WebDriver driver;
	@Test(priority = 0 )
	@Parameters({"url"})
	public void setup(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);


	}
//
////	@Test(invocationCount = 1, groups = "url")
////	public void googletitle() {
////
////		System.out.println(	driver.getTitle());	
////
////
////
////	}
////	@Test(priority = 1, groups = "url")
////	public void geturl() {
////		System.out.println(driver.getCurrentUrl());
////		boolean b=	driver.findElement(By.className("lnXdpd")).isDisplayed();
////	}
//	@Test(enabled = true , priority = 1)
//	public void getlogo	() {
//		System.out.println(driver.getCurrentUrl());
//		boolean b=	driver.findElement(By.className("lnXdpd")).isDisplayed();
//	}
////	@Test(priority = 1,groups = "test")
////	public void getlogo1	() {
////		System.out.println(driver.getCurrentUrl());
////		boolean b=	driver.findElement(By.className("lnXdpd")).isDisplayed();
////	}
//	@Test(priority = 1,groups = "test",dependsOnMethods = "getlogo")
//	public void getlogo2	() {
//		System.out.println(driver.getCurrentUrl());
//		boolean b=	driver.findElement(By.className("lnXdpd")).isDisplayed();
//		Assert.assertFalse(b);
//String title= driver.getTitle();
//Assert.assertEquals(title,"Google","failed");
//	}
////	@Test(groups = "dependency")
////	public void getlogodependsonGroup	() {
////		System.out.println(driver.getCurrentUrl());
////		boolean b=	driver.findElement(By.className("lnXdpd")).isDisplayed();
////	}
////@Test(dependsOnGroups = "dependency")
////	public void getlogodependsonGroup1	() {
////		System.out.println(driver.getCurrentUrl());
////		boolean b=	driver.findElement(By.className("lnXdpd")).isDisplayed();
////	}
////@Test(expectedExceptions = ArithmeticException.class)
////public void zero() {
////	
////	int a=1;
////	int b=a/0;
////}
//
////	@AfterMethod
////	public void teardown() {
////
////		driver.quit();
////	}}
	
}