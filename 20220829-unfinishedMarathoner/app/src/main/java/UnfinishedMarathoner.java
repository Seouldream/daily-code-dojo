import java.util.*;

// 완주자 목록
// 참가자 목록
// 동명이인 가능
// 미완주자 한명 이름 정답
// 목록 하나씩 비교 -> 하나씩 빼기 ( 중복되는건 continue)
//동명이인을 잘 처리하는가?
// 다찾앗는데
// 리스트를 본다
// 하나씩 대조한다
// 하나가 맞으면 지운다 완주자 목록도 지운다.
public class UnfinishedMarathoner {
  public String solution(String[] participant, String[] completion) {

    Arrays.sort(participant);
    Arrays.sort(completion);

    String answer = "";

    for(int i = 0 ; i < completion.length; i += 1) {
  if(!participant[i].equals(completion[i])) {
    return participant[i];
  }
}
    return participant[participant.length - 1];
  }
}