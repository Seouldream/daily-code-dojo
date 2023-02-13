// 이해
// 입력받은 수 x 는 각 자릿수의 합으로 나누어 떨어진다면 하샤드 수 이다.
// 풀이
// 받아오는 수를 배열로 나눈다.
// 각 자릿수의 합을 더한다 -> reduce
// x 를 구한 값으로 나눈다
// 나머지 0 ? true : false
function solution(x) {
  const stringX = `${x}`;

  const digits = stringX.split('');

  const sum = digits.reduce((acc, current) => (
    acc + current
  ), 0);

  if (x % sum === 0) {
    return true;
  }
  return false;
}
