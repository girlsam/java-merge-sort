import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		// return roll nums in asc order
		// by overriding Comparator's compare method
		return student1.getRollNo() - student2.getRollNo();
	}
}
