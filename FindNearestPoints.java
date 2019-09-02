package demo;

import java.util.Scanner;

public class FindNearestPoints {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many dots? ");
		int row = input.nextInt();
		
		while(row < 2) {
			System.out.println("How many dots? ");
			row = input.nextInt();
		}
		
		double[][] coordinations = new double[row][2];
		System.out.println("Input coordinations x, y :");
		
		for(int i = 0 ; i < coordinations.length ; i++) {
			for(int j = 0 ; j < 2 ; j++) {
				coordinations[i][j] = input.nextDouble();
			}
		}
		
		double nearestDistance = distanceBtwTwoDots(coordinations[0], coordinations[1]);
			
		for( int i = 0 ; i < coordinations.length-1 ; i++) {
			for( int j = i + 1 ; j < coordinations.length ; j++ ) {
				if(nearestDistance > distanceBtwTwoDots(coordinations[i], coordinations[j])) {
					nearestDistance = distanceBtwTwoDots(coordinations[i], coordinations[j]);
				}
			}
		}
		
		for( int i = 0 ; i < coordinations.length-1 ; i++) {
			for( int j = i + 1 ; j < coordinations.length ; j++ ) {
				if(nearestDistance == distanceBtwTwoDots(coordinations[i], coordinations[j])) {
					System.out.println("The nearest two dots are : ("+coordinations[i][0]+", "+coordinations[i][1]+")  ("+coordinations[j][0]+", "+coordinations[j][1]+")"+
							"and the distance is " + nearestDistance);
				}
			}
		}
				
		input.close();
	}
	public static double distanceBtwTwoDots(double[] array, double[] array1) {
		return Math.sqrt(Math.pow((array[0]-array1[0]),2) + Math.pow((array[1]-array1[1]), 2));
	}
	
}
