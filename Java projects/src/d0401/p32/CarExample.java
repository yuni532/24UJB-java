package d0401.p32;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.tires[0] = new HankookTire("�տ���", 15);
				break;

			case 2:
				System.out.println("�տ����� HankookTire�� ��ü");
				car.tires[1] = new HankookTire("�տ�����", 12);
				break;

			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.tires[2] = new HankookTire("�ڿ���", 14);
				break;

			case 4:
				System.out.println("�ڿ�����HankookTire�� ��ü");
				car.tires[3] = new HankookTire("�ڿ�����", 17);
				break;
			}

			System.out.println("----------------------------------------------------------");
		}
	}

}