package demo;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.print("        ");
		for( int i = 1 ; i < 10; i++ ) {
			System.out.printf("%-8d", i);
		}
		System.out.println("\n---------------------------------------------------------------");
		
		for(int i = 1 ; i < 10 ; i ++) {
			System.out.print(i + "  |  " );
			for(int j = 1 ; j < 10; j++ ) {
				System.out.printf("%-8d" , i*j);
			}
			System.out.print("\n");
		}

	}

}
