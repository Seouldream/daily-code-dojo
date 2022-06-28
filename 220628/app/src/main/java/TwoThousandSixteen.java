// 2016년은 윤년이므로 366일
// 1월 1~31  ->  a
// 2월 1~29
// 3월 1~31
// 4월 1~30
// 5월 1~31
// 6월 1~30
// 7월 1~31
// 8월 1~31
// 9월 1~30
// 10월 1~31
// 11월 1~30
// 12월 1~31
// 1월1 일 즉 366일의 첫 시작 금 -> 금토일월화수목 routine
// 요일 구하는 법? 7로나눈 
// 방법 1. 월마다 새로운 일주일 루틴을 준다. -> 월마다 새 루틴 짜기 필요
// 방법 2. 총 일수에 정해진 루틴을 나눈다 -> 일수마다 월 구분 필요
// 방법 2를 선택 -> a월 을 입력 받음 => a - 1 월까지가 기본으로 들어오는 날 수 + b = 날

public class TwoThousandSixteen {
  public String solution(int a, int b) {
    String answer = "";

    String[] dayCycle = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
    int[] monthDates = {31,29,31,30,31,30,31,31,30,31,30,31};

    //int monthDatesSum = monthDates[a-2] + monthDates[a-3]...monthDates[0];
    int monthDatesSum = 0;
    if(a >= 2) {
      for (int i = 0; a - 2 - i >= 0; i += 1) {
        monthDatesSum += monthDates[a - 2 - i];
      }
    }


    int totalDates = 0;
    totalDates = monthDatesSum + b;

    int remainderForDay = totalDates % 7;

    answer = dayCycle[remainderForDay - 1];

    return answer;
  }
}
