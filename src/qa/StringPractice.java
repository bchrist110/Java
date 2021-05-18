package qa;

public class StringPractice {
	public static void main(String[] args) {
//		String string1 = "yesterday it was raining ";
//		String string2 = "today it is sunny";
//		
//		String s = string1 + string2;
//		
//		String sUpper = s.toUpperCase();
//		System.out.println(sUpper.substring(25,31) + sUpper.substring(10,24));
//		System.out.println(sUpper.substring(0,1));
		
		finder("Hello this is a very long string", "Hel");
		
	}
	
	public static void wordCounter(String str) {
		int count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			String temp = str.substring(i,i + 1);
			if (temp.equals(" ")) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static void verticalStraightWords(String str) {
		int currSpace = 0;
		for (int i = 0; i < str.length(); i++) {
			String temp = str.substring(i,i + 1);
			if (temp.equals(" ")) {
				System.out.println(str.substring(currSpace,i+1));
				currSpace = i+1;
			}
		}
		
		System.out.println(str.substring(currSpace));
	}
	
	public static void verticalReverseWords(String str) {
		int currSpace = str.length();
		for (int i = str.length(); i > 0; i--) {
			String temp = str.substring(i-1,i);
			if (temp.equals(" ")) {
				System.out.println(str.substring(i,currSpace));
				currSpace = i;
			}
		}
		
		System.out.println(str.substring(0,currSpace));
	}
	
	public static void finder(String message, String finder) {
		
		int lengthOfFinder = finder.length();
		boolean status = false;
		for (int i = 0; i < message.length() - lengthOfFinder + 1; i++) {
			String temp = message.substring(i, i+lengthOfFinder);
			if (temp.equals(finder)) {
				status = true;
				break;
			}
		}
		
		System.out.println(status);
		
	}
}
