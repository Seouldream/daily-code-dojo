import java.util.*;

// 길이가 1인 모든 단어를 포함하도록 사전을 초기화한다.
// 사전에서 현재 입력과 일치하는 가장 긴 문자열 w를 찾는다.
// w에 해당하는 사전의 색인 번호를 출력하고,입력에서 w를 제거한다.
// 입력에서 처리되지 않은 다음 글자가 남아있다면(c),w+c에 해당하는 단어를 사전에 등록한다.
// 단계 2로 돌아간다.
// 풀이
// 사전 리스트로 ?
// KAKAO
//현재 입력(w)	다음 글자(c)	출력	  사전 추가(w+c)
// K          A          	11	  27: KA
// A        	K         	1	    28: AK
// KA       	O         	27	  29: KAO
// O                   		15
public class Compression {
  public ArrayList<Integer> solution(String msg) {
    int[] answer = {};
    ArrayList<Integer> ans = new ArrayList<Integer>();
    int ind = 1;
    HashMap<String, Integer> hs = new HashMap<String, Integer>();
    for (char i = 'A'; i <= 'Z'; i++) {
      hs.put(i + "", ind++);
    }
    int size = msg.length();
    for (int i = 0; i < size; i++) {
      int a = 1;
      while (i + a <= size && hs.containsKey(msg.substring(i, i + a))) {
        a++;
      }
      if (i + a > size) {
        ans.add(hs.get(msg.substring(i)));
        break;
      }
      ans.add(hs.get(msg.substring(i, i + a - 1)));
      hs.put(msg.substring(i, i + a), ind++);
      if (a > 1) i += a - 2;
    }
    return ans;
  }



  public int addDictionary(String currentInput, String nextInput, List<String> dictionary) {
    if (dictionary.contains(currentInput)) {
      dictionary.add(currentInput + nextInput);
      return dictionary.indexOf(currentInput) + 1;
    }
    return 0;
  }
}
