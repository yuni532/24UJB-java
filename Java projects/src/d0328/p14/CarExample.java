package d0328.p14;

public class CarExample {
	public static void main(String[]args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-20);
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		myCar.setSpeed(40);
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}
}
