package demo;

import java.util.Scanner;

public class MethodsForArray {
	public static int[][] getArray(){
		Scanner input = new Scanner(System.in);
		System.out.println("input row and column : ");
		int i = input.nextInt();
		int j = input.nextInt();
		int[][] array = new int[i][j];
		
		for(int k = 0 ; k < array.length ; k++ ) {
			for( int l = 0 ; l < array[k].length ; l++) {
				array[k][l] = input.nextInt();
			}
		}
		input.close();
		return array;
	}
	public static int[][] randomShuffle(int[][] array){
		for (int i = 0 ; i < array.length ; i++ ) {
			for(int j = 0 ; j < array[i].length ; j++ ) {
				int i1 = (int)(Math.random()*array.length);
				int j1 = (int)(Math.random()*array[i].length);
				int temp = array[i][j];
				array[i][j] = array[i1][j1];
				array[i1][j1] = temp;
			}
		}
		return array;
	}
	
	public static int maxRow(int[][] array) {
		int maxIndex = 0;
		int maxRow = 0;
		for (int i = 0 ; i < array.length ; i++ ) {
			int sumRow = 0;
			for(int j = 0 ; j < array[i].length ; j++ ) {
				sumRow += array[i][j];
			}
			if(sumRow > maxRow) {
				maxRow = sumRow;
				maxIndex = i;
			}
		}
		System.out.println("The max sum of a row is " + maxRow);
		return maxIndex;
	}
	
	public static void sumElementByColumn(int[][] array) {
		for(int j = 0 ; j < array[0].length ; j++ ) {
			int total = 0;
			for (int i = 0 ; i < array.length ; i++ ) {
				total += array[i][j];
			}
			System.out.printf("The sum of column %d is %d.\n", j, total);
		}
	}
	public static int sumAllElements(int[][] array) {
		int total = 0;
		for (int i = 0 ; i < array.length ; i++ ) {
			for(int j = 0 ; j < array[i].length ; j++ ) {
				total += array[i][j];
			}
		}
		return total;
	}
	public static void printMultiArray(int[][] array) {
		for (int i = 0 ; i < array.length ; i++ ) {
			for(int j = 0 ; j < array[i].length ; j++ ) {
				System.out.printf("%5d",array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void printArray(String[] t) {
		for (int i = 0 ; i < t.length; i++) {
			System.out.print(t[i]+" ");
		}
	}
	public static void printArray(int[] t) {
		for (int i = 0 ; i < t.length; i++) {
			System.out.print(t[i]+" ");
		}
	}
	
	public static void printArray(double[] t) {
		for (int i = 0 ; i < t.length; i++) {
			System.out.print(t[i]+" ");
		}
	}
	public static int[] reverseArray(int[] a) {
		for ( int i = 0, j = a.length-1 ; i < a.length/2 ; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
		return a;
	}
}
