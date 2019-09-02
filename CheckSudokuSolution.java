package demo;

import java.util.*;

public class CheckSudokuSolution {

	public static void main(String[] args) {
		//MethodsForArray.getArray();
		int[][] sudoku = {
							{5, 3, 4, 6, 7, 8, 9, 1, 2},
							{6, 7, 2, 1, 9, 5, 3, 4, 8},
							{1, 9, 8, 3, 4, 2, 5, 6, 7},
							{8, 5, 9, 7, 6, 1, 4, 2, 3},
							{4, 2, 6, 8, 5, 3, 7, 9, 1},
							{7, 1, 3, 9, 2, 4, 8, 5, 6},
							{9, 6, 1, 5, 3, 7, 2, 8, 4},
							{2, 8, 7, 4, 1, 9, 6, 3, 5},
							{3, 4, 5, 2, 8, 6, 1, 7, 9}
						 };
		System.out.println("is it valid? " + isValid(sudoku));
	}
	public static boolean isValid(int[][] array) {
		/*
		//check 1~9
		for( int i = 0 ; i < array.length ; i++ ) {
			for ( int j = 0 ; j < array[0].length ; j++) {
				if(array[i][j] < 1 || array[i][j] >9) 
					return false;					
			}				
		}
		
		//if row {1,2,3,4,5,6,7,8,9}
		for( int i = 0 ; i < array.length ; i++) {
			int[] temp = new int[9];
			temp = array[i].clone(); //array[i] is array for a row
			int[] temp1 = {1,2,3,4,5,6,7,8,9};
			Arrays.sort(temp);
			if(!(Arrays.equals(temp, temp1)))
				return false;
		}*/
			
		//if column {1,2,3,4,5,6,7,8,9}
		for( int j = 0 ; j < array[0].length ; j++) {
			int[] temp = new int[9];
			for( int i = 0 ; i < array.length ; i++) {
				temp[i] = array[i][j];
			}
			int[] temp1 = {1,2,3,4,5,6,7,8,9};
			//MethodsForArray.printArray(temp);
			Arrays.sort(temp);
			
			if(!(Arrays.equals(temp, temp1)))
				return false;
		}
		/*
		if(!blockChecker(array))
			return false;
		*/
		return true;
		
	}
	public static boolean blockChecker(int[][] array) {
		//if block {1,2,3,4,5,6,7,8,9}
		for( int i = 0 ; i < 7 ; i += 3) {
			for( int j = 0 ; j < 7 ; j += 3) {
				if(!blockCheckerIndex(i,j,array))
					return false;
			}			
		}
		return true;
	}
	
	public static boolean blockCheckerIndex(int row, int colIndex, int[][] array) {
		int[] temp = new int[9];
		int[] temp1 = {1,2,3,4,5,6,7,8,9};
		int counter = 0;
		
		for ( int i = row ; i < row + 3 ; i++ ){
			for( int j = colIndex ; j < colIndex + 3 ; j++, counter++ ) 	{
				temp[counter] = array[i][j];
			}
		}
		
		MethodsForArray.printArray(temp);
		System.out.println();
		Arrays.parallelSort(temp);
		if(!(Arrays.equals(temp, temp1)))
			return false;
		
		return true;
	}
}
