package javaOOP1;

import javaOOP2.IWork;

public class Student extends Person implements IWork{
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("suat 15k");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.eat();
	}

}
//OVerride: giống tên hàm, giống kiểu du lieu tra ve
//overloading: đa hình trong quá trình complile