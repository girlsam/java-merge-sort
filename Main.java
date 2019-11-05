import java.util.*;

public class Main {	
	public static void printOriginalArray(ArrayList<Student> students) {
		System.out.println("Original array:");
		for (Student student : students) {
			System.out.print(student.getRollNo() + " ");
		}
		System.out.println();
	}
	
	public static void printSortedArray(ArrayList<Student> students) {
		for (Student student : students) {
			System.out.print(student.getRollNo() + " ");
		}
		System.out.println();
	}
	
	public static void compareStudents() {
		Students studentsClass = new Students();
		ArrayList<Student> students = studentsClass.students();
		
		printOriginalArray(students);
		Collections.sort(students, new RollNoComparator());
		System.out.println("After Comparator sort:");
		printSortedArray(students);
	}
	
	public static void doMergeSort() {
		Students studentsClass = new Students();
		ArrayList<Student> students = studentsClass.students();
		MergeSort mergeClass = new MergeSort();
		
		printOriginalArray(students);
		mergeClass.mergeSort(students);
		System.out.println("After merge sort:");
		printSortedArray(students);
	}

	public static void main(String args[]) {
		System.out.println("Using comparator class...");
		compareStudents();

		System.out.println("------------------------");

		System.out.println("Using merge sort...");
		doMergeSort();
	}
}
