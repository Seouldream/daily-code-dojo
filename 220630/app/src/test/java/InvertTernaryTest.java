import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertTernaryTest {
  @Test
  void toTernary() {
    InvertTernary invertTernary = new InvertTernary();
    int n = 45;
    invertTernary.toTernary(n);

    assertEquals("0021",invertTernary.toTernary(n));
  }

  @Test
  void toTernaryToDecimal() {
    InvertTernary invertTernary = new InvertTernary();

    invertTernary.toDecimal(45);
    String y = "22111";

    assertEquals(229,invertTernary.toDecimal(45));
  }

}
