import java.util.*;

//전체학생수 / 잃어버린 학생 번호표 / 예비 체육복 가진 번호 표 / 체육복입을수 있는 수
//5	[2, 4]	[1, 3, 5]	 ->5
//5	[2, 4]	[3]	 -> 4
//3	[3]	[1]	 -> 2
// 1번은 2번에게만 빌릴 수 있음
// 2번부터는 1, 2 번에게서
// 전체 수 - 도난당한 수 + 빌려줄수 있는 수
// 내가 지금 구하는 해쉬셋은 다 빌려주고 남은 찌꺼기
// 따라서 리저브 - 빌려줄수 없는 찌꺼기 = 빌려 줄 수 있는 수
// A and B array compare -> hashset
public class StolenSchoolTrackSuits {
  public int solution(int n, int[] lost, int[] reserve) {
    int answer = 0;
      HashSet<Integer> hashSet = new HashSet<Integer>();

    Arrays.sort(lost);
    Arrays.sort(reserve);
    for(int number : reserve) {
      hashSet.add(number);
    }
    //자기 자신 것 없애 주기
    for(int i = 0; i < lost.length; i += 1) {
      if(hashSet.contains(lost[i])) {
        hashSet.remove(lost[i]);
        lost[i] = -1;
      }
    }

    System.out.println("내 자신 빼고난 해쉬셋: " + hashSet);
    for(int i = 0; i < lost.length; i += 1) {
      if(hashSet.contains(lost[i] - 1)) {
        hashSet.remove(lost[i] - 1);
        lost[i] = -1;
      }

      if(hashSet.contains(lost[i] + 1)) {
        hashSet.remove(lost[i] + 1);
      }
    }
    System.out.println("빌려주고 난 해쉬 셋: " + hashSet);
    answer = n - lost.length + (reserve.length - hashSet.size());
    return answer;
  }
}

