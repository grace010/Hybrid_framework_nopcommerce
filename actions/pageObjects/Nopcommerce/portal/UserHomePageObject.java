package pageObjects.Nopcommerce.portal;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageObjects.Nopcommerce.admin.AdminLoginPageObject;
import PageUIs.nopcommerce.user.UserHomePageUI;

public class UserHomePageObject extends BasePage {
	private WebDriver driver;
	public UserHomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public UserRegisterPageObject clickRegisterLink() {
		waitForAllElemetClickable(driver, UserHomePageUI.REGISTER_LINK);
		clickToElement(driver, UserHomePageUI.REGISTER_LINK);
		return new UserRegisterPageObject(driver);
	}

	public UserLoginPageObject clickLoginLink() {
		waitForAllElemetClickable(driver, UserHomePageUI.LOGIN_LINK);
		clickToElement(driver, UserHomePageUI.LOGIN_LINK);
		return PageGeneratorManager.getLoginPage(driver);
		
	}
	
	public UserCustomerInfoPageObject clickMyAccountLink() {
		waitForAllElemetClickable(driver, UserHomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, UserHomePageUI.MY_ACCOUNT_LINK);
		return new UserCustomerInfoPageObject(driver);
	}
	
	
}
