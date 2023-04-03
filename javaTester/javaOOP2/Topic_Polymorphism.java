package javaOOP2;

import javaOOP1.Employee;

public class Topic_Polymorphism {
public void sum(int a, int b) {
	System.out.println(a+b);
}

public void sum(double a, int b) {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.sleep();
		Topic_Polymorphism obj = new  Topic_Polymorphism();
		obj.sum(2, 3);
		obj.sum(2.5d, 3);
	}

}


//kế thừa mới cho phép ghi đè
//interface k dc phép có constructor




