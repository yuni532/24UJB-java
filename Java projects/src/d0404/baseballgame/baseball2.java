package d0404.baseballgame;

import java.util.Scanner;
import java.util.Random;

public class baseball2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int A = 3;
		int[] xnum = new int[A]; // 난수 값
		int[] anum = new int[A]; // 입력 값
		int stk=0, ball=0;
		for (int i = 0; i < A; i++) { // 1. 겹치지 않는 난수 생성
			xnum[i] = random.nextInt(9) + 1;
			for (int j = 0; j < i; j++) {
				if (xnum[i] == xnum[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < A; i++) {
			System.out.print(xnum[i] + " ");
		}
		for (int i = 0; i < A; i++) {
			anum[i] = sc.nextInt();
			System.out.print(anum[i] + " ");// 난수
		}
		sc.close();
		for (int Z = 0; Z < 3; Z++) {
			stk = 0;
			ball = 0;

			for (int i = 0; i < 3; i++) {

				if (anum[i] == xnum[i]) {
					stk++;
				}
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i != j && xnum[i] == anum[j]) {
						ball++;
					}
				}
			}
			System.out.println("Strike : "+stk+", "+ "Ball : " + ball);
			break;
		} 
		}
	}

			
//			if (anum[1] == xnum[1] && anum[2] == xnum[2]) {
//				System.out.println("3 Strike");
//				break;
//			
//			
//			}if (anum[1] == xnum[1] && anum[2] == xnum[2]) {
//				System.out.println("2 Strike");
//				break;
//			}
//			if (anum[0] == xnum[0] && anum[2] == xnum[2]) {
//				System.out.println("2 Strike");
//				break;
//			}
//			if (anum[0] == xnum[0] && anum[1] == xnum[1]) {
//				System.out.println("2 Strike");
//				break;
//			}
//			if (anum[Z] == xnum[Z]) {
//				System.out.println("1 Strike");
//				break;
//			}
//				
//				System.out.println("1 Strike");
//				System.out.println("2 Strike");
			
//
//	if (anum[1]==xnum[2]) {
//		//	System.out.println( "1 Ball");
//	}
//	else if (anum[1]==xnum[0]) {
//		//	System.out.println( "1 Ball");
//	}else if (anum[2]==xnum[1]) {
//		//	System.out.println( "1 Ball");
//	}
//	else if (anum[2]==xnum[0]) {
//		//	System.out.println( "1 Ball");
//	}
//	else if (anum[0]==xnum[1]) {
//		//	System.out.println( "1 Ball");
//	}
//	else if (anum[0]==xnum[2]) {
//		System.out.println( "1 Ball");
//		break;
//	}
//	if (anum[0]==xnum[1]&&anum[2]==xnum[1]) {
//		System.out.println( "2 Ball");
//		break;
//	}else if (anum[1]==xnum[0]&&anum[2]==xnum[0]) {
//		System.out.println( "2 Ball");
//		break;
//	}else if (anum[2]==xnum[0]&&anum[1]==xnum[0]) {
//		System.out.println( "2 Ball");
//		break;
//	}
//	else if (anum[0]==xnum[1]&&anum[1]==xnum[2]) {
//		System.out.println( "2 Ball");
//		break;
//	}
//	else if (anum[0]==xnum[1]&&anum[1]==xnum[0]) {
//		System.out.println( "2 Ball");
//		break;
//	}else if (anum[0]==xnum[1]&&anum[2]==xnum[0]) {
//		System.out.println( "2 Ball");
//		break;
//	}else if (anum[1]==xnum[0]&&anum[2]==xnum[1]) {
//		System.out.println( "2 Ball");
//		break;
//	}
//	else if (anum[1]==xnum[0]&&anum[0]==xnum[2]) {
//		System.out.println( "2 Ball");
//		break;
//	} else if (anum[1]==xnum[0]&&anum[0]==xnum[1]) {
//		System.out.println( "2 Ball");
//		break;
//	}else if (anum[2]==xnum[0]&&anum[1]==xnum[2]) {
//		System.out.println( "2 Ball");
//		break;
//	} else if (anum[2]==xnum[0]&&anum[0]==xnum[1]) {
//		System.out.println( "2 Ball");
//		break;
//	}else if (anum[2]==xnum[0]&&anum[0]==xnum[2]) {
//		System.out.println( "2 Ball");
//		
//		break;
//	}	
//	if (anum[1]==xnum[2]&&anum[2]==xnum[0]) {
//		if (anum[0]==xnum[1]) {
//			System.out.println( "3 Ball");
//		}
//		if (anum[1]==xnum[0]&&anum[2]==xnum[1]) {
//			if (anum[0] == xnum[2]) {
//				System.out.println( "3 Ball");
//			}
//		}
//	}
	

