//1. 받은 문자열을 3개의 점수로 분류해주자 -> 어떻게?
// 세번째 문자열이 스타를 포함하는가? 그렇다 -> 그까지 읽어오고 문자 1번
//  원래 문자열에서 1번을 뺀 문자열의 세번째 문자열이 별과 아차를 포함하는가?
//  -> 모르겠고 일단 3개의 점수 다 분류 해 옴(다음부턴 경우를 펜으로 적자 헷갈린다.)
//2. 각 문자열당 기본공식 math.pow(주어진숫자,s,d,t)
//
public class KakaoDart {
  private String dartResult;
  private String firstShot;
  private String secondShot;
  private String thirdShot;


  public int solution(String dartResult) {
    compute1(dartResult); // -> firstShot 을 뱉음 -> 필드로감 -> 다시 필드화 firstShot을 compute2가 받음
    compute2(dartResult,firstShot); // 받아옴 필드화 퍼스트 샷을 가지고 세컨샷을 뱉음 -> 필드화와 같다가 있으므로 다시 필드로 뱉음 -> 컴퓨트3의 세컨으로
    compute3(dartResult,firstShot,secondShot); // 지역변수 서드 샷만 뱉음

    computeToNumber(firstShot,secondShot,thirdShot);



    int answer = 0;
    return answer;
  }

  public String compute1(String dartResult) {
    this.dartResult = dartResult;
    //1번 샷에 옵션 포함 할 때
    String firstShot = "no pass";
    String secondShot = "";
    String thirdShot = "";
    //10인데 옵션 잇는 경우


    if(dartResult.startsWith("10") && Character.toString(dartResult.charAt(3)).contains("*") ||
        Character.toString(dartResult.charAt(3)).contains("#")) {
      firstShot = dartResult.substring(0,4);
    }

    if(dartResult.startsWith("10") && !Character.toString(dartResult.charAt(3)).contains("*") &&
        !Character.toString(dartResult.charAt(3)).contains("#")) {
      firstShot = dartResult.substring(0,3);
    }


    if (!dartResult.startsWith("10") && Character.toString(dartResult.charAt(2)).contains("*") ||
        Character.toString(dartResult.charAt(2)).contains("#")) {
      firstShot = dartResult.substring(0, 3);
    }


      //1번 샷에 옵션 포함 안할때
       if(!dartResult.startsWith("10") && !Character.toString(dartResult.charAt(2)).contains("*") &&
           !Character.toString(dartResult.charAt(2)).contains("#")){
         firstShot = dartResult.substring(0,2);
       }

       return firstShot;

  }

  public String compute2(String dartResult,String firstShot) {
    this.dartResult = dartResult;
    this.firstShot = firstShot;

    //1번 샷에 옵션 포함 할 때

    String secondShot = "";

       //1번샷 옵션 미포함 일대 2번샷이 옵션도 포함
    if(firstShot.length() == 2 && dartResult.substring(2,5).contains("*")
        || dartResult.substring(2,5).contains("#") ) {
      secondShot = dartResult.substring(2,5);
    }



    //1번샷 옵션 미포함 일대 2번샷 옵션 없음
    if(firstShot.length() == 2 && !dartResult.substring(2,5).contains("*")
        && !dartResult.substring(2,5).contains("#")  ) {
      secondShot = dartResult.substring(2,4);
    }

    //1번샷 옵션 포함 2번샷 포함
    if(firstShot.length() == 3 && dartResult.substring(3,6).contains("*") ||
        dartResult.substring(3,6).contains("#") ) {
      secondShot = dartResult.substring(3,6);
    }
    //1번샷 옵션 포함 2번샷 미포함
     if(firstShot.length() == 3 && !dartResult.substring(3,6).contains("*") &&
        !dartResult.substring(3,6).contains("#") ) {
      secondShot = dartResult.substring(3,5);
    }
     // 퍼스트 샷 10 포함 옵션 없음 ,세컨드샷이 10이 아니고 옶션 없음  (10S2D3S)
    if(firstShot.startsWith("10") && !firstShot.endsWith("*") || !firstShot.endsWith("#")
        && !dartResult.substring(3,5).contains("10") && !dartResult.substring(3,6).contains("*")
    || !dartResult.substring(3,6).contains("#")) {
      secondShot = dartResult.substring(3,5);
    }

    // 퍼스트 샷 10 포함 옵션 있음 ,세컨드샷이 10이 아니고 옶션 없음  (10S2D3S)
    if(firstShot.startsWith("10") && !firstShot.endsWith("*") || !firstShot.endsWith("#")
        && !dartResult.substring(3,5).contains("10") && !dartResult.substring(3,6).contains("*")
        || !dartResult.substring(3,6).contains("#")) {
      secondShot = dartResult.substring(3,5);
    }



    return secondShot;
  }

