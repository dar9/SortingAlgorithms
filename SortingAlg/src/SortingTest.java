
public class SortingTest {

	public static void main(String[] args) {
		
		//created an int array to sort
		int[] arr = {4,2,5,3,1};
		
		//print out unsorted array
		System.out.println("Original order:");
			for(int elem : arr) {
			System.out.print(elem +" ");
				}
			System.out.println(" ");
		
		//Bubble sort
		//arr = BubbleSort.BubbleSorter(arr);
		
		//Selection Sort
		//arr = SelectionSort.SelectionSorter(arr);
			
		// Insertion Sort
		//	arr = InsertionSort.InsertionSorter(arr);
			
			//Quick Sort
			arr = QuickSort.QuickSorter(arr);
			
		//print sorted array
		System.out.println("\nSorted order:");
		for(int elem: arr) {
			System.out.print(elem +" ");
		}
	}

}
