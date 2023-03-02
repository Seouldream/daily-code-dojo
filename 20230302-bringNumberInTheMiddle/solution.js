// 단어가 짝수 인 경우 가운데 2 글자를 반환
// 단어가 홀수 인 경우 가운데 1 글자를 반환
// 짝수 홀수 인지 구분
// 짝수 이면 주어진 스트링의 번째 (스트링의 갯수 / 2) - 1 (스트링의 갯수 / 2)
// 홀수 이면 주어진 스트링의 (스트링의 갯수 + 1) / 2 - 1
export default function solution(s) {
  if (s.length % 2 === 0) {
    const result = s.substring(((s.length / 2) - 1), (s.length / 2) + 1);
    return result;
  }

  const answer = s.substring(((s.length + 1) / 2) - 1, (s.length + 1) / 2);
  return answer;
}
