export function solution(n) {
  const nToString = n.toString();

  let array = makeNumbersToArray(nToString);

  const sortedArray = makeSortedArray(array);

  let answer = 0;

  for (let z = 0; z < sortedArray.length; z += 1 ) {
    answer += parseInt((sortedArray[z]) * Math.pow(10,sortedArray.length - z - 1));
  }
  
  return answer;
}

export function makeSortedArray(array) {
    return array.sort(function (a, b) {
        return b - a;
    });
}

export function makeNumbersToArray(nToString) {
    let array = [];
    for (let i = 0; i < nToString.length; i += 1) {
        array[i] = nToString.charAt(i);
    }
    return array;
}

