package d408.java5;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeTest {

	public static void main(String[] args) {
		TreeSet <String>ts = new TreeSet<String>();
		
		
		if (ts.add("korea")) {
			System.out.println("ù ��° korea �߰� ����");
		}else {
			System.out.println("ù ��° korea �߰� ����");
		}

		
		if (ts.add("china")) {
			System.out.println("ù ��° china �߰� ����");
		}else {
			System.out.println("ù ��° china �߰� ����");
		}
		
		if(ts.add("america")) {
			System.out.println("ù ��° america �߰� ����");
		}else {
			System.out.println("ù ��° america �߰� ����");
		}
		if(ts.add("china")) { 		
			System.out.println("�� ��° america �߰� ����");
		}else {
		System.out.println("�� ��° america �߰� ����");
		}

		
		System.out.println("Iterator�� ��ü ���� ��ȸ ---------------------------");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		}
}
