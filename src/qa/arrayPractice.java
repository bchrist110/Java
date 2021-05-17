package qa;

public class arrayPractice {
	public static void main(String[] args) {
		
		grid();
		
	}
	
	public static void tenArray() {
		int[] myArray = {1,2,3,4,5,6,7,8,9,10};
		
		for (int num: myArray) {
			System.out.println(num);
		}
	}
	
	public static void arrayCreator() {
		
		int[] myArray;
		myArray = new int[10];
		
		for (int i = 0; i < 10; i++) {
			myArray[i] = i + 5;
			System.out.println(myArray[i]);
		}
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = myArray[i]*10;
			System.out.println(myArray[i]);
		}
		
	}
	
	public static void enhanced() {
		
		String[] myStrings = {"stuff", "more stuff", "lots of stuff"};
		
		for (String word: myStrings) {
			System.out.println(word);
		}
	}
	
	public static void grid() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.println("[-]");
			}
		}
	}
}
