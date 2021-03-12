// Outer클래스의 내부 클래스 Inner 클래스의 멤버변수 iv 값을 출력하시오

class Outer {
	class Inner {
		int iv = 100;
	}
}
public class Chapter7_OOP_Practice5 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		
		System.out.println(i.iv);
	}

}
