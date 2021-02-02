import java.util.Scanner;
public class Chapter3_Operator_Practice {

	public static void main(String[] args) {
//		변수 num의 값 중 백의 자리 이하를 버리는 코드를 생성하시오. 변수 num이 456이면 400, num이 123이면 100이 된다 
		Scanner sc = new Scanner(System.in);
		System.out.print("백의 자리수를 입력하세요>");
		int num  = sc.nextInt();
		
		int answer = 0;
		answer = num - (num%100);
		
		System.out.println("생성된 숫자는 " + answer + " 입니다.");

	}

}
