package command;

public class TurnTVUp implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVUp(ElectronicDevice newDevice) {
		theDevice = newDevice ; 
	}
	public void execute() {
		
		
		theDevice.volumeUp();
	
	}
	@Override
	public void undo() {
		
		theDevice.volumnDown();
		
	}

}