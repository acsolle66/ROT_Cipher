package rot.cipher;
import java.lang.StringBuilder;
import java.util.LinkedList;

     /**
	  * Class for representing the cylinder object with the shifted character set  
	  * @author		Attila Csölle
	  * @version 	1.0
      * @since		09.29.2023
	 **/
public class Cipher {
	private Cylinder baseCylinder;
	private LinkedList<Character> baseChars;
	private Cylinder shiftedCylinder;
	private LinkedList<Character> shiftedChars;
	
	/**
	  * Constructor of the Cipher class
	  * Instantiates the cipher object with two cylinders,
	  * one Cylinder with unshifted character set,
	  * and one with shifted character set.
	  * If the mode is set to encryption the base charset is unshifted, so the cipherText method translates the text forward 
	  * If the mode is set to decryption the base charset is shifted, so the cipherText method translates the text backward 
	  * @param rot Integer value of the character shift
	  * @param mode String value of the cipher mode, encrypt or decrypt
	 **/
	public Cipher(int rot, String mode) {
		if (mode.equals("e")) {
			baseCylinder = new Cylinder();
			baseChars = baseCylinder.readCylinder();
			shiftedCylinder = new Cylinder(rot);
			shiftedChars = shiftedCylinder.readCylinder();	
		} else {
			baseCylinder = new Cylinder(rot);
			baseChars = baseCylinder.readCylinder();
			shiftedCylinder = new Cylinder();
			shiftedChars = shiftedCylinder.readCylinder();	
		}
	}
	
    /**
	  * Method for encrypt/decrypt the text
	  * Depending on the instantiated object the method translates forward or backward the text
	  * @param text Text to cipher
	  * @return Returns the ciphered text
	 **/
	public String cipherText(String text) {
		
		char[] letters = text.toLowerCase().toCharArray();
		int index = 0;
		int end = letters.length;
		StringBuilder shiftedText = new StringBuilder();
		
		while (index < end) {
			int baseCharIndex = baseChars.indexOf(letters[index]);
			char shiftedChar;
			if (baseCharIndex >= 0) {
				shiftedChar = shiftedChars.get(baseCharIndex);
				shiftedText.append(shiftedChar);
			}	
			index ++;
		}
		return shiftedText.toString();
	}		
}