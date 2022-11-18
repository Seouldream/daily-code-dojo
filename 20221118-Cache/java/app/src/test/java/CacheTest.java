import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CacheTest {
  @Test
  void answer() {
    Cache cache = new Cache();

   assertEquals(50,cache.solution(3,
       new String[] {
           "Jeju", "Pangyo", "Seoul", "NewYork", "LA",
           "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    assertEquals(52,cache.solution(5,
        new String[] {
            "Jeju", "Pangyo", "Seoul", "NewYork", "LA","SanFrancisco",
            "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));


  }

  @Test
  void edgeCase() {
    Cache cache = new Cache();
    assertEquals(16,cache.solution(2,
        new String[] {
            "Jeju", "Pangyo", "NewYork", "newyork"}));
  }
}
