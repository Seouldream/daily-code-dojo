import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class RestZeroArrayTest {
  @Test
  void divide() {
    RestZeroArray restZeroArray = new RestZeroArray();

    assertArrayEquals(new int[]{5, 10}, restZeroArray.solution(new int[]{5, 9, 7, 10}, 5));
    assertArrayEquals(new int[]{1, 2, 3, 36}, restZeroArray.solution(new int[]{2, 36, 1, 3}, 1));
    assertArrayEquals(new int[]{-1}, restZeroArray.solution(new int[]{3, 2, 6}, 10));
  }

}
