package qa;

public class Runner {
	
	public static void main(String[] args) {
//		doWhileStatement();
//		forStatements();
		skip();
	}
	
	public static void nestedForStatement() {
		for (int counter = 0; counter < 10;  counter ++) {
			for (int innerCounter = 1; innerCounter <= 10; innerCounter++) {
				System.out.println(counter + " * " + innerCounter + " = " + (counter * innerCounter));
			}
		}
	}
	
	public static void skip() {
		for (int counter = 0; counter < 10;  counter ++) {
			if (counter == 2) {
				continue;
			}
			
			System.out.println(counter);	
		}
	}
	
	public static void forStatements() {
		for (int counter = 0; counter < 10;  counter ++) {
			System.out.println(counter);	
		}
	}
	
	public static void doWhileStatement() {
		int playCount = 0;
		int maxPlays = 5;

		do {
			System.out.println("Play Count: " + playCount);
			playCount++;
		} while (playCount < maxPlays);
	}
	
	public static void whileStatement() {
		
		int parkingLotCapacity = 500;
		int parkedCars = 450;
		boolean notFull = true;
		
		while (notFull) {
			parkedCars++;
			System.out.println(parkedCars);
			
			if (parkedCars >= parkingLotCapacity) {
				notFull = false;
			}
		}
		System.out.println("Ended loop");
	}
}
