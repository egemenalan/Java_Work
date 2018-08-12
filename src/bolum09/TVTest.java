package bolum09;

public class TVTest {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);

		TV tv2 = new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		tv2.turnOf();
		tv2.volumeUp();
		
		
		new TV();

		System.out.println("tv1's channel is " + tv1.getChannel() + " and volume level is " + tv1.getVolumeLevel() + " tv sayisi: " + tv1.kacTvVar);
		System.out.println("tv2's channel is " + tv2.getChannel() + " and volume level is " + tv2.getVolumeLevel() + " tv sayisi: " + tv2.kacTvVar);
		
	}

}
