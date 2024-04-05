package d0405.Box;

public class BoxExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2 <String>box1= new Box2 <String>();
		box1.set("ȫ�浿");
		String str = box1.get();
		System.out.println(str);
		
		Box2 <Integer> box2 = new Box2 <Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}

}
