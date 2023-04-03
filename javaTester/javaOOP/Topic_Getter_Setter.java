package javaOOP;


public class Topic_Getter_Setter {
	private String userName;
	
	public void setter(String userName) {
		if(userName == null || userName.isEmpty()) {
			throw new IllegalArgumentException("ten nhap k hơp le");
		}else {
			this.userName = userName;
		}
		
	}
	
	public String getter() {
		return userName;
	}
	
	public static void main(String[] args) {
		Topic_Getter_Setter obj = new Topic_Getter_Setter();
		obj.setter("");
		System.out.println(obj.getter());
	}

}
