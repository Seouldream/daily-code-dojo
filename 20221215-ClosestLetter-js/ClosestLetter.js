// 이해 처음 나온 숫자는 -1
// 기존의 나왔던 숫자라면 가장 최근의 숫자에서 얼만큼 떨어져 있는지
// 그것의 배열
// 처음나왔는지 중복인지를 판별하는 플래그가 있으면 좋지 않을까?
// 가장 최근의 숫자를 어떻게 판별해 줄 것인가?
// 풀이
// 1. 받은 문자를 문자 배열로 치환해준다.
// 2. 문자 배열의 길이만큼 -1로 채운 배열을 만든다.
// 3. 플래그 조건을 만든다. (이전 모든 값중 일치하는 것이 있는지)
// 4. 이전 값과 현재 구하는 값이 일치하는 원소의 인덱스끼리 서로 빼준다.

// 같은 문자 갯수
export default function solution(s) {
  const answer = [];
  const exists = [];

  for (let i = 0; i < s.length; i += 1) {
    if (exists.includes(s[i])) {
      answer.push(i - exists.lastIndexOf(s[i]));
    }
    if (!exists.includes(s[i])) {
      answer.push(-1);
    }
    exists.push(s[i]);
  }
  return answer;
}
