package d408.java5;
import java.util.HashSet;
import java.util.Set;
public class HashSetExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿",30));
		
		System.out.println("�� ��ü�� : " + set.size());

	}

}
