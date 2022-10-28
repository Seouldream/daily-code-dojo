//이해
// 자연수 n이 주어짐
// 구하고자 하는 숫자 x 가 있다고 가정
// x > n
// n의 이진수 의 1의 갯수 = x의 이진수의 1의 갯수
// 이 조건을 만족하는 x 중 가장 작은 수여야함
// 계획
// n 을 이진수로 변환한다.
// 위 조건의 식을 만든다. true false
// while 문을 돌려 x == -1 이 아닐때까지 돌린다.
public class NextLargeNumber {
  public int solution(int n) {
    String binaryStringOfN = Integer.toBinaryString(n);
    int nextNumber = n + 1;

    while (true) {
      System.out.println("nextNum: " + nextNumber);
      String binaryStringOfNextNumber = Integer.toBinaryString(nextNumber);
      if (hasSameCountOfOne(binaryStringOfN, binaryStringOfNextNumber)) {
        return nextNumber;
      }
      nextNumber += 1;
    }

    //int answer = nextNumber;
    //return answer;
  }

  public boolean hasSameCountOfOne(String binaryStringOfN, String binaryStringOfNextNumber) {
    int countOfNOne = 0;
    for (int i = 0; i < binaryStringOfN.length(); i += 1) {
      if (binaryStringOfN.charAt(i) == '1') {
        countOfNOne += 1;
      }
    }

    int countOfNextNumberOne = 0;
    for (int i = 0; i < binaryStringOfNextNumber.length(); i += 1) {
      if (binaryStringOfNextNumber.charAt(i) == '1') {
        countOfNextNumberOne += 1;
      }
    }

    if (countOfNOne == countOfNextNumberOne) {
      return true;
    }
    return false;
  }
}
