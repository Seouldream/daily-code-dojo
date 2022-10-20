export function split(s) {
  const array = s.split('');
  const lowerCaseArray = array.map((alphabet) => alphabet.toLowerCase());
  return lowerCaseArray;
}

export function converter(array) {
  const convertedArray = array.map(
    (alphabet, index, myself) => (myself[index - 1] === ' ' || index === 0 ? alphabet.toUpperCase() : alphabet),
  );
  return convertedArray;
}

export default function solution(s) {
  const array = split(s);

  const answerArray = converter(array);

  const answer = answerArray.join('');
  return answer;
}
