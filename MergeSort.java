import java.util.ArrayList;

public class MergeSort {
	public void merge(ArrayList<Student> students, ArrayList<Student> left, ArrayList<Student> right) {
		ArrayList<Student> tempArray = new ArrayList<>();
		
		int currentIndex = 0; // pointer index for sorted array
		int leftIndex = 0; // index for left array
		int rightIndex = 0; // index for right array
		
		// while left and right arrays still have values
		// do the sorting
		while (leftIndex < left.size() && rightIndex < right.size()) {
			// if element at left is less than element at right
			if (left.get(leftIndex).getRollNo() < right.get(rightIndex).getRollNo()) {
				// insert element at new index
				students.set(currentIndex, left.get(leftIndex));
				leftIndex++;
			// else if right is greater than left
			} else {
				// insert element at new index
				students.set(currentIndex, right.get(rightIndex));
				rightIndex++;
			}
			// increment new index for next iteration
			// after smallest number has been appended
			currentIndex++;
		}
		
		int tempIndex = 0; // pointer/placeholder index
		
		// for elements remaining in left or right index
		// copy it/those to placeholder array
		if (leftIndex < left.size()) {
			tempArray = left;
			tempIndex = leftIndex;
		} else {
			tempArray = right;
			tempIndex = rightIndex;
		}
		
		// append placeholder array to student array
		for (int index = tempIndex; index < tempArray.size(); index++) {
			students.set(currentIndex, tempArray.get(index));
	        currentIndex++;
		}
	}
	
	public void mergeSort(ArrayList<Student> students) {
		int middle;
		ArrayList<Student> left = new ArrayList<>();
		ArrayList<Student> right = new ArrayList<>();
		
		if (students.size() > 1) {
			middle = students.size() / 2;
			
			// get left array
			for (int i = 0; i < middle; i++) {
				left.add(students.get(i));
			}
			
			// get right array
			for (int j = middle; j < students.size(); j++) {
				right.add(students.get(j));
			}
			
			// recursion to divide array into left and right
			// and sort each
			mergeSort(left);
			mergeSort(right);
			
			// merge two arrays together
			merge(students, left, right);
		}
	}
}
