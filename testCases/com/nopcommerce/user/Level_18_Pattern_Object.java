package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.Nopcommerce.portal.UserAddressPageObject;
import pageObjects.Nopcommerce.portal.UserCustomerInfoPageObject;
import pageObjects.Nopcommerce.portal.UserHomePageObject;
import pageObjects.Nopcommerce.portal.UserRegisterPageObject;
import pageObjects.Nopcommerce.portal.UserRewardPointPageObject;

public class Level_18_Pattern_Object extends BaseTest {
	WebDriver driver;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserCustomerInfoPageObject customerInforPage;
	private UserAddressPageObject addressPage;
	private UserRewardPointPageObject rewardPointPage;
	private String firstName = "grace";
	private String lastName = "tran";

	String emailAdressFake = random() + "@gmail.com";

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = PageGeneratorManager.getHomePage(driver);
		
	}
	
	@Test
	public void User_01_Register() {
		log.info("Register_Step01_Open reigster page");
		registerPage = homePage.clickRegisterLink();
		
		log.info("Register_Step02_Enter to firstname textbox");
			
		registerPage.inputTextBoxByID(driver,"FirstName",firstName);
		
		log.info("Register_Step03_Enter to lastname textbox");
		
		registerPage.inputTextBoxByID(driver,"LastName",lastName);
		
		registerPage.selectByDrpopDownAttributeName(driver, "DateOfBirthDay", "1");
		
		registerPage.selectByDrpopDownAttributeName(driver, "DateOfBirthMonth", "January");
		
		registerPage.selectByDrpopDownAttributeName(driver, "DateOfBirthYear", "1912");
		
		
		log.info("Register_Step04_Enter to email texbox is '"+emailAdressFake+ "'");
		registerPage.inputTextBoxByID(driver, "Email",emailAdressFake);
		
		log.info("Register_Step05_Enter to password texbox");
		registerPage.inputTextBoxByID(driver, "Password","123456");

		log.info("Register_Step06_Enter to confirm password texbox");
		registerPage.inputTextBoxByID(driver, "ConfirmPassword","123456");	
		
		log.info("Register_Step07_Click to Register button");
		registerPage.clickToButtonByText(driver,"Register");
		
		log.info("Register_Step08_Verify Register success");
		verifyEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
		
	}
	
	@Test
	public void User_02_Customer_Infor_Page() {
		log.info("Step01_Open customer infor page");
		customerInforPage = homePage.clickMyAccountLink();
		Assert.assertEquals(customerInforPage.getTextBoxValueByID(driver,"FirstName"), firstName);
		Assert.assertEquals(customerInforPage.getTextBoxValueByID(driver,"LastName"), lastName);
	}

	@Test
	public void User_03_Switch_Account() {
		log.info("Step01_Open customer infor page");
		customerInforPage = homePage.clickMyAccountLink();
		
		log.info("Step01_Open customer address page");
		addressPage = customerInforPage.clickAddressLink(driver);
		
		log.info("Step02_Open customer infor page");
		customerInforPage = addressPage.clickCustomerInfoLink(driver);
		
		log.info("Step03_Open reward point page");
		rewardPointPage = customerInforPage.clickRewardPointLink(driver);
		
		log.info("Step04_Open customer infor page");
		customerInforPage = rewardPointPage.clickCustomerInfoLink(driver);

	}
	
	
	public int random() {
		Random rand = new Random();
		return rand.nextInt(99999);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
	
}
