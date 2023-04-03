package javaOOP;

public class Testing extends Topic_Modifier {
	
	static void test_01() {
		 System.out.println("Im yen1");
	 }
	public static void main(String[] args) {
		//System.out.println(Topic_Modifier.a);
		//Testing obj = new Testing();
		//obj.test_02();
		Topic_Modifier.test_01();
		
	}
}

//k nên lạm dụng tạo biến là static
// chỉ nên dùng khi toàn bộ system sử dụng toàn bộ giá trị này
//final: cho khởi tạo đối tượng, k cho kế thừa, ngược với abstract