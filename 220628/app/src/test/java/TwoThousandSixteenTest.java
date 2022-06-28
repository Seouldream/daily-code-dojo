import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class TwoThousandSixteenTest {
  @Test
  void monthDates() {
    TwoThousandSixteen twoThousandSixteen = new TwoThousandSixteen();
      int a = 0;
      int b;
      String answer = "";

      String[] dayCycle = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
      int[] monthDates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

      //int monthDatesSum = monthDates[a-2] + monthDates[a-3]...monthDates[0];
      int monthDatesSum = 0;
      for (int i = 0; a - 2 - i >= 0; i += 1) {
        monthDatesSum += monthDates[a - 2 - i];
      }

      assertEquals(0,monthDatesSum);
    }
@Test
void remainder0() {
    TwoThousandSixteen twoThousandSixteen = new TwoThousandSixteen();
    String answer = "";
    int a = 5;
    int b = 24;

  String[] dayCycle = new String[] {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    int[] monthDates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //int monthDatesSum = monthDates[a-2] + monthDates[a-3]...monthDates[0];
    int monthDatesSum = 0;
    if (a >= 2) {
      for (int i = 0; a - 2 - i >= 0; i += 1) {
        monthDatesSum += monthDates[a - 2 - i];
      }
    }


    int totalDates = 0;
    totalDates = monthDatesSum + b;

    int remainderForDay = totalDates % 7;

    answer = dayCycle[remainderForDay];

    assertEquals("TUE",answer);
  }

  @Test
void remainderrandom() {
    TwoThousandSixteen twoThousandSixteen = new TwoThousandSixteen();
    String answer = "";
    int a = 6;
    int b = 30;

  String[] dayCycle = new String[] {"THU","FRI", "SAT", "SUN", "MON", "TUE", "WED"};
    int[] monthDates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //int monthDatesSum = monthDates[a-2] + monthDates[a-3]...monthDates[0];
    int monthDatesSum = 0;
    if (a >= 2) {
      for (int i = 0; a - 2 - i >= 0; i += 1) {
        monthDatesSum += monthDates[a - 2 - i];
      }
    }


    int totalDates = 0;
    totalDates = monthDatesSum + b;

    int remainderForDay = totalDates % 7;

    answer = dayCycle[remainderForDay];

    assertEquals("TUE",answer);
  }
}


