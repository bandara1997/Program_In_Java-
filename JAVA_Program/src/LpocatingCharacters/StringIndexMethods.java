package LpocatingCharacters;

public class StringIndexMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String letters = "abcdefghijklmabcdefghijklm";
		
		System.out.printf(
				"'c' is located at index %d%n", letters.indexOf('c') );
		System.out.printf(
				"'a' is located at index %d%n", letters.indexOf('a', 1) );
		System.out.printf(
				"'$' is located at index %d%n%n", letters.indexOf('$') );
		
		System.out.printf("Last 'c' is located at index %d%n",
				letters.lastIndexOf('c') );
		System.out.printf("Last 'a' is located at index %d%n",
				letters.lastIndexOf('a', 25) );
		System.out.printf("Last '$' is located at index %d%n%n",
				letters.lastIndexOf('$') );
				// test indexOf to locate a substring in a string
		System.out.printf("\"def\" is located at index %d%n",
				letters.indexOf("def") );
		System.out.printf("\"def\" is located at index %d%n",
				letters.indexOf("def", 7) );
		System.out.printf("\"hello\" is located at index %d%n%n",
				letters.indexOf("hello") );
				// test lastIndexOf to find a substring in a string
		System.out.printf("Last \"def\" is located at index %d%n",
				letters.lastIndexOf("def") );
		System.out.printf("Last \"def\" is located at index %d%n",
				letters.lastIndexOf("def", 25) );
		System.out.printf("Last \"hello\" is located at index %d%n",
				letters.lastIndexOf("hello") );
	}

}
