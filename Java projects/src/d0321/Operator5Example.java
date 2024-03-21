package d0321;

public class Operator5Example {

	public static void main(String[] args) {
		boolean bPlay = true;
		
		System.out.println(bPlay); // true

		bPlay = !bPlay;
		System.out.println(bPlay); // true 반대 false
		
		bPlay = !bPlay;
		System.out.println(bPlay); // true 반대 false 반대 true
		
		bPlay = !bPlay;
		System.out.println(bPlay); //  true 반대 false 반대 true 반대 false
	}

}
