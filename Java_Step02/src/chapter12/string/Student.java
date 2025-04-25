package chapter12.string;

public class Student {

	int studentId;
	String studentName;

	public Student() {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	// 물리적인 주소
	@Override
	public int hashCode() {
		return studentId;
	}

	// 논리적 주소
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentId == std.studentId) {// 존재하는 id인제 확인
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
