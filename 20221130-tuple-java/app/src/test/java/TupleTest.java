import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {
  private Tuple tuple;
  @BeforeEach
  void setUp() {
    tuple = new Tuple();
  }

  @Test
  void getStringArray() {
    assertArrayEquals(new String[] {"2","2,1","2,1,3","2,1,3,4"},
        tuple.getStringArray("{{2},{2,1},{2,1,3},{2,1,3,4}}"));

    assertArrayEquals(new String[] {"1,2,3","2,1","1,2,4,3","2"},
        tuple.getStringArray("{{1,2,3},{2,1},{1,2,4,3},{2}}"));
  }


}