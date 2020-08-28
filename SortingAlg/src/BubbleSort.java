
public class BubbleSort {

	/**
	 * BubbleSorter method uses the bubble sort to sort an int array.
	 * @param array is the int array that is passed as a parameter to sort it.
	 */

	public static int[] BubbleSorter(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1; j<array.length;j++) {
				//if j is less then i change them
				if(array[j]<array[i]) {
					int tempi = array[i];
					array[i] = array[j]; 
					array[j] = tempi;
					
				}
			}
		}
		
		// end of bubble sort
		//return the sorted array
		return array;
	}

}
