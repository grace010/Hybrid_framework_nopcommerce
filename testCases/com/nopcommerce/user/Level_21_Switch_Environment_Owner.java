package com.nopcommerce.user;

import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.SauceLab.LoginPageObject;
import pageObject.SauceLab.PageGeneratorManger;
import pageObject.SauceLab.ProductPageObject;
import utilities.Environment;

public class Level_21_Switch_Environment_Owner extends BaseTest {
	private LoginPageObject loginPage;
	private ProductPageObject productPage;
	Environment environment;
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		environment = ConfigFactory.create(Environment.class);
		
		driver = getBrowserDriverUrl(browserName, environment.appUrl());
	
		loginPage = PageGeneratorManger.getLoginPage(driver);
		loginPage.enterUserName("standard_user");
		loginPage.enterPassword("secret_sauce");
		productPage=loginPage.clickToLoginButton();
		
	}
	
	@Test
	public void Sort_01_Name_ASC() {
		productPage.Sort_ASC("Name (A to Z)");
		sleepInSection(3);
	}
	
	@Test
	public void Sort_03_Price_ASC() {	
		productPage.Sort_DESC("Name (Z to A)");
		sleepInSection(3);
	}
	
	@Test
	public void Sort_04_Price_DESC() {
		productPage.Sort_ASC("Name (A to Z)");
		sleepInSection(3);
	}
	
	@Test
	public void Sort_02_Name_DESC() {	
		productPage.Sort_DESC("Name (Z to A)");
		sleepInSection(3);
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
	
}
