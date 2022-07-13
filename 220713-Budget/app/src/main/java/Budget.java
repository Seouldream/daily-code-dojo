// 최대 몇개의 부서를 지원해줄 수 있는가?
//배열에서 가장 작은것 끼리 더함
// 하나씩 더한 후  예산보다 작은지 검사
// 더한 값이 예산보다 크다면 그 직전 더한 갯수 를 구함

//필요한 것
// 배열의 최소 값 구하기 혹은 배열의 오름차순 정렬
// 반복문으로 각각 더한 값이 예산보다 큰지 검사 카운트 변수 도입

//예외
// 이게 반드시 작은 값들이 아니라도 그 예산에 맞는

import java.util.*;

public class Budget {
  public int solution(int[] d, int budget) {
    int answer = 0;

    //오름 차순 정렬

    Arrays.sort(d);

    int totalBudget = 0;
    int count = 0;
    int result = 0;
    for(int i = 0; i < d.length; i += 1) {
      totalBudget += d[i];
      count += 1;
      if(totalBudget > budget) {
        result = count - 1;
        break;
      }
      if(totalBudget == budget) {
        result = count;
        break;
      }
    result = count;

    }
    answer = result;
    return answer;
  }
}