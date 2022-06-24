import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 변수 0 , 즉 0의 갯수에 따라 순위가 달라짐
// 0이 1개 인 경우 lottos num = win num 같은게 몇개인가? 몇개 + 1 = 최고 순위 몇개 + 0 최저
// 0이 2개인 경우  같은게 몇개 + 2(0의 갯수)  최저 = 같은 갯수
// ... 0이 6개인경우 같은게 몇개(0개) + 6(0의 갯수) = 최고 ,최저 + 같은갯수(0) = 0
// 식으로 표현하면?
// 1. 0이 몇 개 인지를 검사
// 2. 1개 이면 ->   2개 이면 ->  라는 조건식 만들기
// 3. 조건식 답에 같은 갯수도 넣어줘야 하므로 같은 갯수도 검사하는 식 만들기
// 4. 만들어보자 !
// 0 이 0개 -> 최곳값 갯수 = 같은값 갯수 + 0의 갯수... 최젓값 갯수 = 같은갯수
// 0 이 1개 -> 쵯곳값 갯수 = 같은값 갯수 + 0의갯수 1 , 최저값 갯수 = 같은갯수
public class Lottos {

  public int[] solution(int[] lottos, int[] win_nums) {

    //배열의 길이
    int count = 0;
    int count2 = 0;
    int MaxMatchNumber = 0;
    int MinMatchNumber = 0;

    for (int i = 0; i < 6; i += 1) {
      for (int j = 1; j < 6; j += 1) {
        if (lottos[i] == lottos[j]) {
          count += 1;
        }
      }
    }   // 카운트가 0이 중복되는 갯수

    for(int i = 0; i < 6; i =+ 1) {
      for(int j = 0; j < 6; j += 1) {
        if(lottos[i] == lottos[j]) {
          count2 += 1;
        }
      }
    } // 일치하는 갯수

      MaxMatchNumber = count2 + count;
      MinMatchNumber = count2; //일치 갯수는 곧 최저로 가장 맞을 갯수이다

      int MaxRank = 0;

    if(MaxMatchNumber == 0 || MaxMatchNumber == 1) {
      MaxRank = 6;
    }
    if(MaxMatchNumber == 2) {
      MaxRank = 5;
    }
    if(MaxMatchNumber == 3) {
      MaxRank = 4;
    }
    if(MaxMatchNumber == 4) {
      MaxRank = 3;
    }
    if(MaxMatchNumber == 5) {
      MaxRank = 2;
    }
    if(MaxMatchNumber == 6) {
      MaxRank = 1;
    }

        int MinRank = 0;  // 미니멈 갯수가 0일때
    if(MinMatchNumber == 0 || MinMatchNumber == 1) {
      MinRank = 6;
    }
    if(MinMatchNumber == 2) {
      MinRank = 5;
    }
    if(MinMatchNumber == 3) {
      MinRank = 4;
    }
    if(MinMatchNumber == 4) {
      MinRank = 3;
    }
    if(MinMatchNumber == 5) {
      MinRank = 2;
    }
    if(MinMatchNumber == 6) {
      MinRank = 1;
    }

    int[] answer = {MaxRank,MinRank};


 /*   int[] answer = {};
    return answer;

    Integer[] integerConvertedlottos =
        Arrays.stream(lottos).boxed().toArray(Integer[]::new);


    List<Integer> listConvertedlottos = Arrays.asList(integerConvertedlottos);

    int Frequency0 = Collections.frequency(listConvertedlottos,0);

*/
  }
}

