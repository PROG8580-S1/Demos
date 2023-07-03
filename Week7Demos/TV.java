
public class TV {
	public int channel;
	public int volumeLevel;
	public boolean on;

	public TV() {
		channel = 1;
		volumeLevel = 3;
		on = false;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}

	public void VolumeUp() {
		if (volumeLevel < 7) {
			volumeLevel++;
		}
	}

	public void VolumeDown() {
		if (volumeLevel > 0 && on == true) {
			volumeLevel--;
		}
	}
	
	public void setChannel() {
		// complete for practice
	}

	public void setVolume() {
		// complete for practice
	}
	
	
	
	
	
	
	
}