package d408.java5;

import java.util.HashMap;
import java.util.Map;
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"ȫ�浿"),95);
		map.put(new Student(1,"ȫ�浿"),95);
		
		System.out.println("�� entry �� : " + map.size() );

	}

}
