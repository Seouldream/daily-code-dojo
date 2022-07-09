import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SecretMapTest {
  private String temporary = "";
 /* @Test
  void getBinaryNumber() {
    int number = 20;
    int quotient = number;
    int remainder = quotient % 2;

    String result = "";

    while (quotient != 0) {
      remainder = quotient % 2;
      quotient = quotient / 2;

      result = remainder + result;


    }

    assertEquals("10100", result);
  }*/

  @Test
  void getMapArray() {
    int[] arr1 = {9, 20, 28, 18, 11};
    String[] map1Array = new String[5];

    for (int i = 0; i < 5; i += 1) {

      int quotient = arr1[i];
      int remainder = quotient % 2;

      String result = "";

      while (quotient != 0) {
        remainder = quotient % 2;
        quotient = quotient / 2;

        result = remainder + result;

        map1Array[i] = result;
      }
    }
    assertEquals(map1Array, "");
  }

  @Test
  void fillBlanks() {
    String[] map1Array = new String[5];
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};

    map1Array = new String[]{"1001", "10100", "11100", "10010", "1011"};
    String[] map2Array = {"11110", "1", "10101", "10001", "11100"};
    for (int i = 0; i < 5; i += 1) {
      while (map1Array[i].length() < 5) {
        map1Array[i] = "0" + map1Array[i];
      }
    }

    for (int i = 0; i < 5; i += 1) {
      while (map2Array[i].length() < 5) {
        map2Array[i] = "0" + map2Array[i];
      }
    }

// -> 현재 구한 값비교해서 공통 맵 만드는중
    String[] mapRealArray = new String[]{"00000", "00000", "00000", "00000", "00000"};
    for (int i = 0; i < 5; i += 1) {

      for (int z = 0; z < 5; z += 1) {

        String row1StringCharacter = Character.toString(map1Array[i].charAt(z));
        String row2StringCharacter = Character.toString(map2Array[i].charAt(z));

        // 서로가 같고 어느하나가 0이다 -> 공백 지도
        String temp = "";
        if (row1StringCharacter.equals(row2StringCharacter)
            && row1StringCharacter.equals("0")) {
          temp = "0";
        }
        //
        if (row1StringCharacter.equals("1")
            || row2StringCharacter.equals("1")) {
          temp = "1";
        }

        temporary += temp;

      }
      mapRealArray[i] = temporary;
      temporary = "";

//   1번 지도  [01001, 10100, 11100, 10010, 01011]
//   2번 지도  [11110, 00001, 10101, 10001, 11100]
//   real map[11111, 10101, 11101, 10011, 11111]
    }
    assertArrayEquals(new String[]{"11111", "10101", "11101", "10011", "11111"}, mapRealArray);
  }


  @Test
  void last() {
  String[] map1Array = new String[5];
  int[] arr1 = {9, 20, 28, 18, 11};
  int[] arr2 = {30, 1, 21, 17, 28};

  map1Array = new String[]{"1001", "10100", "11100", "10010", "1011"};
  String[] map2Array = {"11110", "1", "10101", "10001", "11100"};
    for (int i = 0; i < 5; i += 1) {
    while (map1Array[i].length() < 5) {
      map1Array[i] = "0" + map1Array[i];
    }
  }

    for (int i = 0; i < 5; i += 1) {
    while (map2Array[i].length() < 5) {
      map2Array[i] = "0" + map2Array[i];
    }
  }

  // -> 현재 구한 값비교해서 공통 맵 만드는중
  String[] mapRealArray = new String[5];
    for (int i = 0; i < 5; i += 1) {

    for (int z = 0; z < 5; z += 1) {

      String row1StringCharacter = Character.toString(map1Array[i].charAt(z));
      String row2StringCharacter = Character.toString(map2Array[i].charAt(z));

      // 서로가 같고 어느하나가 0이다 -> 공백 지도
      String temp = "";
      if (row1StringCharacter.equals(row2StringCharacter)
          && row1StringCharacter.equals("0")) {
        temp = "0";
      }
      //
      if (row1StringCharacter.equals("1")
          || row2StringCharacter.equals("1")) {
        temp = "1";
      }

      temporary += temp;

    }
    mapRealArray[i] = temporary;
    temporary = "";

//   1번 지도  [01001, 10100, 11100, 10010, 01011]
//   2번 지도  [11110, 00001, 10101, 10001, 11100]
//   real map[11111, 10101, 11101, 10011, 11111]
  }

  for(int i = 0; i < 5; i += 1) {
    mapRealArray[i] = mapRealArray[i].replace("0"," ");
    mapRealArray[i] = mapRealArray[i].replace("1","#");
  }

  assertArrayEquals(new String[]{"#####", "# # #", "### #", "#  ##", "#####"}, mapRealArray);
}

@Test
  void All() {
   String temporary = "";

     int n = 5;
      int[] arr1 = new int[] {9,20,28,18,11};
      int[] arr2 = new int[] {30,1,21,17,28};
      String[] answer = {};

      String[] map1Array = new String[n];
      for (int i = 0; i < n; i += 1) {

        int quotient = arr1[i];
        int remainder = quotient % 2;

        String result = "";

        while (quotient != 0) {
          remainder = quotient % 2;
          quotient = quotient / 2;

          result = remainder + result;

          map1Array[i] = result;
        }
      }
      String[] map2Array = new String[n];

      for (int i = 0; i < n; i += 1) {

        int quotient = arr2[i];
        int remainder = quotient % 2;

        String result = "";

        while (quotient != 0) {
          remainder = quotient % 2;
          quotient = quotient / 2;

          result = remainder + result;

          map2Array[i] = result;
        }
      }


      for (int i = 0; i < n; i += 1) {
        while (map1Array[i].length() < n) {
          map1Array[i] = "0" + map1Array[i];
        }
      }

      for (int i = 0; i < n; i += 1) {
        while (map2Array[i].length() < n) {
          map2Array[i] = "0" + map2Array[i];
        }
      }


      String[] mapRealArray = new String[n];
      for (int i = 0; i < n; i += 1) {

        for (int z = 0; z < n; z += 1) {

          String row1StringCharacter = Character.toString(map1Array[i].charAt(z));
          String row2StringCharacter = Character.toString(map2Array[i].charAt(z));

          // 서로가 같고 어느하나가 0이다 -> 공백 지도
          String temp = "";
          if (row1StringCharacter.equals(row2StringCharacter)
              && row1StringCharacter.equals("0")) {
            temp = "0";
          }
          //
          if (row1StringCharacter.equals("1")
              || row2StringCharacter.equals("1")) {
            temp = "1";
          }

          temporary += temp;

        }
        mapRealArray[i] = temporary;
        temporary = "";

//   1번 지도  [01001, 10100, 11100, 10010, 01011]
//   2번 지도  [11110, 00001, 10101, 10001, 11100]
//   real map[11111, 10101, 11101, 10011, 11111]
      }
      for(int i = 0; i < n; i += 1) {
        mapRealArray[i] = mapRealArray[i].replace("0"," ");
        mapRealArray[i] = mapRealArray[i].replace("1","#");
      }
      answer = mapRealArray;
      assertEquals("",answer);

  }
}







