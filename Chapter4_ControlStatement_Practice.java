public class Chapter4_ControlStatement_Practice {

	public static void main(String[] args) {
		// 4-4 1+(-2)+3+(-4)+5.. 와 같은 식으로 계속 더해갔을때, 몇까지 더해야 총합이 100 이상이 될까?
		int sum = 0;
		int s = 1;
		int num = 0;
		
		for(int i =1;sum<100; i++, s=-s) {
			num = s*i;
			sum += num;	
				
			}
			
			System.out.println("num="+num);
			System.out.println("sum="+sum);
		
		
			
		

	}

}
