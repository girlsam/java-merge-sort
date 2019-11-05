import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Students {
	public ArrayList<Student> students() {
		return new ArrayList<Student>() {
			{
				add(new Student(12, "Dan", "address1"));
	            add(new Student(92, "Ann", "address2"));
	            add(new Student(73, "Jan", "address3"));
	            add(new Student(34, "Bill", "address4"));
	            add(new Student(51, "Bob", "address5"));
	            add(new Student(66, "Mary", "address6"));
	            add(new Student(27, "Todd", "address7"));
	            add(new Student(84, "Jane", "address8"));
	            add(new Student(19, "Rob", "address9"));
	            add(new Student(14, "Ted", "address10"));
			}
		};
	}
}
