
public class InsertionSort {

	public static int[] InsertionSorter(int[] array) {
		int unsortedValue;
		int scan;
		for(int i=0;i<array.length;i++) {
			unsortedValue = array[i];
			
			scan = i;
			
			while(scan > 0 && array[scan-1] > unsortedValue) {
				array[scan] = array[scan -1];
				scan --;
			}
			array[scan] = unsortedValue;
		}
		
		return array;
	}
}
