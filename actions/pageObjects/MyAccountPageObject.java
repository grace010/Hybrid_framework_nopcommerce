package pageObjects;

import org.openqa.selenium.WebDriver;

import PageUIs.HomePageUI;
import commons.BasePage;

public class MyAccountPageObject extends BasePage {
	private WebDriver driver;
	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

}
