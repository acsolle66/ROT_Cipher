package rot;

import java.util.LinkedList;
import rot.utils.Alphabet;

public class Cylinder {
	private LinkedList<Character> cylinderChars = new LinkedList<>();
	
	public Cylinder() {
		this(0);
	}
	
	public Cylinder(int rot) {
		shiftCylinder(rot);
	}
	
	private void shiftCylinder(int rot) {
		char[] abc = Alphabet.ABC;
		int start = 0;
		int end = abc.length;
		
		// Initializing the base list with unshifted letters
		while (start < end) {
			cylinderChars.add(abc[start]);
			start++;
		}
		
		// Shifting the position of lettres according to the defined ROT
		for (int i = 0; i < rot; i++) {
			cylinderChars.add(cylinderChars.remove());
		}
		
	}
	
	public LinkedList<Character> readCylinder() {
		return this.cylinderChars;
	}
	
}