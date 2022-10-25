// 제거된 0의 갯수를 구한다.
// 1의 길이를 구한다
// 1의 길이를 다 이진법으로 변환한다.
// 1이 될때까지 반복

export function getResultArray(s) {
  const zeroArray = [...s].filter((element) => element !== '1');

  return [zeroArray.length, [...s].length - zeroArray.length];
}

export function solution(string, count = 0, total = 0) {
  if (string === '1') return [count, total];
  const [zeroCount, next] = getResultArray(string);
  return solution(next.toString(2), count + 1, total + zeroCount);
}
