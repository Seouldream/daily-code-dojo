import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {
  private CaesarCipher caesarCipher = new CaesarCipher();
  @BeforeEach
  void declaration() {
    //CaesarCipher caesarCipher = new CaesarCipher();

  }
  @Test
  void getAlphabet() {
    assertEquals("BC",caesarCipher.getAlphabet("AB", 1, ""));
    assertEquals("a",caesarCipher.getAlphabet("z", 1, ""));
    assertEquals("eFd",caesarCipher.getAlphabet("aBz", 4, ""));
    assertEquals("e F d",caesarCipher.getAlphabet("a B z", 4, ""));
    assertEquals("e F  d",caesarCipher.getAlphabet("a B  z", 4, ""));
    
}

}