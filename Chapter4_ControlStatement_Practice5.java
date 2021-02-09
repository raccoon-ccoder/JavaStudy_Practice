import java.util.Scanner;
public class Chapter4_ControlStatement_Practice5 {

	public static void main(String[] args) {
		// 카페 음료 주문 코드 만들기 
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int americano = 0;
		int latte = 0;
		int vanillalatte = 0;
		
		while(true) {
			System.out.println("------ 메뉴 ------");
			System.out.println("아메리카노 : 3500원");
			System.out.println("라떼     : 4000");
			System.out.println("바닐라라떼 : 4500원");
			System.out.println("-----------------");
			System.out.print("주문하시겠습니까? (Y/N) ");
			
			char answer = sc.next().charAt(0);
			
			if(answer== 'Y' || answer == 'y') {
				System.out.print("음료명을 입력해주세요 : ");
				String name = sc.next();
				System.out.print("음료잔수를 입력해주세요 : ");
				int num = sc.nextInt();
				switch(name) {
				case "아메리카노":
					americano += num;
					sum += num*3500;
					break;
				case "카페라떼":
					latte += num;
					sum += num*4000;
					break;
				case "바닐라라떼":
					vanillalatte += num;
					sum +=  num*4500;
					break;	
				}
				
			} else {
				break;
			}
		
		}
			System.out.println();
			System.out.printf("주문내역 : 아메리카노 %d잔, 카페라떼 %d잔, 바닐라라떼 %d잔\n", americano, latte, vanillalatte);
			System.out.printf("주문금액 : %d원\n", sum);
			System.out.println("주문이 완료되었습니다. 잠시만 기다려주세요 ^^");
			
			
			
			
		
	
		
		
	}

}
