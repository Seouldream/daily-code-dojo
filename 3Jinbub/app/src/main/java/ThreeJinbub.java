import java.util.*;

//3진법 먼저 구하기
//자이제 뒤집기 구한 스트링 배열로 -> 역순으로 reverse
//10진법으로 바꿀껀데 앞자리가 0이면 버린 수로
//이제 나온 값을 인트로 그리고 다시 10진법으로
public class ThreeJinbub {
  public int solution(int n) {
    int answer = 0;

    get3Jinbub(n);

    getStringArray(get3Jinbub(n));

    reverseArrayValue(n);

    getNonZeroThreeJinbub(n);

    transferToTenary(n);


    return answer;
  }

  public int transferToTenary(int n) {
    String nonZeroNumber = "";
    for (String string : getNonZeroThreeJinbub(n)) {
      nonZeroNumber += string;
    }

    int result = 0;
    for (int i = 0; i < nonZeroNumber.length(); i += 1) {
      int digit = Integer.valueOf(getNonZeroThreeJinbub(n).get(i));
      result += digit * Math.pow(3, i);
    }
  return result;}

  public List<String> getNonZeroThreeJinbub(int n) {
    List<String> nonZeroThreeJinbub = new ArrayList<>(reverseArrayValue(n));

    int length = nonZeroThreeJinbub.size();

   for(int i = 0; i < length; i += 1 ) {
      if( nonZeroThreeJinbub.get(0).equals("0")) {
        nonZeroThreeJinbub.remove(0);
      }
    }
   return nonZeroThreeJinbub;}

  public String get3Jinbub(int n) {

    int remainder = n % 3;
    String result = "";
    int quotient = n;
    while(quotient > 0) {
      remainder = quotient % 3;
      result = remainder + result;
      quotient /= 3;
    }
   return result;}

  public String[] getStringArray(String intResult) {
    String[] stringTypeDigit = intResult.split("");


  return stringTypeDigit;}

  public List<String> reverseArrayValue(int n) {
    List<String> reverseArrayValue = Arrays.asList(getStringArray(get3Jinbub(n)));
    Collections.reverse(reverseArrayValue);
    return reverseArrayValue;
  }
}

