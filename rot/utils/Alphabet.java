package rot.utils;
 
public class Alphabet {
	public static char[] ABC = generateABC();
	
	private static char[] generateABC() {
		char[] abc = new char[26];
		int start = 97;
		int end = 122;
		int charIndex = 0; 
		
		while (start <= end) {
			abc[charIndex] = (char)start;
			start++;
			charIndex++;
		}
		
		return abc;
	}
	
}