function solution(n) {
  let answer = 0;

  const isValid = (board, row) => {
    for (let i = 1; i < row; i += 1) {
      if (board[i] === board[row]) return false;
      if (Math.abs(board[i] - board[row]) === Math.abs(i - row)) return false;
    }
    return true;
  };

  const dfs = (board, row) => {
    if (row === n) answer += 1;
    else {
      for (let i = 1; i <= n; i += 1) {
        if (isValid(board, row + 1)) {
          dfs(board, row + 1);
        }
      }
    }

    for (let i = 1; i <= n; i += 1) {
      const board = new Array(n + 1).fill(0);
      board[1] = i;
      dfs(board, 1);
    }
  };

  return answer;
}
