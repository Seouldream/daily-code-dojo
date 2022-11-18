import java.util.*;

// 이해
// 캐시 사이즈는 하나의 값을 담을 수 있는 크기
// 캐시 사이즈에 새로 들어오는 값이 있다면 그것을 참조해서 cache hit 1
// 없다면 가장 오랫동안 쓰이지 않은 값을 바꾸고 cache miss 5
// 풀이
// List 컨테이너를 준비한다.
// 원하는 값이 담겨 있다면 그 값을 제거하고 새로 밀어 넣는다.
// 없다면 그냥 밀어 넣는다.
// 마지막 인덱스가 head
// 0인덱스가 tail 이 되도록한다.
// jeju seoul busan
// -> seoul busan jeju ( count += 5 )
public class Cache {
  public int solution(int cacheSize, String[] cities) {
    List<String> cacheContainer = new ArrayList<>(cacheSize);
    int count = 0;
    for(String city : cities) {
        city = city.toLowerCase();
     if(cacheContainer.contains(city)) {
       count +=1;
       cacheContainer.remove(city);
       cacheContainer.add(city);
       System.out.println("container: " +  Arrays.toString(new List[]{cacheContainer}));
     } else {
       count +=5;
       if(cacheContainer.size() < cacheSize) {
         cacheContainer.add(city);
         System.out.println("container: " +  Arrays.toString(new List[]{cacheContainer}));
       } else {
         cacheContainer.add(city);
         cacheContainer.remove(0);
         System.out.println("container: " +  Arrays.toString(new List[]{cacheContainer}));
       }
     }
    }

    int answer = count;

    return answer;
  }
}
