package demo;

import java.util.Scanner;

public class PrintGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your score : ");
		double score = input.nextDouble();
		getGrade(score);
		
		input.close();

	}
	public static void getGrade(double a) {
		if( a < 0 || a > 100) {
			System.out.println("Invalid score!");
			return;
		}
		
		if(a >= 90)
			System.out.println("A");
		else if(a >= 80)
			System.out.println("B");
		else if(a >= 70)
			System.out.println("C");
		else
			System.out.println("D");
	}
}
