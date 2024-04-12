package d0411.java6;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TextFieldTest {
	private Button b;
	private Frame f;
	private TextField tfMsg;
	private String LOGIN_ID ="green";
	private String LOGIN_PWD = "ujb1234";
	
	public TextFieldTest() { //생성자 생성 
		 f = new Frame("Login");
		f.setSize(400,110);
		f.setLayout(new FlowLayout()); //FlowLayout  미지정시 size등 여러가지 다 직접 지정해줘야함
		
		
		Label lid = new Label("ID : ",Label.RIGHT);
		Label lpwd = new Label("Password : ",Label.RIGHT);
		
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		pwd.setEchoChar('*');
		
		b = new Button("Login");
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inpId = id.getText();
				String inpPwd = pwd.getText();
			//	System.out.println(inpId + " / " + inpPwd);
				
				if (inpId.equals(LOGIN_ID)&&inpPwd.equals(LOGIN_PWD)) {
					tfMsg.setText("로그인이 성공했습니다.");
				}else {
					tfMsg.setText("로그인이 실패했습니다.");
				}
			}
		}); // 로그인이 맞는지 틀리는지 클래스에 있는 값에 비교하여 안내함

		
		tfMsg= new TextField(50);
		
		
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(b); // 로그인 버튼이 비밀번호 옆에 있어야해서 이 위치
		f.add(tfMsg); // 텍스트 필드를 아래쪽에 만들기 위해 
		f.setVisible(true);
	}
		public static void main(String[] args) {
			new TextFieldTest();
}
}
