package d0409.java5;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(20));
		coinBox.push(new Coin(70));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(130));
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
		System.out.println("������ ���� : " +coin.getValue()+" ��");
		}
	}

}
