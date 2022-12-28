// 이해
// 문자열 t 에서 p의 자릿수 만큼 문자를 뽑아낸 후 p 보다 작거나 같은 것의 갯수를 찾아라.
// 풀이
// 문자열 t를 p의 자릿수만큼 끊어내는 방법? for문 과 substring
// 배열에 담는다.
// filter -> filter 값의 갯수
export function getArray(t, p) {
  const array = [];
  for (let i = 0; i < t.length + 1 - p.length; i += 1) {
    array.push(t.substring(i, i + p.length));
  }

  return array;
}

export default function solution(t, p) {
  const answer = 0;
  const array = getArray(t, p);
  const answerArray = array.filter((element) => (
    element + 0 <= p + 0
  ));
  return answerArray;
}
