// 다음과 같은 실행결과를 얻도록 Student 클래스에 생성자와 info()를 추가하시오
// 결과 : 김영희, 1, 1, 100, 60, 76, 236, 78.7

public class Chapter6_OOP_Practice9 {
	public static void main(String[] args) {
		MyStudent s = new MyStudent("김영희", 1, 1, 100, 60, 76);
		
		String result = s.info();
		System.out.println(result);
		
	}

}

class MyStudent {
	String name; // 학생이름 
	int ban; // 반 
	int no; // 번호 
	int kor; // 국어점수 
	int eng; // 영어점수 
	int math; // 수학점수 
	
	// 내가 푼 답
	
	MyStudent() {}
	
	MyStudent(String name,int ban,int no,int kor,int eng,int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		int sum = kor + eng + math;
		float avg = ((int)((sum/3f)*10+0.5))/10f;
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + sum + ", " + avg;
	}
}

