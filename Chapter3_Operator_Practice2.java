import java.util.Scanner;
public class Chapter3_Operator_Practice2 {

	public static void main(String[] args) {
//		화씨(Fahrenheit)를 섭씨(Celcius)로 바꾸는 코드를 생성해라.
//		변환 공식 : C = 5/9 X (F-32)
//		Math.round()를 사용하지 않고 처리할 것 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨를 입력해주세요>");
		int fahrenheit = sc.nextInt();
		
		float celcius = (int)((5/9f*(fahrenheit-32))*100+0.5)/100f;
		
		System.out.println("섭씨는 " + celcius + "입니다.");
	}

}
