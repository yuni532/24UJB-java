package d0321;

public class IntExample {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 012;
		int var3 = 0xA;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

		System.out.printf("8���� : 0%o\n",var2);
		System.out.printf("16���� : 0x%x\n", var3);
	}

}
