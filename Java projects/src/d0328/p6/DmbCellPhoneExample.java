package d0328.p6;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
	DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","����",10);
	
	System.out.println("model : " + dmbCellPhone.model);
	System.out.println("color : " + dmbCellPhone.color);
	System.out.println("channel : " + dmbCellPhone.channel);
	
	dmbCellPhone.powerOn();
	dmbCellPhone.bell();
	dmbCellPhone.sendVoice("��������?");
	dmbCellPhone.receiveVoice("�ȳ��ϼ���. ȫ�浿�Դϴ�");
	dmbCellPhone.sendVoice("��, �ݰ����ϴ�");
	dmbCellPhone.hangUp();
	
	dmbCellPhone.turnOnDmb();
	dmbCellPhone.changeChannelDmb(12);
	dmbCellPhone.turnOffDmb();
	}

}
