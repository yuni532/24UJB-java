package d0401;

import d0401.p43.Parent;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = new Parent();
		
		parent.method1();// �״�� ��µ�
		parent.method2();// �״�� ��µ�
	//	parent.method3();//	�θ� Ŭ�������� �ڽ� Ŭ������ ������ �� ����
		
		child.method1();// �θ� Ŭ������ �ִ� �޼ҵ�1�� ��� �޾ƿ� 
		child.method2();// �θ� Ŭ�������� �޼ҵ� 2�� ������ �ڽ� Ŭ������ �޼ҵ忡 ���� ���� ������ �ڽ� Ŭ�������� ������
		child.method3();// �״�� ���
		
		System.out.println("----------------------------------------------------");
		
		parent=child; // �θ� Ŭ�������� �ڽ� Ŭ������ �ּҰ��� �������
		parent.method1(); // child method1 ���� ��쿡 �θ� Ŭ������ ��� �ް� �ֱ⶧���� �θ� Ŭ������ ��ӵ� ä�� ����
		parent.method2();// 
	
	
	
	
	
	
	
	
	
	
	}
	

}
