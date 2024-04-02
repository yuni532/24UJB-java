package d0402.p54;

public class RemoteControlExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc1 = new Audio();
		
		rc1.turnOn();
		rc1.turnOff();
		
		RemoteControl rc2 = new RemoteControl() {
	
		@Override
		public void turnOn() {
			System.out.println("RemoteControl - turnOn()");
		}
		
		@Override
		public void turnOff() {
			System.out.println("RemoteControl - turnOff()");
		}
		
		@Override
		public void setVolume(int volume) {
			
		}
		};
		
		
		
			
		rc2.turnOn();
		rc2.turnOff();

	}

}
