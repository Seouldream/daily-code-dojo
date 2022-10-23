// stackCount -1 이 쌓였다 -> ) 이 먼저 나옴 -> false
// stackCount 0 이다 => () 가 알맞게 페어링 -> true
// stackCount > 0  => ( 가 남아 있다.
function solution(s) {
  let stackCount = 0;
  for (let i = 0; i < s.length; i += 1) {
    stackCount += s[i] === '(' ? 1 : -1;
    if (stackCount < 0) return false;
  }

  if (stackCount === 0) {
    return true;
  }
  if (stackCount !== 0) {
    return false;
  }
}
