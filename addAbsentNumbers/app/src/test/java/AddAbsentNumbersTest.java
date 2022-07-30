import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AddAbsentNumbersTest {
  @Test
  void solution1() {
    AddAbsentNumbers addAbsentNumbers = new AddAbsentNumbers();
    assertEquals(14,addAbsentNumbers.solution1(new int[] {1,2,3,4,6,7,8,0}));
    assertEquals(6,addAbsentNumbers.solution1(new int[] {5,8,4,0,6,7,9}));
  }

  @Test
  void solution2() {
    AddAbsentNumbers addAbsentNumbers = new AddAbsentNumbers();
    assertEquals(14,addAbsentNumbers.solution1(new int[] {1,2,3,4,6,7,8,0}));
    assertEquals(6,addAbsentNumbers.solution1(new int[] {5,8,4,0,6,7,9}));
  }




}