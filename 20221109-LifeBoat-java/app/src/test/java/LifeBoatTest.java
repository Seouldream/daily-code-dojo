import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LifeBoatTest {
  @Test
  void simple() {
    LifeBoat lifeBoat = new LifeBoat();

  //  assertEquals(3,lifeBoat.solution(new int[] {70,50,80,50},100));
    assertEquals(3,lifeBoat.solution(new int[] {70,80,50},100));
  }

}