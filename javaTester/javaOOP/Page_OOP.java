package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Page_OOP {
	protected long shortTimeout = 10;
	protected long longTimeout = 30;
	protected WebDriver driver;
	
	
	public Page_OOP() {
		System.out.println("class cha");
	}
	public void getImplicitWait() {
		long shortTimeout =12;
		driver.manage().timeouts().implicitlyWait(shortTimeout, TimeUnit.SECONDS);
		
	}
	public static void main(String[] args) {
		
	}

}
//this dùng cho biến global trong cùng 1 class
//this gọi hàm or contractor
//Instance_Global variable
//nếu k có constructor thì sẽ gọi constructor mặc định
//biến global có giá trị mặc định
//getter_setter: tính đóng gói
//this chỉ dùng trong phạm vi class hiện tại, super gọi qua class cha



