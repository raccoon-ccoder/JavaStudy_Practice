import java.util.Scanner;
public class Chapter4_ControlStatement_Practice6 {

	public static void main(String[] args) {
		// 입력받은 5자리수의 각 자리 더한 값 출력하기 
		Scanner sc = new Scanner(System.in);
		System.out.print("5자리의 수를 입력하세요 > ");
		String str = sc.next();
		
		int sum = 0;
		
		for(int i=0;i<str.length();i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.println("sum = " + sum);
		
			
			
			
		
	
		
		
	}

}
