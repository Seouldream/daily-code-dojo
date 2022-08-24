import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// 1번 수포자 1 2, 3, 4, 5,    1, 2, 3, 4, 5
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,  2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,   3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
class SupozaTest {
  @Test
  void problem() {
    Supoza supoza = new Supoza();

    assertArrayEquals(new int[] {1},supoza.solution(new int[] {1,2,3,4,5}));
    assertArrayEquals(new int[] {1,2,3},supoza.solution(new int[] {1,3,2,4,2}));
  }
}
