package d0409.java5;
import java.util.Iterator;
import java.util.TreeSet;
public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("ȫ�浿",45));
		treeSet.add(new Person("���ڹ�",25));
		treeSet.add(new Person("������",31));
		
		Iterator<Person> iterator = treeSet.iterator();
		

		
		
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			
			System.out.println(person.getName() + ":" + person.getAge());
		}
	}

}
