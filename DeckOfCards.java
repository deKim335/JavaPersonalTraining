package demo;

public class DeckOfCards {

	public static void main(String[] args) {
		int[] deck = new int[52];
		deck = putValue(deck);
		deck = shuffle(deck);
		printFirstFourCard(deck);
	

	}
	
	public static int[] putValue(int[] array) {
		for( int i = 0 ; i < array.length ; i++ ) {
			array[i] = i;
		}		
		return array;
	}
	
	public static int[] shuffle(int[] array) {
		for( int i = 0 ; i < array.length ; i++) {
			int temp;
			int j = (int)(Math.random()*array.length);
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return array;
	}
	
	public static void printFirstFourCard(int[] array) {
		for(int i=0 ; i < 4 ; i++) {
			System.out.printf("Your card %d is %s.\n", i+1, cardDistinguisher(array[i]));
		}
	}
	
	public static String cardDistinguisher(int a) {
		String sort="";
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		sort = ranks[a%13] + " of " + suits[a/13];
		return sort;
	}
}
