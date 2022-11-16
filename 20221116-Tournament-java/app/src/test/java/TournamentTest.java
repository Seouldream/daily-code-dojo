import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TournamentTest {
  @Test
  void answer() {
    Tournament tournament = new Tournament();

  //  assertEquals(3,tournament.solution(8,4,7));
    assertEquals(3,tournament.solution(8,4,5));
  }

}