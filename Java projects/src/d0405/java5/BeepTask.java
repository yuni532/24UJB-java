package d0405.java5;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++) {
			System.out.println("��");
		try {
			Thread.sleep(500);
		}catch (Exception e) {
		}	
		}
	}

}
