// 다음과 같은 실행결과를얻도록 1~4의 코드를 완성하시오
// 결과값 : 30 20 10

class Outer {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.print( /* 1 */ value + " ");
			System.out.print( /* 2 */ this.value + " ");
			System.out.print( /* 3 */ Outer.this.value );
		}
	}
}
public class Chapter7_OOP_Practice6 {

	public static void main(String[] args) {
		/* 4*/
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
		
		inner.method1();
	}
}
