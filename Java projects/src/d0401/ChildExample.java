package d0401;

import d0401.p43.Parent;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		parent.method1();// 그대로 출력됨
		parent.method2();// 그대로 출력됨
	//	parent.method3();//	부모 클래스에서 자식 클래스로 내려갈 수 없음
		
		child.method1();// 부모 클래스에 있는 메소드1을 상속 받아옴 
		child.method2();// 부모 클래스에도 메소드 2가 있지만 자식 클래스의 메소드에 같은 값이 있으면 자식 클래스에서 가져옴
		child.method3();// 그대로 출력
		
		System.out.println("----------------------------------------------------");
		
		parent=child; // 부모 클래스에서 자식 클래스로 주소값이 덮어씌워짐
		parent.method1(); // child method1 같은 경우에 부모 클래스를 상속 받고 있기때문에 부모 클래스가 상속된 채로 나옴
		parent.method2();// 
	
	
	
	
	
	
	
	
	
	
	}
	

}
