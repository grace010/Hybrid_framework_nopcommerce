package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Topic_This_Super extends Page_OOP{
	private int a;
	private int b;
	protected long shortTimeout = 10;

	/*
	 * public Topic_This_Super() { this(10, 15); }
	 */
	public Topic_This_Super(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Topic_This_Super() {
		//super luôn gọi qua constructor của class cha
		super();
		System.out.println("class con");
	}
	
	public Topic_This_Super get() {
		this.show();
		return this;
	}
	
	public void display1() {
		System.out.println(this.a + b);
	}
	
	public void display() {
		this.show();
		System.out.println(this.a + b);
	}
	
	public void show() {
		System.out.println("This is show");
	}
	public void clickToElement() {
		getImplicitWait();//goi đến hàm con
		super.getImplicitWait();//gọi đến hàm cha
	}
	
	
	
	//private WebDriver driver;
	public void getImplicitWait() {
		long shortTimeout =12;
		super.driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.SECONDS);//gọi qua biến của class cha
		driver.manage().timeouts().implicitlyWait(shortTimeout, TimeUnit.SECONDS);//gọi qua biến local
		driver.manage().timeouts().implicitlyWait(this.shortTimeout, TimeUnit.SECONDS);//gọi qua biến global
	}
	
	public static void main(String[] args) {
		//Topic_This_Super obj = new Topic_This_Super(10,10);
		Topic_This_Super obj = new Topic_This_Super();
		//obj.get().display();
		
		
	}

}
//this dùng cho biến global trong cùng 1 class
//this gọi hàm or contractor
//Instance_Global variable
//nếu k có constructor thì sẽ gọi constructor mặc định
//biến global có giá trị mặc định
//getter_setter: tính đóng gói
//this chỉ dùng trong phạm vi class hiện tại, super gọi qua class cha
//trong class con và class cha có biến gióng nhau trùng tên, dùng super goi đến biến của class cha, k dùng super sẽ gọi đến biến của class con
//super: cùng tên hàm








