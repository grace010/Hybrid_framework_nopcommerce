package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageUIs.RegisterPageUI;
import commons.BasePage;

public class RegisterPageObject extends BasePage {
	private WebDriver driver;
	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickRegisterButton() {
		waitForAllElemetClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
	}

	public String getFirstNameErrorMessage() {
		waitforElementVisible(driver, RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getLastNameErrorMessage() {

		waitforElementVisible(driver, RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getEmailErrorMessage() {

		waitforElementVisible(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getPasswordErrorMessage() {
		waitforElementVisible(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getConfirmPasswordErrorMessage() {
		waitforElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getElementText(driver, RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	public void inputFirstNameTextBox(String firstName) {
		waitforElementVisible(driver, RegisterPageUI.INPUT_TO_FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.INPUT_TO_FIRST_NAME_TEXTBOX, firstName);

	}

	public void inputLastNameTextBox(String lastName) {
		waitforElementVisible(driver, RegisterPageUI.INPUT_TO_LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.INPUT_TO_LAST_NAME_TEXTBOX, lastName);

	}


	public void inputPasswordTextBox(String password) {
		waitforElementVisible(driver, RegisterPageUI.INPUT_TO_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.INPUT_TO_PASSWORD_TEXTBOX, password);

	}

	public void inputConfirmPasswordTextBox(String confirmPassword) {
		waitforElementVisible(driver, RegisterPageUI.INPUT_TO_CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.INPUT_TO_CONFIRM_PASSWORD_TEXTBOX, confirmPassword);

	}

	public String getRegisterSuccessMessage() {
		waitforElementVisible(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public HomePageObject clickToLogoutLink() {
		waitForAllElemetClickable(driver, RegisterPageUI.LOGOUT_BUTTON);
		clickToElement(driver, RegisterPageUI.LOGOUT_BUTTON);
		return PageGeneratorManager.getHomePage(driver);
		

	}

	public String getErrorExistingEmailMessaage() {
		waitforElementVisible(driver, RegisterPageUI.EMAIL_REGISTER_EXISTING_MESSAGE);
		return getElementText(driver, RegisterPageUI.EMAIL_REGISTER_EXISTING_MESSAGE);
	}

	public WebElement getEmailElement() {
		return getWebElement(driver, RegisterPageUI.INPUT_TO_EMAIL_TEXTBOX);
	}

	public void inputEmailTextBox(String emailAddress) {
		waitforElementVisible(driver, RegisterPageUI.INPUT_TO_EMAIL_TEXTBOX);
		sendkeyToElement(driver, RegisterPageUI.INPUT_TO_EMAIL_TEXTBOX, emailAddress);
		
	}


}