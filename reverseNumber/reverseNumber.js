export function solution(n) {
  const nToString = n.toString();

  const array = makeNumbersToArray(nToString);

  const sortedArray = makeSortedArray(array);

  let answer = 0;

  for (let z = 0; z < sortedArray.length; z += 1) {
    answer += parseInt((sortedArray[z]) * 10 ** (sortedArray.length - z - 1));
  }

  return answer;
}

export function makeSortedArray(array) {
  return array.sort((a, b) => b - a);
}

export function makeNumbersToArray(nToString) {
  const array = [];
  for (let i = 0; i < nToString.length; i += 1) {
    array[i] = nToString.charAt(i);
  }
  return array;
}
