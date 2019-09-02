package demo;

import java.util.Scanner;

public class PassTwoDimentionalArray {

	public static void main(String[] args) {
		int[][] m = getArray();
		
		MethodsForArray.printMultiArray(m);
		System.out.println("Sum of all elements : " + MethodsForArray.sumAllElements(m));

	}
	
	public static int[][] getArray(){
		int[][] m = new int[3][4];
		System.out.println("input array elements : ");
		Scanner input = new Scanner(System.in);
		
		for( int i = 0 ; i < m.length ; i++) {
			for( int j = 0 ; j < m[i].length ; j ++) {
				System.out.printf("m[%d][%d] : ", i, j);
				m[i][j] = input.nextInt();
			}
		}
		input.close();
		return m;
		
	}
	
	
}