  public String compute3(String dartResult,String secondShot,String firstShot) {
    this.dartResult = dartResult;
    this.secondShot = secondShot;
    //1번 샷에 옵션 포함 할 때


    String thirdShot = "";

    // 1,2 어느하나도 옵션 포함 없음 3번째 샷 경우의 수
    if(firstShot.length() + secondShot.length() == 4) {
      thirdShot = dartResult.substring(4);
    }



    //1,2 둘중 하나는 옵션포함
    if(firstShot.length() + secondShot.length() == 5)
         { thirdShot = dartResult.substring(5);
    }

    //1,2 둘다 옵션 포함
    if(firstShot.length() + secondShot.length() == 6)
        { thirdShot = dartResult.substring(6);
    }
      return thirdShot;
  }

  public int computeToNumber(String firstShot,String secondShot,String thirdShot) {

    double firstShotNumber = 0;
    if(firstShot.contains("S")) {
      firstShotNumber = Math.pow(Character.getNumericValue(firstShot.charAt(0)),1);
    }
    if(firstShot.contains("D")) {
      firstShotNumber = Math.pow(Character.getNumericValue(firstShot.charAt(0)),2);
    }
    if(firstShot.contains("T")) {
      firstShotNumber = Math.pow(Character.getNumericValue(firstShot.charAt(0)),3);
    }

    if(firstShot.contains("*")) {
      firstShotNumber = firstShotNumber * 2;
    }

    if(firstShot.contains("#")) {
      firstShotNumber = firstShotNumber * (-1);
    }

    double secondShotNumber = 0;
    if(secondShot.contains("S")) {
      secondShotNumber = Math.pow(Character.getNumericValue(secondShot.charAt(0)),1);
    }
    if(secondShot.contains("D")) {
      secondShotNumber = Math.pow(Character.getNumericValue(secondShot.charAt(0)),2);
    }
    if(secondShot.contains("T")) {
      secondShotNumber = Math.pow(Character.getNumericValue(secondShot.charAt(0)),3);
    }

    if(secondShot.contains("*")) {
      secondShotNumber = secondShotNumber * 2;
      firstShotNumber = firstShotNumber * 2;
    }

    if(secondShot.contains("#")) {
      secondShotNumber = secondShotNumber * (-1);

    }

double thirdShotNumber = 0;
    if(thirdShot.contains("S")) {
      thirdShotNumber = Math.pow(Character.getNumericValue(thirdShot.charAt(0)),1);
    }
    if(thirdShot.contains("D")) {
      thirdShotNumber = Math.pow(Character.getNumericValue(thirdShot.charAt(0)),2);
    }
    if(thirdShot.contains("T")) {
      thirdShotNumber = Math.pow(Character.getNumericValue(thirdShot.charAt(0)),3);
    }

    if(thirdShot.contains("*")) {
      thirdShotNumber = thirdShotNumber * 2;
      secondShotNumber = secondShotNumber * 2;
    }

    if(thirdShot.contains("#")) {
      thirdShotNumber = thirdShotNumber * (-1);

    }

    return (int) (thirdShotNumber);
  }
}

