import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ThreeJinbubTest {
  @Test
  void get3Jinbub() {
    ThreeJinbub threeJinbub = new ThreeJinbub();

    assertEquals("1200",threeJinbub.get3Jinbub(45));
    assertEquals("11122",threeJinbub.get3Jinbub(125));
  }

  @Test
  void getArray() {
    ThreeJinbub threeJinbub = new ThreeJinbub();

    assertEquals("1",threeJinbub.getStringArray("1200")[0]);
    assertEquals("2",threeJinbub.getStringArray("1200")[1]);
    assertEquals("0",threeJinbub.getStringArray("1200")[2]);
    assertEquals("0",threeJinbub.getStringArray("1200")[3]);
  }

  @Test
  void reverseArrayValue() {
    ThreeJinbub threeJinbub = new ThreeJinbub();

    assertEquals("0",threeJinbub.reverseArrayValue(45).get(0));
    assertEquals("0",threeJinbub.reverseArrayValue(45).get(1));
    assertEquals("2",threeJinbub.reverseArrayValue(45).get(2));
    assertEquals("1",threeJinbub.reverseArrayValue(45).get(3));
  }

  @Test
  void getNonZeroThreeJinbub() {
    ThreeJinbub threeJinbub = new ThreeJinbub();

    assertEquals("2",threeJinbub.getNonZeroThreeJinbub(45).get(0));
    assertEquals("2",threeJinbub.getNonZeroThreeJinbub(125).get(0));
  }

  @Test
  void transferToTenary() {
    ThreeJinbub threeJinbub = new ThreeJinbub();

    assertEquals(7,threeJinbub.transferToTenary(45));
  //  assertEquals("2",threeJinbub.getNonZeroThreeJinbub(125).get(0));
  }
}