/* 연습문제 7-3에서 작성한 MyTv클래스에 이전 채널로 이동하는 기능의 메소드를 추가해라
   메서드명 : gotoPrevChannel, 기능 : 현재 채널을 이전 채녈로 변경한다, 반환타입, 매개변수 : 없음 */

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int backChannel;
	private int nextChannel;

	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		
		backChannel = this.channel;
		this.channel = channel;
		
	}
	
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		
		this.volume = volume;
	}
	
	public int getChannel() {
		return this.channel;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void gotoPrevChannel() {
		nextChannel = this.channel;
		this.channel = backChannel;
		backChannel = nextChannel;
		
		// 변수로 처리하기 보단 있는 메서드를 활용하는 것이 더 좋았을듯하다 
	}
	
}

public class Chapter7_OOP_Practice4 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}

}
