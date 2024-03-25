package d0325;

	import java.util.Scanner;
public class ForSumExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inp = scanner.nextInt();
		 scanner.close();
		
		 int sum = 0;
		 for (int i =1;i<=inp;i++) {
			 sum += i;
			 
		 }
		 System.out.println("sum = " + sum );
	}	
}
