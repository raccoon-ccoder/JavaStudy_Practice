import java.util.Arrays;

// 1~9사이 중복되지 않은 숫자로 이뤄진 3자리 숫자를 만드는 프로그램 
public class Chapter5_Array_Practice {

	public static void main(String[] args) {
		int[] ball = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0;i<ball.length;i++) {
			int a = (int)(Math.random()*ball.length);
			
			int tmp = ball[i];
			ball[i] = ball[a];
			ball[a] = tmp;
			
			
		}
		
		ball3 = Arrays.copyOf(ball, 3);
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}

	}

}
