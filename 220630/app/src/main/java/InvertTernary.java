//1. 주어진 10진법을 3진법으로 바꾸기 (나눗셈과 목 이용해서) -> 완료
//2. 주어진 결과값(3진법으로 바꾼 수를 다시 뒤집는다) -> 완료
//3. -> 10진법으로
// 주어진 수의 자리 의 3의

public class InvertTernary {
  public String toTernary(int n) {
    int quotient = n;
    int remainder = quotient % 3;
    String result = "";

    while(quotient > 0) {
      result =  result + remainder;
      quotient /= 3;
      remainder = quotient % 3;
    }

      return result;
  }

  public int toDecimal(int x) {
    String y = "22111";
    // 0021 이있다고 가정
    // 3 * 3 * 3 * (0) + 3 * 3 * (0) + 3 * (2) + 1 * (1)

    // 22111
    // 3 * 3 * 3 * 3 * (2) + 3 * 3 * 3 * (2) + 3 * 3 * (1) + 3 * (1) + 1 * (1)

    //주어진수 x 가정
    //math.pow(3,자릿수-1)*(주어진수) + ... math.pow(3,0)
    // 차엣으로 읽은후 인트로 변환 1 번 //  해당 자릿수의 10의 해당자릿수-1의 거듭제곱으로 나눈 몫
    int i = 0;
    int z = 0;
    int result2 = 0;
    while (y.length() - 1 - i >= 0) {

      int middleresult =
          (int) (Math.pow(3, y.length() - 1 - i) * Character.getNumericValue(y.charAt(z)));
      i += 1;
      z += 1;

      result2 += middleresult;


    }
    return result2;
  }

}

