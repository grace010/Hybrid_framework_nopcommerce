package com.nopcommerce.user;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;

public class execise2 {
	String projectPath = System.getProperty("user.dir");
	WebDriver driver;
	WebDriverWait explicitWait;
	Select select;
	String emailAddress;
	BasePage basePage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//driver.get("https://kynaforkids.vn/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	}

	
	@Test
	public void Tc_02() {
		//driver.findElement(By.xpath("//input[@id='number']")).sendKeys("ddd");
		//driver.findElement(By.xpath("//a[text()='Kyna English 1 kèm 1']")).click();
		//System.out.println(driver.getTitle());

//		driver.findElement(By.xpath("//a[text()='GOOGLE']")).click();
//		switchtoWindowbyTitle("Google");
//		driver.close();
//		switchtoWindowbyTitle("Selenium WebDriver");
//		System.out.println(driver.getTitle());
		
	}
	
	public void switchtoWindowbyTitle(String expectedTitle) {
		Set<String> windownID = driver.getWindowHandles();
		for (String id : windownID) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if (title.equals(expectedTitle)) {	
				break;
			}
		}

	}
	
	@AfterClass
	public void afterClass() {
		 driver.quit();
	}
	
}
