import org.junit.jupiter.api.*;

import java.awt.*;

import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WildGuessTest {
  @Test
  void simple() {
    int[] answer = {};
    int[] answers = {1,2,3,4,5};
    int[] mathFailer1 = {1,2,3,4,5};
    int[] mathFailer2 = {2,1,2,2,2,3,2,4,2,5};
    int[] mathFailer3 = {3,3,1,1,2,2,4,4};
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;

    for(int i = 0 ; i < answers.length; i += 1) {
      if(answers[i] == mathFailer1[i % mathFailer1.length]) {
        score1 +=1;
      }
    }

    for(int i = 0 ; i < answers.length; i += 1) {
      if(answers[i] == mathFailer2[i % mathFailer2.length]) {
        score2 +=1;
      }
    }

    for(int i = 0 ; i < answers.length; i += 1) {
      if(answers[i] == mathFailer2[i % mathFailer1.length]) {
        score3 +=1;
      }
    }
    assertEquals(5,score1);

  }

  @Test
  void topScore() {
    int[] answer = {};
    int[] answers = {1,2,3,4,5};
    int[] mathFailer1 = {1,2,3,4,5};
    int[] mathFailer2 = {2,1,2,2,2,3,2,4,2,5};
    int[] mathFailer3 = {3,3,1,1,2,2,4,4};
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;

    for(int i = 0 ; i < answers.length; i += 1) {
      if(answers[i] == mathFailer1[i % mathFailer1.length]) {
        score1 +=1;
      }
    }

    for(int i = 0 ; i < answers.length; i += 1) {
      if(answers[i] == mathFailer2[i % mathFailer2.length]) {
        score2 +=1;
      }
    }

    for(int i = 0 ; i < answers.length; i += 1) {
      if(answers[i] == mathFailer2[i % mathFailer1.length]) {
        score3 +=1;
      }
    }

    List<Integer> resultList = new ArrayList<>();
    int TopScore = Math.max(score1, Math.max(score2,score3));

    if(TopScore == score1) {
      resultList.add(1);
    }
    if(TopScore == score1) {
      resultList.add(2);
    }
    if(TopScore == score1) {
      resultList.add(3);
    }
    answer = resultList.stream().mapToInt(i -> i).toArray();

    assertArrayEquals(new int[1], answer);

    }
  }
