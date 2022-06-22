import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageSolutionTest {
  @Test
  void simpleCase1() {

  AverageSolution averageSolution = new AverageSolution();


  assertEquals(2.5,averageSolution.average(new int[] {1,2,3,4}));
  assertEquals(5,averageSolution.average(new int[] {5,5}));

  }

}