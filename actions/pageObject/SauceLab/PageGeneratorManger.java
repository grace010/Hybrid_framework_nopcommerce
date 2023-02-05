package pageObject.SauceLab;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManger {
	
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}
	
	public static ProductPageObject getProductPage(WebDriver driver) {
		return new ProductPageObject(driver);
	}
}
