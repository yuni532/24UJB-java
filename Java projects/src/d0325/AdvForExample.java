package d0325;

public class AdvForExample {

	public static void main(String[] args) {
		int [] scores = {9,7,8,9,8};
	
		int sum = 0;

		for (int i= 0; i<=4; i++) {
			 sum += scores [i];
		}
		
		
//		for (int s : scores) {
//		sum += s;
		System.out.println("sum : " + sum );
	}

}

// i++는 i+1 짝수 인덱스만 더하고 싶으면 i+2로 하면 된다
