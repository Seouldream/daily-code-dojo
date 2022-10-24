import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BinaryScaleTest {
  @Test
  void countRemovedZero() {
    BinaryScale binaryScale = new BinaryScale();

    assertArrayEquals(new int[] {6,6},binaryScale.countRemovedZero("110010101001"));
    assertArrayEquals(new int[] {1,2},binaryScale.countRemovedZero("110"));
    assertArrayEquals(new int[] {1,1},binaryScale.countRemovedZero("10"));
  }

  @Test
  void answer() {
    BinaryScale binaryScale = new BinaryScale();

    assertArrayEquals(new int[] {3,8},binaryScale.solution("110010101001"));
    assertArrayEquals(new int[] {3,3},binaryScale.solution("01110"));
    assertArrayEquals(new int[] {4,1},binaryScale.solution("1111111"));
  }
}
