package d0404.p32;

public class Main {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		
		char p = ssn.charAt(7);
		
		switch (p) {
		case '1':
		case '3':
		System.out.println("�����Դϴ�.");
			break;
		case '2':
		case '4':
		System.out.println("�����Դϴ�.");
			break;
		}
	}

}
