package d0402.p66;

public class InstanceInnerTest {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass in = oc.new InnerClass();
		
		in.printInfo();
	}

}
