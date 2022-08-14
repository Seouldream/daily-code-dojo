import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SecretMapTest {
  @Test
  void getBinary() {
    int n = 5;
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};
    int quotient = 9;

    String binaryNumber = getBinaryNumber(quotient);

    assertEquals("01001", getBinaryNumber(9));
    assertEquals("10100", getBinaryNumber(20));
    assertEquals("11100", getBinaryNumber(28));
    assertEquals("10010", getBinaryNumber(18));
    assertEquals("01011", getBinaryNumber(11));
  }

  public String getBinaryNumber(int quotient) {
    String binaryNumber = "";
    while (quotient > 0) {
      int remainder = quotient % 2;
      binaryNumber = remainder + binaryNumber;
      quotient /= 2;
    }

    while (binaryNumber.length() < 5) {
      binaryNumber = "0" + binaryNumber;
    }
    return binaryNumber;
  }

  @Test
  void getRealMapAsBinary() {
    int n = 5;
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};
    int quotient = 9;

    String[] map1 = new String[arr1.length];
    getRealMap(arr1, map1);

    String[] map2 = new String[arr2.length];
    getRealMap(arr2, map2);

    assertArrayEquals(map1, new String[]{"01001", "10100", "11100", "10010", "01011"});
    assertArrayEquals(map1, new String[]{"11110", "00001", "10101", "10001", "11100"});

    for(String content : map2) {
      System.out.println("확인용: " +   content);
    }


  }

  private void getRealMap(int[] array, String[] map) {
    int z = 0;
    for (int i : array) {
      map[z] = getBinaryNumber(i);
      z++;
    }
  }

  @Test
  void Map() {
    //"01001"    "11001" -> "11001"
    String[] map1 = new String[]{"01001", "10100", "11100", "10010", "01011"};
    String[] map2 = new String[]{"11110", "00001", "10101", "10001", "11100"};
    String[] map3 = new String[map1.length];

    String content = "";
    for (int j = 0; j < map1.length; j += 1) {
      content = "";
      for (int i = 0; i < map1[j].length() ; i += 1) {
        if (map1[j].charAt(i) == map2[j].charAt(i) && map1[j].charAt(i) == '0') {
          content += "0";
          continue;
        }
        content += "1";
      }
      map3[j] = content;
    }

    for(String row : map3) {
      System.out.println("각 줄 번호 :" + row);
    }

    assertEquals("11111", content);
    assertArrayEquals(map3,new String[] {"11111","10101","11101","10011","11111"});

    String[] newMap = (String[]) Arrays.stream(map3)
        .map(s -> s.replace('1','#') )
            .map(s -> s.replace('0', ' '))
        .toArray(String[]::new);


    for(String row : newMap) {
      System.out.println("지도 모양: " + row);
    }
  }

  @Test
  void resultTests() {
    SecretMap secretMap = new SecretMap();

    assertArrayEquals(new String[] {"#####","# # #", "### #", "#  ##", "#####"},
        secretMap.solution(5, new int[] {9, 20, 28, 18, 11},new int[] {30, 1, 21, 17, 28}));

  //  assertArrayEquals(new String[] {"######", "### #", "## ##", " #### ", " #####", "### # "}
    //    ,secretMap.solution(6,new int[] {46, 33, 33 ,22, 31, 50},new int[] {27 ,56, 19, 14, 14, 10}));

  }

}
