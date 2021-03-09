// 섯다카드 20장을 포함한 섯다카드 한 벌(SutdaDeck 클래스)를 정의한 것으로, 섯다카드 20장을 담는 SutdaCard 배열을 초기화하시오 
// 단 섯다카드는 1-10까지 숫자가 적힌 카드가 한쌍씩 있고, 1,3,8의 숫자면 둘 중의 한 장은 광(Kwang)이어야 함
// SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 함 

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0;i<cards.length;i++) {
			int num = i%10+1;
			boolean isKwang = (i<10) && ((num==3)||(num==8)||(num==1));
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	
	void shuffle() {
		int random = (int)(Math.random()*cards.length);
		SutdaCard tmp = new SutdaCard();
		for(int i=0;i<cards.length;i++) {
			tmp = cards[i];
			cards[i] = cards[random];
			cards[random] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		return cards[(int)(Math.random()*20)];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}


public class Chapter7_OOP2_Practice2 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0;i< deck.cards.length;i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i < deck.cards.length;i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));

	}

}
