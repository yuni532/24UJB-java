package d0404.p32;

public class Main5 {

	public static void main(String[] args) {
		String ssn = "870913-1234567";
		
		String firstNum = ssn.substring(0,6);
		String secondNum = ssn.substring(7);
		
		System.out.println("firstNum : " + firstNum);
		System.out.println("secondNum : " + secondNum);
	}

}
