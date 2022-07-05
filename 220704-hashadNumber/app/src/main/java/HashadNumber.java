//1. 자릿수의 합을 구한다. sumOfDigits
//자릿수의 합 어떻게 구할래 ?
// 1. 스트링 화 -> 스트링 길이 구해서 배열로 만들어서 구한다.
//
//2. x가 자릿수의 합으로 나누어떨어지는지 즉 나머지가 0인지 검사한다.
public class HashadNumber {


  public boolean solution(int x) {


    String stringTypeOfx = String.valueOf(x);
    int sumOfDigits = 0;
    for (int i = 0; i < stringTypeOfx.length(); i += 1) {

      sumOfDigits += Character.getNumericValue(stringTypeOfx.charAt(i));
    }

      boolean answer = x % sumOfDigits == 0;

    return answer;
    }
  }


