// 이해
// 두 문자열이 주어짐
// 두 문자열을 두글자씩(주어진 배열 + 배열 + 1 ) 나눈다.
// 합집합과 교집합을 구한다.
// 조건
// 영문자만 유효하고 공백, 숫자 ,특수문자가 들어있는 글자는 해당 글자 요소를 버린다.
// 대문자와 소문자는 같은 것으로 취급한다 -> 모두 소문자화 시켜주면 되겠네
// 주어진 값에 65536을 곱한후 정수부만 출력한다.
// 풀이
// 0. 모두 대문자로 변환한다.
// 1. 문자열을 다음 문자열을 더해서 배열로 만든다.
// 2. 문자열의 길이는 2이상이므로 무조건 하나의 원소를 가진다.
// 영문자만 유효하고 공백, 숫자 ,특수문자가 들어있는 글자는 해당 글자 요소를 버린다. OK
// 3. 교집합을 어떻게 구할 것인가?
// -> 두 배열을 비교하고 공통된 원소가 있으면 배열에서 각각 하나씩 제거허고 제거하는 원소를 새로운 배열에 담는다. 교집합
// 4. -> 각각 두 배열에서 교집합을 제거한 배열을 남긴다. 이 모두를 교집합배열에 담는다 -> 합집합
// 5. -> 교집합의 갯수 / 합집합의 원소 갯수 * 65536
// 6. -> 정수부만 남긴다.
export default function solution(str1, str2) {
  function convertToCapitalLetterAndArray(string) {
    const result = [];

    const UppperString = string.toUpperCase();

    for (let i = 0; i < string.length - 1; i += 1) {
      const element = UppperString.substr(i, 2);
      if (element.match(/[A-Za-z]{2}/)) {
        console.log('element', element);

        result.push(element);
      }
    }
    return result;
  }

  const array1 = convertToCapitalLetterAndArray(str1);

  const array2 = convertToCapitalLetterAndArray(str2);

  const set = new Set([...array1, ...array2]);

  let union = 0;
  let intersection = 0;

  set.forEach((item) => {
    const has1 = array1.filter((x) => x === item).length;
    const has2 = array2.filter((x) => x === item).length;

    union += Math.max(has1, has2);
    intersection += Math.min(has1, has2);
  });

  if (intersection === 0 && union === 0) {
    return 0;
  }

  const answer = Math.floor((intersection / union) * 65536);
  return answer;
}
