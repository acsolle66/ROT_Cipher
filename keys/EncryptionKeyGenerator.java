package keys;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class EncryptionKeyGenerator extends CipherKeyGenerator {

  @Override
  public Map<Character, Character> generateCipherKey(int shift, Character[] charSet) {
    return Arrays.stream(charSet)
        .collect(toMap(a -> a, a -> (char) ((((a - 97) + shift) % charSet.length) + 97)));
  }
}
