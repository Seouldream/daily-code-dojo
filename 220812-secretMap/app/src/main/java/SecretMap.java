import java.util.*;

public class SecretMap {
  public String[] solution(int n, int[] arr1, int[] arr2) {

    String[] map1 = new String[arr1.length];
    getRealMap(arr1, map1,n);

    String[] map2 = new String[arr2.length];
    getRealMap(arr2, map2,n);

    String[] map3 = new String[arr1.length];

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

    String[] newMap = (String[]) Arrays.stream(map3)
        .map(s -> s.replace('1','#') )
        .map(s -> s.replace('0', ' '))
        .toArray(String[]::new);

    String[] answer = newMap;
    return answer;
  }

  private void getRealMap(int[] array, String[] map,int n) {
    int z = 0;
    for (int i : array) {
      map[z] = getBinaryNumber(i,n);
      z++;
    }
  }

  private String getBinaryNumber(int quotient,int n) {
    String binaryNumber = "";
    while (quotient > 0) {
      int remainder = quotient % 2;
      binaryNumber = remainder + binaryNumber;
      quotient /= 2;
    }

    while (binaryNumber.length() < n) {
      binaryNumber = "0" + binaryNumber;
    }
    return binaryNumber;
  }
}
