import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InnerProductTest {
  @Test
  void case1() {
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
  void case2() {
    int[] a = {-1,0,1};
    int[] b = {1,0,-1};

    int result = 0;
    for(int i = 0; i < a.length; i += 1) {
      result = a[i]*b[i];
      result += result;
    }
  assertEquals(-2,result);
  }

  @Test
  void case3() {
    int[] a = {-1,0,1};
    int[] b = {1,0,-1};

    int result = 0;
    for(int i = 0; i < a.length; i += 1) {
      result = a[i]*b[i];
      result += result;
    }
    assertEquals(-2,result);
  }
}