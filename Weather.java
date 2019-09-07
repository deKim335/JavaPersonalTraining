package demo;

import java.util.Scanner;

public class Weather {

	public static void main(String[] args) {
		final int NUMBER_OF_DAYS = 10;
		final int NUMBER_OF_HOURS = 24;
		double[][][] data = new double [NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
		
		Scanner input = new Scanner(System.in);
		
		for (int k = 0 ; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS ; k++) {
			int day = input.nextInt();
			int hour = input.nextInt();
			double temperature = input.nextDouble();
			double humidity = input.nextDouble();
			data [day-1][hour-1][0] = temperature;
			data [day-1][hour-1][0] = humidity;
		}
		
		for (int i = 0 ; i < NUMBER_OF_DAYS ; i++) {
			double totalDailyTemp = 0;
			double totalDailyHum = 0;
			for( int j = 0 ; j < NUMBER_OF_HOURS ; j++) {
				totalDailyTemp += data[i][j][0];
				totalDailyHum += data[i][j][1];
			}
			System.out.println("Average daily temp is " + totalDailyTemp/NUMBER_OF_HOURS);
			System.out.println("Average daily humidity is " + totalDailyHum/NUMBER_OF_HOURS);
		}
		
		input.close();

	}

}
