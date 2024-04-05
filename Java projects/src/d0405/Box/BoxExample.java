package d0405.Box;

//import javax.swing.Box;

public class BoxExample {

	public static void main(String[] args) {
	Box box = new Box();
	box.set("ȫ�浿");
	String name = (String)box.get();
	System.out.println(name);
	
	box.set(new Apple());
	Apple apple = (Apple) box.get();

	}

}
