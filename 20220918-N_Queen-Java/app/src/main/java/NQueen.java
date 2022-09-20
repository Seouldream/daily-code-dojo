
// Q 0 0 0  [0] [1] [2] [3]
// 0 0 0 0  [0] [1] [2] [3]
// 0 0 0 0  [0] [1] [2] [3]
// 0 0 0 0  [0] [1] [2] [3]

import java.util.*;

public class NQueen {
  public int solution(int n) {
    int[] column;
    int answer = 0;

    column = new int[n];
    for (int i = 0; i < n; i += 1) {
      column[i] = -1;
    }

    answer = dfs(n, 0, column);
    return answer;

  }

  public int dfs(int n, int index, int[] column) {
    if (index == n) {
      return 1;
    }
    int res = 0;
    for (int i = 0; i < n; i++) {
      column[index] = i;
      if (check(index, column)) res += dfs(n, index + 1, column);
      column[index] = -1;
    }
    return res;
  }

  public boolean check(int here, int[] column) {
    for (int i = 0; i < here; i++) {
      if (column[here] == column[i]) return false;
      if (Math.abs(column[here] - column[i]) == here - i) return false;
    }
    return true;
  }
}

