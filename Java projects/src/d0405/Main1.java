package d0405;
import java.text.DecimalFormat;
public class Main1 {

	public static void main(String[] args) {
	double num = 1234567.89;
	
	DecimalFormat df = new DecimalFormat("0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0,0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("00000000000.000000000");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("###########.###########");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("+#,0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("-#,0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#,####.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0.0E0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("+#,###;-#,###");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#.#%");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("\u00A4 #.###");
	System.out.println(df.format(num));
	
	
	}

}
