package livrojava;

public class DVDPlayer {
	boolean canRecord = false;
	
	void playDVD() {
		System.out.println("DVD playing");
	}
	
	void recordDVD() {
		System.out.println("DVD recording");
	}
	
	public static void main(String [] args) {
		
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		
	}
}

