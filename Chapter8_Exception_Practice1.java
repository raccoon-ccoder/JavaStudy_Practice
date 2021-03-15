/* 다음은 1~100 사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를 넣어서 발생한 예외다 (InputMismatchException)
 * 예외처리를 해서 숫자가 아닌 값을 입력했을 떄는 다시 입력을 받도록 보완해라.
 */


import java.util.*;

public class Chapter8_Exception_Practice1 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요.");
			try {
			input = new Scanner(System.in).nextInt();
			} catch (InputMismatchException ie) {
				System.out.println("유효하지 않은 값입니다. 다시 입력해주세요");
				continue;
			}
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break;
			}
		} while(true);

	} // end of main
} // end of class 
