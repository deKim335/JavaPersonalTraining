package demo;

public class SelectionSort {

	public static void selectionSort(double[] list) {
		System.out.print("Original: ");
		printArray(list);
		for(int i = 0 ; i < list.length-1 ; i++) {
			//int minIndex = minIndex(list, i);
			//swap(list, i, minIndex);
			int maxIndex = maxIndex(list, i);
			swap(list, i, maxIndex);
			printArray(list);
		}
			

	}
	//minIndex
	public static int minIndex(double[] list, int minIndex) {
		for(int i = minIndex+1 ; i < list.length ; i++ ) {
			if(list[minIndex]>list[i]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static int maxIndex(double[] list, int maxIndex) {
		for(int i = maxIndex+1 ; i < list.length ; i++ ) {
			if(list[maxIndex]<list[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static double[] swap(double[] list, int a, int b) {
		double temp = list[a];
		list[a] = list[b];
		list[b] = temp;
		
		return list;
	}
	
	public static void printArray(double[] t) {
		for (int i = 0 ; i < t.length; i++) {
			if(i==t.length-1)
				System.out.println(t[i]);
			else
				System.out.print(t[i]+"   ");
		}
	}

}
