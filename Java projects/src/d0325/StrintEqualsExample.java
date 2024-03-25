package d0325;

public class StrintEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "JBEdu";
		String strVar2 = "JBEdu";
		
		if (strVar1 == strVar2) {
			System.out.println("참조가 같음");
		}else {
			System.out.println("참조가 다름");
			
		}
		if (strVar1.equals(strVar2)) {
			System.out.println("두 문자열이 같음");
		}
		
		String strVar3 = new String("JBEdu");
		String strVar4 = new String("JBEdu");
		
		if (strVar3 == strVar4) {
				System.out.println("참조가 같음");
			}else {
				System.out.println("참조가 다름");	
			}
		if (strVar3.equals(strVar4)) {
			System.out.println("두 문자열이 같음");
		}
	}

}
//equals 사용시 문자열을 비교함 
//그래서 참조가 달라도 문자열이 같음으로 나옴