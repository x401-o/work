import java.util.Arrays;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
		
		System.out.println("New semester started...");
		System.out.println(main("CS2334"));
		
	}

	static double divide(double a, double b) {
		
		return a/b;
	}
	
	static int divide(int a, int b) {
		
		return a/b;
	}
	
	static boolean isDivisibleBy7(int a) {
		int b = a % 7;
		if (b == 0) {
			return true;
		}
		return false;
	}
	
	public static String main(String arg) {
		return "Overloaded main method was passed \"" + arg + "\".";
	}
	
	static int findMin(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		}
		if (b <= a && b <= c) {
			return b;
		}
		if (c <= a && c <= b) {
			return c;
		}
		return -1;
	}
	
	static int findMin(int[] array) {
		
		int min = array[0];
		for(int index = 1; index < array.length; ++index) {
			if (array[index] < min) {
				min = array[index];
			}
		}
		return min;
	}
	
	static double average(int[] array) {
		
		int total = 0;
		for (int index = 0; index < array.length; ++index) {
			total += array[index];
		}
		return ((double)total )/ array.length;
	}
	
	static String[] toLowerCase(String[] array) {
		
		for (int index = 0; index < array.length; ++index) {
			array[index] = array[index].toLowerCase();
		}
		return array;
	}
	
	static String[] toLowerCaseCopy(String[] array) {
		
		String[] copy = new String[array.length];
		for(int index = 0; index < array.length; ++index) {
			copy[index] = array[index].toLowerCase();
		}
		
		return copy;
	}
	
	static int[] removeDuplicates(int[] array) {
		
		for (int index = 0; index < array.length-1; ++index) {
			if (array[index] != 0) {
				int temp = array[index];
				for (int j = index + 1; j < array.length; ++j) {
					if (temp == array[j]) {
						array[index] = 0;
						array[j] = 0;
					} //end of inner if
				} //end of inner loop
			} //end of outer if
		} //end of outer loop
		
		return array;
	}
	
}
