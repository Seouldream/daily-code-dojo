import java.util.*;

//한명을 빼고 모두 완주 그 하나를 구하라
//따라서 완주자 리스트 길이는 참가자 리스트의 길이보다 하나가 작다.
//참가자는 20개이하의 알파벳 이름
//동명이인이 있을 수도 있다.
//주어진 배열 2개를 비교해야한다.
//어떻게 ?
//주어진 배열을 각 배열마다 하나씩 있는지 비교함
// 없으면 가지고옴
//동명이인이 있는 경우?
// 동명이인이 있는지 검사함
//
// 사람의 생각과정
//동명이인이 일단 몇명 누구인지 파악한다.
// 두개의 리스트를 받는다 -> 완주자 명단의 리스트 이름 하나를 참가자 리스트 전체와 비교한다. -> 없다? -> 가지고온다
// 동명이인을 검사할때는  -> 참가자 리스트에 그게 몇명있는지 조사한다. 원래 리스트보다 작다? -> 가지고온다
public class Marathoner {
  public String solution(String[] participant, String[] completion) {
    //if(sameName(participant))
    String answer = "";

    HashMap<String, Integer> map = new HashMap<>();

    for(String player:participant) {
      map.put(player,map.getOrDefault(player, 0) + 1);
    }

    for(String player : completion) {
      map.put(player, map.get(player) - 1);
    }

    for(String key : map.keySet()) {
      if ( map.get(key) > 0 ) {
        answer = key;
      }
    }

    return answer;
  }


  public boolean sameName(String[] participant) {

      for(int i = 0;i < participant.length; i += 1) {
      for (int j = 0; j < i; j += 1) {
        if (participant[i].equals(participant[j])) {
          return true;
        }
      }
    }
  return false;}
}