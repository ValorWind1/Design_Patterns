package command;

public class Television implements ElectronicDevice {

	private int volume = 0 ; 
	
	@Override
	public void on() {
		
		System.out.println("TV is ON");
		
	}

	@Override
	public void off() {
		System.out.println("TV is off");
		
		
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("TV Volume is at " + volume);
		
		
		
	}

	@Override
	public void volumnDown() {
		volume--;
		System.out.println("TV Volume is at " + volume);
		
		
	}
	
	
	

}
