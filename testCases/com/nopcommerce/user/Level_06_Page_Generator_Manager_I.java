package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

public class Level_06_Page_Generator_Manager_I{
	String projectPath = System.getProperty("user.dir");
	WebDriver driver;
	private HomePageObject homePage;
	private LoginPageObject loginPage;
	private RegisterPageObject registerPage;
	String emailAdressFake = random()+ "@gmail.com";
	@BeforeClass
	public void beforeClass() {
	
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		homePage = new HomePageObject(driver);
		homePage.clickRegisterLink();
		registerPage = new RegisterPageObject(driver);
		registerPage.inputFirstNameTextBox("grace");
	
		registerPage.inputLastNameTextBox("tran");

		registerPage.inputEmailTextBox(emailAdressFake);
	
		registerPage.inputPasswordTextBox("123456");
		
		registerPage.inputConfirmPasswordTextBox("123456");
	
		registerPage.clickRegisterButton();
		
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
		registerPage.clickToLogoutLink();
		homePage = new HomePageObject(driver);
		
	}

	@Test
	public void Login_TC_01_EmptyData() {	
		homePage.clickLoginLink();
		loginPage = new LoginPageObject(driver);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorEmailMessage(), "Please enter your email");
	}
	
	@Test
	public void Login_TC_02_InvalidEmail() {
		homePage.clickLoginLink();
		loginPage = new LoginPageObject(driver);
		loginPage.inputEmailTextbox("1234");
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorEmailMessage(), "Wrong email");
	}
	
	@Test
	public void Login_TC_03_EmailNotRegister() {
		homePage.clickLoginLink();
		loginPage = new LoginPageObject(driver);
		loginPage.inputEmailTextbox("1234@gmail.com");
		loginPage.clickLoginButton();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
		Assert.assertEquals(loginPage.getErrorEmailPasswordMessaage(),"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");

	}
	@Test
	public void Login_TC_04_BlankPassword() {
		homePage.clickLoginLink();
		loginPage = new LoginPageObject(driver);
		loginPage.inputEmailTextbox(emailAdressFake);
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorEmailPasswordMessaage(),"Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");

	}
	
	@Test
	public void Login_TC_05_WrongPassword() {
		homePage.clickLoginLink();
		loginPage = new LoginPageObject(driver);
		loginPage.inputEmailTextbox(emailAdressFake);
		loginPage.inputPasswordTextbox("1234");
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getErrorEmailPasswordMessaage(),"Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");

		
	}
	
	@Test
	public void Login_TC_06_LoginSuccess() {
		homePage.clickLoginLink();
		loginPage = new LoginPageObject(driver);
		loginPage.inputEmailTextbox(emailAdressFake);
		loginPage.inputPasswordTextbox("123456");
		loginPage.clickLoginButton();
		Assert.assertEquals(loginPage.getLoginUrl(),"https://demo.nopcommerce.com/");

	}
	
	public int random() {
		Random rand = new Random();
		return rand.nextInt(99999);
	}
	
	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
}









