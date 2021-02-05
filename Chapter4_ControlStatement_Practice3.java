import java.util.Scanner;
public class Chapter4_ControlStatement_Practice3 {

	public static void main(String[] args) {
		// 별모양으로 피라미드 만들기
		System.out.println("원하는 줄의 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int j=0;j<num;j++) { // j=0 1 2 3
			
			for(int i = num-1;i>j;i--) {  
				System.out.print(" ");
			}
			for(int k=0;k<2*j+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
