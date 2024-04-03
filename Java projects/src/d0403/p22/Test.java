package d0403.p22;

import java.util.Properties;
import java.util.Set;
public class Test {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("username");
		String userHome = System.getProperty("userHome");
		
		System.out.println("�ü�� �̸� : "+ osName);
		System.out.println("����� �̸� : "+ userName);
		System.out.println("����� Ȩ���丮 : "+ userHome);
		
		System.out.println("------------------------------");
		System.out.println("[ key ] value ");
		System.out.println("------------------------------");
			
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[" + key + "]" + value);
		}
	}

}
