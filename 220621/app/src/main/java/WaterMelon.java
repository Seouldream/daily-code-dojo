public class WaterMelon {


  String solution(int n) {
    //수박수박수박수박수박
    //1번 케이스 n 이 10000이하 자연수니까 수박글자는 총 5000개
    String watermelon = "수박";
    String watermelonRow = "" ;
    for(int i= 1; i < 5001 ;i += 1) {
      watermelonRow += watermelon;
    }

    String answer = watermelonRow.substring(0,n);;
    return answer;
  }
}
