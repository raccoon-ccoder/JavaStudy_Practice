// 다음과 같이 정의된 메서드를 작성하고 테스트하시오
// 메서드명 : shuffle, 반환 타입 : int[], 매개변수 : int[] arr - 정수값이 담긴 배열 
public class Chapter6_OOP_Practice5 {
	
	static int[] shuffle(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int tmp = 0;
			int a = (int)(Math.random()*arr.length);
			
			tmp = arr[i];
			arr[i] = arr[a];
			arr[a] = tmp;
		}
		
		return arr;
		
		
	}
	public static void main(String[] args) {
		
		int[] original = { 1,2,3,4,5,6,7,8,9 };
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
		
	}

}

