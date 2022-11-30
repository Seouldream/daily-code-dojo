import java.util.*;
//이해
// 1.  중복된 원소 존재가능 -> 그렇지만 문제에서는 중복되는 원소가 없는 것이 주어짐!
// 2. 순서가 다르면 다른 튜플임
// 3. 원소 개수가 유한하다.
// 중복은 없지만 순서가 존재하는 튜플을 구하라
// 튜플의 원소 순서대로 하나 , 둘 , 셋을 가져오기때문에
// 집합에서 하나만 있는 원소는 튜플의 첫째
// 두개 원소는 하나를 제거한 것의 두번째
// 세번째는 1,2를 제거한 것의 나머지
// n번째는 1... n - 1 을 제거한 나머지가 튜플의 n번째 원소
// 풀이
// 주어진 집합 {,} 기준으로 스플릿해서 새 문자열에 담는다. string[]
// 튜플은 스플릿한 문자열의 길이 = 튜플의 길이
// 각 문자열에서 갯수가 하나인 것을 찾는다. 튜플 원소 1
// 문자열에서 갯수가 2개인것을 찾는다. 원소 1을 뺀다 -> 원소 2
// 앞의 식을 3까지한후 규칙을 찾고 반복한다.
public class Tuple {
    public int[] solution(String s) {
      Set<String> set =new LinkedHashSet<>();
      String[] tuple=s.substring(1,s.length()-1).split("},");
      for(int i=0;i<tuple.length;i++){
        tuple[i]=tuple[i].replace("{","");
        tuple[i]=tuple[i].replace("}","");

      }
      Arrays.sort(tuple,(a,b)->(a.length()-b.length()));
      for(String data:tuple){
        String[] arr=data.split(",");
        for(String data2:arr){
          set.add(data2);
        }
      }
      int[] answer=new int[set.size()];
      int count=0;
      for(String data:set){
        answer[count++]=Integer.parseInt(data);
      }

      return answer;
    }

  public String[] getStringArray(String s) {
    s = s.substring(2,s.length() -2);
    System.out.println(s);

    return s.split("(},\\{)");
  }
}
