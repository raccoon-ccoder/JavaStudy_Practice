// 다음과 같이 정의된 메서드를 작성하고 테스트하시오
// 메서드명 : max, 기능 : 주어진 int형 배열의 값중 제일 큰 값을 반환, 반환타입 : int, 매개변수 : int[] arr 
public class Chapter6_OOP_Practice7 {
	
	static int max(int[] arr) {
		if(arr==null || arr.length==0)
			return -999999;
		
		int big = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(big<arr[i])
				big = arr[i];
		}
		return big;
	}
	
	
	public static void main(String[] args) {
		int[] data = { 3,2,9,4,7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));
		
		
	}

}

