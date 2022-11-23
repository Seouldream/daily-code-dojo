import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {
  @Test
  void hasMaxH() {
    HIndex hIndex = new HIndex();

    assertTrue(hIndex.hasMaxH(new int[]{3, 0, 6, 1, 5}, 1));
    assertTrue(hIndex.hasMaxH(new int[]{3, 0, 6, 1, 5}, 2));
    assertFalse(hIndex.hasMaxH(new int[]{3, 0, 6, 1, 5}, 3));
  }

  @Test
  void getH() {
    HIndex hIndex = new HIndex();

    assertEquals(hIndex.solution(new int[]{3, 0, 6, 1, 5}), 3);
    assertEquals(hIndex.solution(new int[] {10,10}),2);
    assertEquals(hIndex.solution(new int[] {3,3,4,4,4,3}),3);
    assertEquals(hIndex.solution(new int[] {4,4,4,4,4,5}),4);
    assertEquals(hIndex.solution(new int[] {4,4,4,4,4,4}),4);

  }

  @Test
  void hasEnoughCount() {
    HIndex hIndex = new HIndex();

    assertTrue(hIndex.hasEnoughHCount(new int[]{3, 3, 4, 4, 4, 3}, 3));
    assertFalse(hIndex.hasEnoughHCount(new int[]{3, 3, 4, 4, 4, 3}, 4));
    assertTrue(hIndex.hasEnoughHCount(new int[]{4, 4, 4, 4, 4, 5}, 4));
    assertTrue(hIndex.hasEnoughHCount(new int[]{4, 4, 4, 4, 4, 4}, 4));
  }

  @Test
  void simple() {
    HIndex hIndex = new HIndex();


  }
}