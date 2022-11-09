import java.util.*;

//이해
// 1. 2인 구명 보트
// 2. 최대한 적은 수의 구명 보트를 사용
// 3. 무게제한 초과할 수 없다.
// 해결
// 가장 몸무게가 많이 나가는 사람 을 채운다. 가장 낮은사람을 넣어본다
// 1. 사람들 몸무게를 줄 세운다.(정렬)
// 2. 가장 몸무게 많이 나가는 사람을 선택 넣기 가장 적은 사람 넣기 -> 통과
// 3. 통과하면 각자의 라인에서 빼기
public class LifeBoat {

  public int solution(int[] people, int limit) {

    Arrays.sort(people);

    List<Integer> peopleList = new ArrayList<>();

    for(int person : people) {
      peopleList.add(person);
    }
    int count = 0;
    int range = peopleList.size();

    while(peopleList.size() > 0) {
      if(peopleList.size() == 1) {
        peopleList.remove(0);
        count += 1;
        range -= 1;
        continue;
      }
      if(peopleList.get(peopleList.size() -1 ) + peopleList.get(0) <= limit) {
        System.out.println("IN!!");
        peopleList.remove(0);
        peopleList.remove(peopleList.size() - 1);
        count += 1;
        range -= 2;
        continue;
    }
      if(peopleList.get(peopleList.size() - 1) + peopleList.get(0) > limit) {
        System.out.println("IN Second!!: " + peopleList.size());
        peopleList.remove(peopleList.size() - 1);
        count += 1;
        range -= 1;
      }
    }

    int answer = count;

    return answer;
  }
}
