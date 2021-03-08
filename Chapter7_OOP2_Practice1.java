// 섯다카드 20장을 포함한 섯다카드 한 벌(SutdaDeck 클래스)를 정의한 것으로, 섯다카드 20장을 담는 SutdaCard 배열을 초기화하시오 
// 단 섯다카드는 1-10까지 숫자가 적힌 카드가 한쌍씩 있고, 1,3,8의 숫자면 둘 중의 한 장은 광(Kwang)이어야 함
// SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 함 

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		int num = 1;
		int ber = 1;

	
		
		for(int i=0;i<10;i++) {
			cards[i] = new SutdaCard(num++,false);
		}
		
		for(int i=10;i<cards.length;i++) {
			cards[i] = new SutdaCard(ber++,false);
		}
		cards[0] = new SutdaCard(1, true);
		cards[2] = new SutdaCard(3, true);
		cards[7] = new SutdaCard(8, true);
		
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


public class Chapter7_OOP2_Practice1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0;i< deck.cards.length;i++) {
			System.out.print(deck.cards[i] + ",");
		}

	}

}
