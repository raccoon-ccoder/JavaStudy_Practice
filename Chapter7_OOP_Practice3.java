// MyTv 클래스의 멤버변수들을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 메서드를 추가하시오 

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int num) {
		if(MIN_CHANNEL > num || MAX_CHANNEL < num) {
			this.channel = this.channel;
		}
		this.channel = num;
	}
	
	public void setVolume(int num) {
		if(MIN_VOLUME > num || MAX_VOLUME < num) {
			this.volume = this.volume;
		}
		this.volume = num;
	}
	
	public int getChannel() {
		return this.channel;
	}
	
	public int getVolume() {
		return this.volume;
	}
}
public class Chapter7_OOP_Practice3 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL : " + t.getVolume());
	}

}
