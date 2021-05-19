package com.qa.practice.javabeginner.arrays;

public class Arraysandstuff {
	
	public static void main(String[] args) {
//		doWhileStatement();
//		forStatements();
		arraysAndStuff();
	}
	
	
	public static void arraysAndStuff() {
		int[] myIntArr;
		
		myIntArr = new int[3];
		
		myIntArr[0] = 34;
		myIntArr[1] = 56;
		myIntArr[2] = 33;
		
		int[] myOtherIntArray = { 100, 25, 32, 46 };
		
		int someNum = myOtherIntArray[2];
		System.out.println(someNum);
		
		for (int i = 0; i < myOtherIntArray.length; i++) {
			int iTimesTwo = myOtherIntArray[i] * 2;
			System.out.println(iTimesTwo);
		}
		
		for (int i = myOtherIntArray.length - 1; i >= 0; i--) {
			System.out.println(myOtherIntArray[i]);
		}
		
		for (int num : myOtherIntArray) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		String[][] namesArrays = {
				{"Bob", "Fred"},
				{"Sarah", "Sally"}
		};
		
		String fred = namesArrays[0][1];
		System.out.println(fred);
		
		namesArrays[1][0] = "Jenny";
		System.out.println(namesArrays[1][0]);
	}
	
	public static void addDigits(int num1) {
		if (num1 < 10 || num1 > 99) {
			System.out.println("Number is not two digits");;
		} else {
			int firstDigit = num1 / 10;
			int lastDigit = num1 % 10;
			System.out.println(firstDigit + lastDigit);
		}
	}
	
	public static void StringOfNumber(int num1) {
		if (num1 < 0) {
			System.out.println("Number must be positive");
			
			if (num1 < 10) {
				if (num1 == 1) {
					System.out.println("one");
				}
				if (num1 == 2) {
					System.out.println("two");
				}
				if (num1 == 3) {
					System.out.println("three");
				}
				if (num1 == 4) {
					System.out.println("four");
				}
				if (num1 == 5) {
					System.out.println("five");
				}
				if (num1 == 6) {
					System.out.println("six");
				}
				if (num1 == 7) {
					System.out.println("seven");
				}
				if (num1 == 8) {
					System.out.println("eight");
				}
				if (num1 == 9) {
					System.out.println("one");
				}
				if (num1 == 10) {
					System.out.println("nine");
				}
			}
		}
		
	}
	
	public static void flowChart1() {
		int a = 100;
		
		while (a < 200) {
			System.out.println("A");
			a++;
		}
		System.out.println("Finished");
	}
	
	public static void flowChart2() {
		int a = 100;
		while (a < 200) {
			if (a % 2 == 0) {
				System.out.println("-");
				a++;
			} else {
				System.out.println("*");
				a++;
			}
		}
		System.out.println("Done");
	}
	
	public static void printNumbers() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(j);
			}
		}
	}
	
	public static void printExponential() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
	}
	
	public static void change(double cost, double payment) {
		System.out.println(payment - cost);
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
