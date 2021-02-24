// 다음과 같이 정의된 isNumber 메소드를 정의하시오
// 주어진 문자열이 모두 숫자열로 구성되어 있으면 true, 그렇지 않으면 false 반환, 반환타입 boolean, 매개변수 string str 
public class Chapter6_OOP_Practice3 {
	
	static boolean isNumber(String str) {
		if(str==null || str.equals(" "))
			return false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)<'0' || '9'<str.charAt(i))
				return false;
		}
		return true;	
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "123o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}

