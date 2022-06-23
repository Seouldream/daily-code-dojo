public class TotalDigitNumberSum {
  public int solution(int n) {
    int answer = 0;
    //일단 주어진 수를 각각 쪼개자
    //1. 스플릿
    String[] digitNumber = String.valueOf(n).split(""); //각각 쪼갠 자리수
    //스트링 0 스트링 1 스트링 2 .. 스트링 n의 길이-1 까지 String[

    //문자열길이로 구하기
    String lengthOfn = String.valueOf(n);    // 자릿수 길이 lengthOfn.length() ;

    //자 이제 더하자!
    //스트링[0] + ... 스트링[lengthOfn -1] 까지 더하면 되는데  스트링은 말그대로 문자열임
    //Todo 변환한 자릿수 문자를 숫자 타입으로 치환해줘야함
    //int eachDigitNumber = Integer.parseInt(digitNumber[i]);
    // -> 인티저파스인트메서드로 스트링변환됨을 확인

    //i 값에 변함에 따라 나오는 다른 결과값을 뽑고 그것을 유실되지 않게 앤서라는 저장소에 저장해줌
    // + 동시에 이전 값을 더해줌
    for(int i = 0; i < lengthOfn.length(); i += 1) {
      int eachDigitNumber = Integer.parseInt(digitNumber[i]);
      answer += eachDigitNumber;
    }

    //요 [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    System.out.println("Hello Java");

    return answer;
  }
}
}
