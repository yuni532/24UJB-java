package d0405.java5;

public class ThreadExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " +mainThread.getName());
		
		ThreadA threadA = new  ThreadA();
		System.out.println("�۾� �������� �̸� : " +threadA.getName());
		threadA.start();
		
		ThreadB threadB = new  ThreadB();
		System.out.println("�۾� �������� �̸� : " +threadB.getName());
		threadB.start();
	}

}
