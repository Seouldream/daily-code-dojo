/* eslint-disable no-param-reassign */
//  1-1. 입력된 수가 짝수라면 2로 나눕니다.
//  1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//  2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

// 6 -> 3 -> 1
export default function solution(num, count = 0) {
  if (count > 500) {
    return -1;
  }

  if (num === 1) {
    return count;
  }

  if (num % 2 === 0) {
    num /= 2;
    count += 1;
    return solution(num, count);
  }

  if (num % 2 !== 0) {
    num = (3 * num) + 1;
    count += 1;
    return solution(num, count);
  }
}
