// 배열 생성
// 배열안들의 원소를 어떻게 비교해줄까?
export function getMax(convertedToNumberArray) {
  const max = convertedToNumberArray[convertedToNumberArray.length - 1];
  return max;
}

export function getMin(convertedToNumberArray) {
  const min = convertedToNumberArray[0];
  return min;
}

export function solution(s) {
  const stringNumberArray = s.split(' ');

  const convertedToNumberArray = stringNumberArray.map((element) => Number(element));
  convertedToNumberArray.sort((a, b) => a - b);

  const max = getMax(convertedToNumberArray);

  const min = getMin(convertedToNumberArray);

  const answer = `${min} ${max}`;

  return answer;
}
