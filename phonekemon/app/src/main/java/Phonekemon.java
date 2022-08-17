import java.util.*;

// 1. 항상 주어지는 짝수 의 절반의 수만큼 폰케몬을 가질수 있음
// 2. 가장 많은 종류의 폰켓몬을 가지려고함 그리고 그 최대수를 알고싶음
// 3.원래수에서 중복을 제거한다 -> 중복을 제거한 배열의 수를 구한다
// 그 수가 절반보다 큰지 아닌지 따진다
// 크다 -> n /2 결론
// 작다 -> 그 수가 바로 정답
public class Phonekemon {
  public int solution(int[] nums) {
    int answer = 0;


    HashSet<Integer> noSamePhonekemonSets = new HashSet<>();
    for(Integer phonekemonNumber : nums) {
      noSamePhonekemonSets.add(phonekemonNumber);
    }

    if(noSamePhonekemonSets.size() >= nums.length / 2) {
        answer = nums.length / 2 ;
    }
    if(noSamePhonekemonSets.size() < nums.length / 2) {
      answer = noSamePhonekemonSets.size();
    }
    return answer;
  }
}
