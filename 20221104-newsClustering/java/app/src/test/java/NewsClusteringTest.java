import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NewsClusteringTest {
  @Test
  void convertToArray() {
    NewsClustering newsClustering = new NewsClustering();

    assertEquals(List.of("FR", "RA", "AN", "NC", "CE"), newsClustering.convertToArray("FRANCE"));
    assertEquals(List.of("ab"), newsClustering.convertToArray("ab+"));
    assertEquals(List.of(), newsClustering.convertToArray("E="));
    assertEquals(List.of("aa", "aa"), newsClustering.convertToArray("aa1+aa2"));
    assertEquals(List.of("AA", "AA", "AA"), newsClustering.convertToArray("AAAA12"));
  }

  @Test
  void convertToUpperCase() {
    NewsClustering newsClustering = new NewsClustering();

    assertEquals("FRAN2CE", newsClustering.convertToCapital("fran2ce"));
    assertEquals("FRAN2**CE", newsClustering.convertToCapital("fran2**ce"));
  }

  @Test
  void findExceptionString() {
    NewsClustering newsClustering = new NewsClustering();

    assertTrue(newsClustering.containsException("FR"));
    assertFalse(newsClustering.containsException("*F"));
    assertFalse(newsClustering.containsException("22"));
    assertFalse(newsClustering.containsException("2F"));
    assertTrue(newsClustering.containsException("aa"));
  }

  @Test
  void getIntersection() {
    NewsClustering newsClustering = new NewsClustering();

//    List<String> array1 = new ArrayList<>(List.of("FR","RA","AN","NC","CE"));
//    List<String> array2 = new ArrayList<>(List.of("FR","RE","EN","NC","CH"));
//    assertEquals(List.of("FR","NC"),newsClustering.getIntersectionOfSets(
//        array1,array2));
    List<String> array1 = new ArrayList<>(List.of("AA", "AA"));
    List<String> array2 = new ArrayList<>(List.of("AA", "AA", "AA"));
    assertEquals(List.of("AA", "AA"), newsClustering.getIntersectionOfSets(
        array1, array2));
  }

  @Test
  void getSumCase1() {
    NewsClustering newsClustering = new NewsClustering();

    List<String> array1 = new ArrayList<>(List.of("FR", "RA", "AN", "NC", "CE"));
    List<String> array2 = new ArrayList<>(List.of("FR", "RE", "EN", "NC", "CH"));
    List<String> intersection = new ArrayList<>(List.of("FR", "NC"));
    assertEquals(List.of("FR", "NC", "RA", "AN", "CE", "RE", "EN", "CH"), newsClustering.getSumOfSets(
        array1, array2, intersection)
    );
  }

  @Test
  void getSumCase2() {
    NewsClustering newsClustering = new NewsClustering();

    List<String> array3 = new ArrayList<>(List.of("AA", "AA"));
    List<String> array4 = new ArrayList<>(List.of("AA", "AA", "AA"));
    List<String> intersection2 = new ArrayList<>(List.of("AA", "AA"));
    assertEquals(List.of("AA", "AA", "AA"), newsClustering.getSumOfSets(
        array3, array4, intersection2)
    );
  }


  @Test
  void answer() {
    NewsClustering newsClustering = new NewsClustering();

    // assertEquals(16384,newsClustering.solution("FRANCE","french"));
    assertEquals(43690, newsClustering.solution("aa1+aa2", "AAAA12"));
  }

  @Test
  void answerCase2() {
    NewsClustering newsClustering = new NewsClustering();

    // assertEquals(16384,newsClustering.solution("FRANCE","french"));
    assertEquals(65536, newsClustering.solution("E=M*C^2", "e=m*c^2"));
  }
}