package demo;

import java.util.Scanner;

public class LotteryUsingStrings {

	public static void main(String[] args) {
		String lotto = (10 + (int)(Math.random()*90) + "");
		System.out.println(lotto);
		
		Scanner input = new Scanner(System.in);
		System.out.println("input two digits : ");
		String lottoInput = input.nextLine();
		char ch1 = lottoInput.charAt(0);
		char ch2 = lottoInput.charAt(1);
				
		if (lotto.equals(lottoInput)) {
			System.out.println("You won 30,000 cad congrats!");
		}
		else if(lotto.indexOf(ch1)>=0 && lotto.indexOf(ch2)>=0) {
			System.out.println("You won 20,000 cad congrats!");
		}
		else if(lotto.indexOf(ch1)<0 && lotto.indexOf(ch2)<0) {
			System.out.println("Sorry try again next time");
		}
		else {
			System.out.println("You won 10,000 cad congrats!");
		}
		input.close();
	}

}
