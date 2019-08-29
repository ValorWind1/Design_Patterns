package command;

public class TurnTVON implements Command{

	ElectronicDevice theDevice;
	
	public TurnTVON(ElectronicDevice newDevice) {
		theDevice = newDevice ; 
	}
	@Override
	public void execute() {
		
		
		theDevice.on();
		
		
	}
	@Override
	public void undo() {
		theDevice.off();
		
	}

}
