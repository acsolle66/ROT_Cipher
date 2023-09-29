package rot.cipher;
import java.util.LinkedList;

    /**
	  * Class for representing the cylinder object with the shifted character set  
	  * @author		Attila Csölle
	  * @version 	1.0
      * @since		09.29.2023
	 **/
class Cylinder {
	private LinkedList<Character> cylinderChars = new LinkedList<>();
	
	Cylinder() {
		this(0);
	}
	
	Cylinder(int rot) {
		shiftCylinder(rot);
	}
	
	/**
	  * Private method used by the constructor of the class
	  * for creating the character set of the cylinder
	  * @param rot Integer value of the character shift
	  * @return void Add characters to the instantiated cylinderChars field
	 **/
	private void shiftCylinder(int rot) {
		char[] abc = Alphabet.ABC;
		int start = 0;
		int end = abc.length;
		
		// Adding the characters of the alphabet to the cylinderChars field
		while (start < end) {
			cylinderChars.add(abc[start]);
			start++;
		}
		
		// Shifting the position of characters according to the defined rot
		for (int i = 0; i < rot; i++) {
			cylinderChars.add(cylinderChars.remove());
		}
		
	}
	
	LinkedList<Character> readCylinder() {
		return this.cylinderChars;
	}
}