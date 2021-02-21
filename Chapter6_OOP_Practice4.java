// 두 점 거리를 계산하는 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오 
public class Chapter6_OOP_Practice4 {
	
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));

	}

}

class MyPoint{
	int x;
	int y;
	
	MyPoint() {}
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x,int y) {
		return Math.sqrt((this.x - x)*(this.x - x) + (this.y -y)*(this.y - y));
	}
}


