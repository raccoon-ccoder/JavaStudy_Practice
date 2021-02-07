import java.util.Arrays;
import java.util.Scanner;

// 원하는 2차원배열 만드는 프로그램 짜
public class Chapter5_Array_Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr[];
		System.out.print("행의 크기 입력 : ");
		int num = sc.nextInt();
		arr = new char[num][];
		
		for(int i =0; i<arr.length;i++) {
			System.out.print(i +"행의 열의 크기 입력 : ");
			int num2 = sc.nextInt();
			arr[i] = new char[num2];	
		}
		
		char ch = 'a';
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = ch++;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
