package d0409.java5;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new Hashtable <String,String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		
		}
		sc.close();
	}

}
