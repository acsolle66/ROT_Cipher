package rot.cipher;

import java.util.LinkedList;

class Cylinder {
  private LinkedList<Character> cylinderCharset = new LinkedList<>();

  Cylinder() {
    addCharactersToCylinderCharset();
  }

  Cylinder(int rot) {
    addCharactersToCylinderCharset();
    shiftPositionOfCharacters(rot);
  }

  private void addCharactersToCylinderCharset() {
    EnglishAlphabetGenerator enABCGenerator = new EnglishAlphabetGenerator();
    char[] enABC = enABCGenerator.getABC();
    int index = 0;
    int abcLength = enABC.length;
    while (index < abcLength) {
      cylinderCharset.add(enABC[index]);
      index++;
    }
  }

  private void shiftPositionOfCharacters(int rot) {
    for (int i = 0; i < rot; i++) {
      cylinderCharset.add(cylinderCharset.remove());
    }
  }

  LinkedList<Character> readCylinderCharset() {
    return this.cylinderCharset;
  }
}
