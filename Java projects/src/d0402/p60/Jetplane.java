package d0402.p60;

public class Jetplane extends Plane implements Flyable, Soundable {

	@Override
	public void sound() {
		System.out.println("��Ʈ�� �Ҹ� : �����");

	}

	@Override
	public void fly() {
		System.out.println("��Ʈ�Ⱑ ���ư��ϴ�");
	}

}
