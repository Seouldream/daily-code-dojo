import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRectangularTest {
  @Test
  void maximumLegnth() {
    int[][] sizes = {{1,2},{3,7},{5,2}};
    int iMax = 0;
    for(int[] i : sizes) {
      for(int z : i) {
        iMax = Math.max(z, iMax);
      }
    }
    assertEquals(7,iMax);
  }
  @Test
  void minimum() {
    int[][] sizes = {{1,2},{3,7},{5,2}};
    int iMin = 0;
    List<Integer> minArray = new ArrayList<>();
    for(int[] cardSize : sizes) {
      minArray.add(Math.min(cardSize[0],cardSize[1]));
    }
    for(int i : minArray) {
      iMin = Math.max(i, iMin);
    }
    assertEquals(3,iMin);
  }

  @Test
  void testCases() {
    MinimumRectangular minimumRectangular = new MinimumRectangular();

    assertEquals(4000,minimumRectangular.solution(new int[][] {
        {60,50},{30,70},{60,30},{80,40}
    }));
    assertEquals(120,minimumRectangular.solution(new int[][] {
        {10,7},{12,3},{8,15},{14,7},{5,15}
    }));
    assertEquals(133,minimumRectangular.solution(new int[][] {
        {14,4},{19,6},{6,16},{18,7},{7,11}
    }));
  }



}