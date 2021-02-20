
public class Chapter6_OOP_Practice2 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		 
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());

	}

}

class Student{
	String name; // 학생이름 
	int ban;  // 반 
	int no; // 번호 
	int kor; // 국어점수 
	int eng; // 영어점수 
	int math; // 수학점수 
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return ((int)((kor+math+eng)/3f*10+0.5f))/10f;
	}
}