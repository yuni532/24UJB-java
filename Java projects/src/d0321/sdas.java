package d0321;

import java.util.Scanner;

public class sdas {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("height = ");
		int height = sc.nextInt();                  		  // 사용자로 입력받은 int값을 받는 매소드
													//int b = sc.nextInt(); 
		                              				//double b = sc.nextDouble();
		sc.close();

		System.out.print("Your height is ");
		System.out.println(height + "cm.");
		
		
	}

}
