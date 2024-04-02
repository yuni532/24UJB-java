package d0402.p75;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		anony.method2(new Person()	{
			void study() {
				System.out.println("공부 합니다.");
			}
			void wake() {
				System.out.println("8시에 일어 납니다.");
				study();
			}
		});
		
	}
}
