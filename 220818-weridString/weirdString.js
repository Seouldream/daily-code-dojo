/* eslint-disable radix */
/* eslint-disable import/prefer-default-export */
export function solution(s) {
  const wordsArray = s.split(' ');
  const transformedArray = [];
  for (let i = 0; i < wordsArray.length; i += 1) {
    transformedArray[i] = stringTransformer(wordsArray[i]);
  }
  const answer = transformedArray.join(' ');

  return answer;
}

export function stringTransformer(word) {
  let thing = '';
  for (let i = 0; i < parseInt((word.length / 2) + 1); i += 1) {
    if (word.charAt(2 * i) === null) {
      break;
    }

    thing += word.charAt(2 * i).toUpperCase();

    if (word.charAt((2 * i) + 1) === null) {
      break;
    }

    thing += word.charAt((2 * i) + 1).toLowerCase();
  }
  return thing;
}
