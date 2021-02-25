// 랜덤으로 생성되는 6자리의 아이디명 출력하는 코드 
public class RandomID {

	public static void main(String[] args) {
		
		char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		int[] num = { 1,2,3,4,5,6,7,8,9 };
		String[] id = new String[6];
		
		for(int i=0;i<3;i++) {  // 문자로 구성된 아이디 1~3번째 자리
			id[i] = c[(int)(Math.random()*5+1)] + " ";
			}
		for(int i=3;i<6;i++) { // 숫자로 구성된 아이디 4~6번째 자리 
			id[i] = num[(int)(Math.random()*8+1)] + " ";
		}
		
		System.out.println("랜덤 닉네임 생성 -> ");
		
		for(int i=0;i<id.length;i++) {
			System.out.print(id[i]);
		}
	}

}
