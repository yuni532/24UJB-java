package d0401.p32;

public class kumhoTire extends Tire {
	public kumhoTire (String location, int maxRotation) {
		super (location,maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire ���� : " + (maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false;
		}
	}
}
