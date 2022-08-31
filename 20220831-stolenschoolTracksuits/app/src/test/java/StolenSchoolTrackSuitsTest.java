import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StolenSchoolTrackSuitsTest {
@Test
  void simplePass() {
  StolenSchoolTrackSuits stolenSchoolTrackSuits = new StolenSchoolTrackSuits();

  assertEquals(5,stolenSchoolTrackSuits.solution(5,new int[] {2, 4},new int[] {1, 3, 5}));
  assertEquals(4,stolenSchoolTrackSuits.solution(5,new int[] {2, 4},new int[] {3}));
  assertEquals(2,stolenSchoolTrackSuits.solution(3,new int[] {3},new int[] {1}));
}
}//5	[2, 4]	[3]	 -> 4
//3	[3]	[1]	 -> 2