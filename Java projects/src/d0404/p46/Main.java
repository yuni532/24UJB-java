package d0404.p46;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4,"2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4,'6');
		System.out.println(sb.toString());
		
		sb.delete(4,5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("ÃÑ¹®ÀÚ¼ö : " + length);
		
		String result = sb.toString();
		System.out.println(result);
	}

}
