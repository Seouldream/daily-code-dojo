import org.junit.jupiter.api.*;

class FindNumberWithRemainder1Test {
  @Test
  int simple() {
    int n = 10;
    int answer = 0;
    for (int i = 2; i < n - 1; i += 1) {
      if ((n - 1) % i == 0) {
        return answer;

      }
    }


  }

}