package demo;

import java.util.Scanner;

public class SubstractionQuizLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int correctCount=0;
		String result = "";
		long startTime = System.currentTimeMillis();
		
		while(count  < 5) {
				int num1 = (int)(Math.random()*100);
				int num2 = (int)(Math.random()*100);
				
				//num1 should be bigger than num2
				if (num1 < num2) {
					int temp = num1;
					num1 = num2;
					num2 = temp;
				}
				
				System.out.println("What is " + num1 + " - " + num2 + " ? ");
				int answer = input.nextInt();
				
				if(answer == (num1- num2)) {
					correctCount++;
					result += num1 + " - " + num2 + " = " + answer + " correct!\n";//make the result
				}
				else
					result += num1 + " - " + num2 + " = " + answer + " wrong!\n";//make the result
				count ++;
		}
		long endTime = System.currentTimeMillis();
		
		long testTime = (endTime - startTime)/1000;
		
		System.out.println("Correct count is " + correctCount);
		System.out.println("Test time is " + testTime + " seconds");
		System.out.println(result);
		input.close();

	}

}
