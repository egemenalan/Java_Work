package bolum09;

public class TV {
	private int channel;
	private int volumeLevel;
	private boolean on;
	
	static int kacTvVar = 0;

	TV() {
		channel = 1;
		volumeLevel = 1;
		on = false;
		kacTvVar++;
	}
	
	TV(int c){
		channel = c;
		
	}

	void turnOn() {
		on = true;

	}

	void turnOf() {
		on = false;
	}

	void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120) {
			channel = newChannel;
		}
	}

	void setVolume(int newVolume) {
		if (on && volumeLevel >= 1 && volumeLevel <= 7)
			volumeLevel = newVolume;
	}

	void channelUp() {
		if (on && channel <= 120) {
			channel++;
		}

	}

	void channelDown() {
		if (on && channel > 1) {
			channel--;
		}

	}

	void volumeUp() {
		if (on && volumeLevel <= 7) {
			volumeLevel++;
		}

	}

	void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel--;
		}

	}

	public int getChannel() {
		return channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

}
