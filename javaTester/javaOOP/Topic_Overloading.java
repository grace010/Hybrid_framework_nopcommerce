package javaOOP;

public class Topic_Overloading {
	private int firstNumber;
	private int secondNumber;
	public int sumNumber() {
		return (firstNumber + secondNumber);
	}
	
	public int sumNumber(int firstNumber, int secondNumber ) {
		return (this.firstNumber + this.secondNumber);
	}
	
	public int sumNumber(float firstNumber, int secondNumber ) {
		return (this.firstNumber + this.secondNumber);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//overloading: phạm vi bên trong class
//overriding: phạm vi ngoài class, 
