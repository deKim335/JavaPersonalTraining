package demo;
import java.awt.Toolkit;
import java.util.Scanner;

public class Timer {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many hrs do you want to set? ");
		long periodInMilisec = input.nextLong()*60*60*1000;
		
		System.out.println("How many minutes do you want to set? ");
		periodInMilisec += input.nextLong()*60*1000;
		
		System.out.println("How many secs do you want to set? ");
		periodInMilisec += input.nextLong()*1000;
		
		boolean start = false;
		
		while(!start) {
			Scanner input1 = new Scanner(System.in);
			System.out.println("Do you want to start?[Y/N]");
			String s1 = input1.nextLine().toUpperCase();
			char a = s1.charAt(0);
			if(a=='Y')
				start=true;
			input1.close();
		}
		long startTime = System.currentTimeMillis();
		long endTime = startTime + periodInMilisec;
		
		while(startTime != endTime) {
			startTime = System.currentTimeMillis();
		}
		Toolkit tk = Toolkit.getDefaultToolkit();
		tk.beep();		
		System.out.println("Time is out!!");
		
		input.close();
	}

}
