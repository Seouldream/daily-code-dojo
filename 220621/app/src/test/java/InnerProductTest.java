import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InnerProductTest {
  private InnerProduct answer;
  @Test
  void case0() {
    int[] a = {1,2,3,4};
    int[] b = {-3,-1,0,2};

    int result = 0;
    for(int i = 0; i < a.length; i += 1) {
      result = a[i]*b[i];
      result += result;
    }
    assertEquals(3,result);
  }
  @Test
  void case1() {
    int[] a = {1,2,3,4};
    int[] b = {-3,-1,0,2};

    int answer = 0;
    for(int i = 0; i < a.length; i += 1) {
      answer += a[i]*b[i];
    }
  assertEquals(3,answer);
  }

  @Test
  void case2() {
    int[] a = {-1,0,1};
    int[] b = {1,0,-1};

    int result = 0;
    int result1 = 0;
    for(int i = 0; i < a.length; i += 1) {
      result1 = a[i]*b[i];
      result += result1;
    }
  assertEquals(-2,result);
  }

  @Test
  void case3() {
    int[] a = {-1,0,1};
    int[] b = {1,0,-1};

    int result = 0;
    int result1 = 0;
    for(int i = 0; i < a.length; i += 1) {
      result1 = a[i]*b[i];
      result += result1;
    }
    assertEquals(-2,result);
  }
  @Test
  void arrayVariableTest() {
    InnerProduct innerProduct = new InnerProduct();


    assertEquals(-2,innerProduct.solution(new int[]{-1,0,1},new int[]{1,0,-1}));

  }
  @Test
  void globalVariableTest() {
    InnerProduct innerProduct = new InnerProduct();


    assertEquals(-2,innerProduct.cal);

  }
}

