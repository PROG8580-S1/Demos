
public class TVTest {

	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.turnOn();
		tv.VolumeDown();
		
		tv.turnOff();
		tv.VolumeDown();
		tv.VolumeDown();
		tv.VolumeDown();
		
		tv.turnOn();
		tv.VolumeDown();
		
		System.out.println("Power:   " + tv.on);
		System.out.println("Channel: " + tv.channel);
		System.out.println("Volume:  " + tv.volumeLevel);

	}

}
