import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UnfinishedMarathonerTest {
  @Test
  void spareRemoval() {
    List<String> list = new ArrayList<>();
    list.add("중복");
    list.add("중복아님");

    list.add("중복");

    System.out.println(list);

    list.remove("중복");
    assertEquals(list,"[중복아님");
  }

  @Test
  void doit() {
    UnfinishedMarathoner unfinishedMarathoner = new UnfinishedMarathoner();


    assertEquals("leo",unfinishedMarathoner.solution(
        new String[] {"leo", "kiki", "eden"},new String[] {"eden", "kiki"}));

    assertEquals("vinko",unfinishedMarathoner.solution(
        new String[] {"marina", "josipa", "nikola", "vinko", "filipa"},
        new String[] {"josipa", "filipa", "marina", "nikola"}));

  }
}