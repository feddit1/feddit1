package chapter06;

public class StudentMain {

	public static void main(String[] args) {

		// 기본생성자를 이용한 student1 객체 생성
		Student_07 student1 = new Student_07();

		student1.studentname = "솔자바";
		student1.address = "종로구";
		student1.showStudentIfo();
		
		System.out.println();
		
		Student_07 student2 = new Student_07("솔데이터","강남구");
		student2.showStudentIfo();
		
		//getter /setter
		Student_07 student3 = new Student_07();
		student3.setStudentname("솔데스크");
		student3.setAddress("강서구");
		student3.showStudentIfo();
		
		System.out.println(student3.getStudentname());
		System.out.println(student3.getAddress());
		
	}

}
