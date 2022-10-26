package pageObjects;

import org.openqa.selenium.WebDriver;

import PageUIs.HomePageUI;
import commons.BasePage;

public class HomePageObject extends BasePage {
	private WebDriver driver;
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPageObject clickRegisterLink() {
		waitForAllElemetClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return new RegisterPageObject(driver);
	}

	public LoginPageObject clickLoginLink() {
		waitForAllElemetClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return new LoginPageObject(driver);
	}
	
	public MyAccountPageObject clickMyAccountLink() {
		waitForAllElemetClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
		return new MyAccountPageObject(driver);
	}

}
