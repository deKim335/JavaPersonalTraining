package demo;

public class FutureTuition {

	public static void main(String[] args) {
		double tuition = 10000;
		int year = 0 ;
		
		while(tuition <= 20000) {
			tuition*=1.07;
			year++;
		}
		
		System.out.println("The tuition will be doubled in "+ year +" years");
		System.out.printf("The tuition will be %,7.2f cad in %2d years",tuition, year);

	}

}
