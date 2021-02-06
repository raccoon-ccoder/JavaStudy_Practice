import java.util.Scanner;
public class Chapter4_ControlStatement_Practice4 {

	public static void main(String[] args) {
		// 별모양으로 모래시계 모양 코드 만들기 
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 줄의 수를 입력해주세요>");
		int num = sc.nextInt();
		
		for(int i = 1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println("* * *");
			} else {
				System.out.println(" * * ");
			} 
			
			
			
		}
		
	}

}
