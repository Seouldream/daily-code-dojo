import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SumMatrixTest {
  @Test
  void pickComponents() {

    int[][] array1 = {{1, 2}, {2, 3}};
    int[][] array2 = {{1}, {2}};

    assertEquals(1, array1[0][0]);
    assertEquals(2, array1[0][1]);
    assertEquals(2, array1[1][0]);
    assertEquals(3, array1[1][1]);

    assertEquals(1, array2[0][0]);
    assertEquals(2, array2[1][0]);
    assertEquals(2, array1[0].length);
    assertEquals(2, array1.length);
    assertEquals(2, new int[2][2]);
  }

  @Test
  void computeArrays() {
    SumMatrix sumMatrix = new SumMatrix();
    assertArrayEquals((new int[][]{{4, 6}, {7, 9}}),
        sumMatrix.compute
            (new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}));
  }
}