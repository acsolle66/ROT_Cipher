package rot.cipher;
	/**
	  * Simple class which generates the english alphabet
	  * The alphabet in char[] is retrieved trough a static field named ABC 
	  * @author		Attila Csölle
	  * @version 	1.0
      * @since		09.29.2023
	 **/ 
class Alphabet {
	static char[] ABC = generateABC();
	
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