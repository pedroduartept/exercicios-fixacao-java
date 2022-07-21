package toStringMetod;

public class Student {

	private int studentId;
	private String name;

	
	
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String toString() {
		return studentId + " " + name;
	}

}