package d0404.p51;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {99,68,36,29,88};
		
		Arrays.sort(scores);
		for(int i = 0; i<scores.length;i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		
		int index = Arrays.binarySearch(scores,99);
		System.out.println("index : " + index);
	}

}
