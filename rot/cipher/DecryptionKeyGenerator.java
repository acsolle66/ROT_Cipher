package rot.cipher;

public class DecryptionKeyGenerator extends CipherKeyGenerator{
    @Override
    public void generateKeyMap(int shift) {
        EnglishAlphabetGenerator ABCGenerator = new EnglishAlphabetGenerator();
        char[] charSet = ABCGenerator.getABC();
        int charSetLength = charSet.length;
        int adjustedShift = super.adjustShiftToCharsetLength(shift, charSetLength);
        int keyIndex = 0;
        int valueIndex = adjustedShift;
        while (keyIndex < charSetLength) {
            if (valueIndex == charSetLength) {
                valueIndex = 0;
            }
            this.CipherKeyMap.put(charSet[valueIndex], charSet[keyIndex]);
            keyIndex++;
            valueIndex++;
            }
    }
}
