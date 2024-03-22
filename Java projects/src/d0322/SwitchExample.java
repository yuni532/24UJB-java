package d0322;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			break;
		}
	}
}

//Math.random 값의 범위는 0.0 <= Math.random < 1.0이다.
//Math.random에 값에 6을 곱해서 0.0 <= Math.random*6 < 6.0
//int로 메소드 변환 시키면 0 <= Math.random*6 < 6이 나오고 +1을 해서
// 1 <= M.r < 7