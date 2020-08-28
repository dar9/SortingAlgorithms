
public class QuickSort {
	public static int[] QuickSorter(int[] array) {
		
		doQuickSort(array, 0, array.length-1);
		
		return array;
	}
	
	public static void doQuickSort(int array[], int start, int end){
		int pivotPoint;
		
		if(start < end) {
			//get pivot point
			pivotPoint = partition(array, start, end);
			
			//sort first sublist
			doQuickSort(array, start, pivotPoint-1);
			
			//sort second sublist 
			doQuickSort(array, pivotPoint+1, end);
		}
	}
	
	public static int partition(int[] array, int start, int end) {
		int pivotValue;
		int endOfLeftList;
		int mid;
		
		mid = (start + end)/2;
		
		swap(array, start, mid);
		
		pivotValue = array[start];
		
		endOfLeftList = start;
		
		for(int scan = start+1;scan <= end; scan++) {
			if(array[scan]<pivotValue) {
				endOfLeftList++;
				swap(array, endOfLeftList,scan);
			}
		}
		
		swap(array, start, endOfLeftList);
		
		return endOfLeftList;
	}
	
	public static void swap(int[] array, int a, int b) {
		int temp;
		
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
