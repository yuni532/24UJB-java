package d0404.p31;

public class Main {

	public static void main(String[] args) {
	byte[] bytes = {72,101,108,111,32,74,97,118,97};
	
	String str1 = new String(bytes);
	System.out.println(str1);
	
	String str2 = new String(bytes,5,4); // byte 에서 5번째 다음부터  4번째까지
	System.out.println(str2);
	
	System.out.printf("%c",65);
	System.out.printf("%c",97);
	
	}

}
