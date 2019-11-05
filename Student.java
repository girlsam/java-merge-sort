public class Student {
	private int rollno;
	private String name, address;
	
	public Student(int rollno, String  name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public int getRollNo() {
		return rollno;
	}
	
	public void printStudent() {
		System.out.println(rollno + " is the roll number for " + name + ".");
	}
}
