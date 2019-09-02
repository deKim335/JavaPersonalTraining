package demo;
import java.util.Scanner;

public class AnalyzeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many numbers? ");
		int a = input.nextInt();
		double[] numbers = new double[a];
		double sum = 0;
		
		for ( int i = 0 ; i < numbers.length ; i++) {
			System.out.printf("number %d : ", i+1);
			numbers[i]=input.nextDouble();
			sum += numbers[i];
		}
		
		double avg = sum / a;
		
		for ( int i = 0 ; i < numbers.length ; i++ ) {
			if (numbers[i] > avg)
				System.out.printf("numbers[%d](%.2f) is bigger than the avg(%.2f)\n",i,numbers[i],avg);
		}
		input.close();
	}
}
