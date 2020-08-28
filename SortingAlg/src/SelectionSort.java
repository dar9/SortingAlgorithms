
public class SelectionSort {
	
	/**
	 * SelectionSorter method uses Selection sort to sort an in array.
	 * @param array is an int array that is passed as a parameter to sort it.
	 * @return
	 */
	public static int[] SelectionSorter(int[] array) {
		int smallest;
		int smallestIndex;
		
		for(int i=0;i<array.length-1;i++) {
			smallest = array[i];
			smallestIndex = i;
			
			for(int j=i+1;j<array.length;j++) {
				
				if(smallest > array[j]) {
					smallest = array[j];
					smallestIndex = j;
				}
		
			}
			array[smallestIndex]=array[i];
			array[i]=smallest;

		}
		
		return array;
	}
}
