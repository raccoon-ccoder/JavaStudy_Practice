import java.util.Scanner;
public class Chapter4_ControlStatement_Practice2 {
	public static void main(String[] args) {
		
		// 1-100 중 숫자맞추기 게임 프로그램 만들
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			++count;
			System.out.printf("1과 100사이의 숫자를 입력해주세요 >");
			input = sc.nextInt();
			
			if(answer<input) {
				System.out.println("더 작은 숫자를 입력해주세요!");
			} else if(input<answer) {
				System.out.println("더 큰 숫자를 입력해주세요!");
			} else {
				System.out.println("정답입니다!");
				System.out.println("시도횟수는 " + count +"번입니다.");
				break;
			}
			
		}while(true);
		
	}

}
