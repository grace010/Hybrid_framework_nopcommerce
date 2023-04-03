package javaOOP;

public class Topic_Modifier {
	//nested class
	public static class Topic_Non_Modifier{
		 
	 }
	 static String a = "Yen";
	 String b = "Yen1";
	 
	 static void test_01() {
		 System.out.println("Im grace tran");
	 }
	 
	 public void test_02() {
		 System.out.println("Im yen");
	 }
	 
	 

	public static void main(String[] args) {
		Topic_Modifier object = new Topic_Modifier();
		System.out.println(a);
		System.out.println(object.b);
		Topic_Modifier.test_01();
		object.test_02();
	}
}


//biến static gán cho biến, method, 
// biến static có thể truy cập trực tiếp từ hàm static
//static: dùng cho tất cả các instance
//che giấu việc khởi tạo đối tượng thông qua hàm static
// k có static cho class
//final: tránh việc ghi đè, tránh việc gán lại dữ liệu (dùng cho biến, mothod, class)
//final class: tránh trường hợp kế thừa,
//abstract class k cho phép khởi tạo đối tượng, chỉ cho phép kế thừa
//object_instance
