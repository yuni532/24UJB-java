package d0404.p32;

public class Main3 {

	public static void main(String[] args) {
		String ssn ="123456-1234567";
		
		int length = ssn.length();
		System.out.println("length : " + length);
		
		if (length == 14 ) {
			System.out.println("�ֹε�Ϲ�ȣ�� �½��ϴ�.");
		}else {
			System.out.println("�ֹε�Ϲ�ȣ�� �ƴմϴ�.");
		}

	}

}
