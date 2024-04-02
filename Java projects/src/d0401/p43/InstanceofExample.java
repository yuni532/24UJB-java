package d0401.p43;

import d0401.Child;

public class InstanceofExample {

	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환 실패");
		}

	}

	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	public static void main (String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent paretnB = new Parent();
		method1(paretnB);
		method2(paretnB);
	}
	
}
	
