package javaOOP1;

import javaOOP2.IWork;

public class Employee extends Person implements IWork{
	public void sleep() {
		System.out.println("sleep");
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.sleep();

	}

}
