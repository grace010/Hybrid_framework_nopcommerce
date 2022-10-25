package pageObjects;

import org.openqa.selenium.WebDriver;

import PageUIs.HomePageUI;
import PageUIs.LoginPageUI;
import commons.BasePage;

public class LoginPageObject extends BasePage {
	private WebDriver driver;
	 public LoginPageObject(WebDriver driver) {
	  this.driver = driver;
	 }
	public HomePageObject clickLoginButton() {
		waitForAllElemetClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getHomePage(driver);
		
	}
	public String getErrorEmailMessage() {
		waitforElementVisible(driver, LoginPageUI.ERROR_EMAIL_MESSAGE);
		return getElementText(driver,LoginPageUI.ERROR_EMAIL_MESSAGE);
	}
	public void inputEmailTextbox(String emailAddress) {
		sendkeyToElement(driver,LoginPageUI.EMAIL_TEXTBOX , emailAddress);
		
	}
	public String getErrorEmailPasswordMessaage() {
		waitforElementVisible(driver, LoginPageUI.ERROR_EMAIL_PASSWORD_MESSAGE);
		return getElementText(driver,LoginPageUI.ERROR_EMAIL_PASSWORD_MESSAGE);
	}
	public void inputPasswordTextbox(String password) {
		sendkeyToElement(driver,LoginPageUI.PASSWORD_TEXTBOX , password);
		
	} 
	public String getLoginUrl() {
		return getCurrentUrl(driver);
	}
	
}
