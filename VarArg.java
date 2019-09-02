package demo;

public class VarArg {

	public static void main(String[] args) {
		printMax(2,4,7,1,26);
		printMax(new double[]{1,3,4,6,17});
		printMax();
	}
	public static void printMax(double... numbers) {
		if(numbers.length == 0) {
			System.out.println("No arg passed");
			return;
		}
		else {
			double max = numbers[0];
			for(int i = 0 ; i < numbers.length ; i++) {
				if(numbers[i] > max) {
					max = numbers[i];
				}
			}
			System.out.println("The max value is " + max);
		}
		
	}
}
