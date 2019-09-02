package demo;
import java.util.Scanner;


public class GuessNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int magicNumber = (int)(Math.random()*101);
		int guessNumber=-1;
		int guessTime = 10;
		
		while(magicNumber != guessNumber) {
			if (guessTime < 1) {
				System.out.println("Sorry. You are out!");
				break;
			}
			if(guessTime ==1) {
				System.out.println("You got one last chance!");
			}
			else
			System.out.println("You got " + guessTime + " tries.");
			System.out.println("Guess a magic number between 0 and 100 : ");
			guessNumber = input.nextInt();
			guessTime--;
					
			if(magicNumber == guessNumber) 
				System.out.println("You got it! The magic number is " + magicNumber);
			else if(magicNumber > guessNumber)
				System.out.println("Your number is too low!\n");
			else
				System.out.println("Your number is too high\n");
		}
		input.close();
	}

}
