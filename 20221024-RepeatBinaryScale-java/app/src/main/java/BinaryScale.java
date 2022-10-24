// 1. 0을 우선 제거한다. -> 제거된 0의 갯수를 센다, 제거한 스트링 값을 가져온다
// 2. 이진변환를 한다 -> count에 1을 올려준다.
//  10 -> 2 * 5 + 0  : 5 -> 2 * 2 + 1 :  2 -> 2 * 1 + 0 : 1 -> 2 * 0 + 1
//     0   1    0 1
// -> 1 0 1 0

public class BinaryScale {
  public int[] solution(String s) {
    int count = 0;
    int binaryCount = 0;
      while(s.length() > 1) {
        binaryCount += 1;
        int[] countAndBinary = countRemovedZero(s);
        count += countAndBinary[0];
        s = Integer.toBinaryString(countAndBinary[1]);
      }

    int[] answer = {binaryCount, count};
    return answer;
  }

  public int[] countRemovedZero(String s) {
    int count = 0;

    for(int i =0; i< s.length(); i +=1) {
      if(s.charAt(i) == '0') {

        count += 1;
      }
    }
    s = s.replace("0","");
    return new int[] {count,s.length()};
  }
}
