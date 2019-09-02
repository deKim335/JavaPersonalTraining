package demo;

public class Calculator {

	public static void main(String[] args) {
		
		if(args.length !=3) {
			System.out.println("Usage: java Caculator operand1 operator operand2");
			System.exit(1);			
		}
		
		/*
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[2]);
		double c;
		
		if(args[1].equals("+"))
			c = a+b;
		else if(args[1].equals("-"))
			c = a-b;
		else if(args[1].equals("."))
			c = a*b;
		else
			c = a/b;
		*/
		double result=0;
		
		switch (args[1].charAt(0)) {
		case '+' : result = Double.parseDouble(args[0]) + Double.parseDouble(args[2]); break;
		case '-' : result = Double.parseDouble(args[0]) - Double.parseDouble(args[2]); break;
		case '.' : result = Double.parseDouble(args[0]) * Double.parseDouble(args[2]); break;
		case '/' : result = Double.parseDouble(args[0]) / Double.parseDouble(args[2]); break;
		}
		
		System.out.printf("%s %s %s = %.2f\n", args[0], args[1], args[2], result);
	}

}
