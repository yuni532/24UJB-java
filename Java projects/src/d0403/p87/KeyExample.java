package d0403.p87;

public class KeyExample {
	public static void main(String []args) {
	Key k1 = new Key(3);
	Key k2 = new Key(5);
	Key k3 = k1;
	
	System.out.println("k1.hashcode() : " + k1.hashCode());
	System.out.println("k2.hashcode() : " + k2.hashCode());
	System.out.println("k3.hashcode() : " + k3.hashCode());
} 
}
