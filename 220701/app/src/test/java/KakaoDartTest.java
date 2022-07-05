import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class KakaoDartTest {
  @Test
  void firstShot() {
    KakaoDart kakaoDart = new KakaoDart();
    String dartResult1 = "1S2D*3T";
    String dartResult2 = "1D#2S*3S";
    String dartResult3 = "10D#2S*3S";

    assertEquals("1S",kakaoDart.compute1(dartResult1));
    assertEquals("1D#",kakaoDart.compute1(dartResult2));
    assertEquals("10D#",kakaoDart.compute1(dartResult3));
  }
  @Test
  void secondShot() {
    KakaoDart kakaoDart = new KakaoDart();
    String dartResult1 = "1S2D*3T";
    String dartResult2 = "1D#2S*3S";
    String dartResult3 = "1S*2T*3S";

    String firstShot1 = "1S";
    String firstShot2 = "1D#";
    String firstShot3 = "1S*";


    assertEquals("2D*",kakaoDart.compute2(dartResult1,firstShot1));
    assertEquals("2S*",kakaoDart.compute2(dartResult2,firstShot2));
    assertEquals("2T*",kakaoDart.compute2(dartResult3,firstShot3));
  }

  @Test
  void thirdShot() {
    KakaoDart kakaoDart = new KakaoDart();
    String dartResult1 = "1S2D*3T";
    String dartResult2 = "1D#2S*3S";
    String dartResult3 = "1S*2T*3S";

    String firstShot1 = "1S";
    String firstShot2 = "1D#";
    String firstShot3 = "1S*";

    String secondShot1 = "2D*";
    String secondShot2 = "2S*";
    String secondShot3 = "2T*";




    assertEquals("3T",kakaoDart.compute3(dartResult1,secondShot1,firstShot1));
    assertEquals("3S",kakaoDart.compute3(dartResult2,secondShot2,firstShot2));
    assertEquals("3S",kakaoDart.compute3(dartResult3,secondShot3,firstShot3));
  }

  @Test
  void firstShotNumber() {
    KakaoDart kakaoDart = new KakaoDart();
    String dartResult1 = "1S2D*3T";
    String dartResult2 = "1D#2S*3S";
    String dartResult3 = "1S*2T*3S";



   // assertEquals(37,kakaoDart.computeToNumber("1S","2D*","3T"));
    assertEquals(9,kakaoDart.computeToNumber("1D","2S#","10S"));
    //assertEquals(2,kakaoDart.computeToNumber("1S*","2D*","3T"));


  }
}