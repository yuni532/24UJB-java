package d0321;

public class Operator5Example {

	public static void main(String[] args) {
		boolean bPlay = true;
		
		System.out.println(bPlay); // true

		bPlay = !bPlay;
		System.out.println(bPlay); // true �ݴ� false
		
		bPlay = !bPlay;
		System.out.println(bPlay); // true �ݴ� false �ݴ� true
		
		bPlay = !bPlay;
		System.out.println(bPlay); //  true �ݴ� false �ݴ� true �ݴ� false
	}

}
