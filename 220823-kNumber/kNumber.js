/* eslint-disable import/prefer-default-export */
// 1. 자르기
// 2. 배열 오름차순 정렬
// 3. 나온 배열에서 k번재 숫자 가져오기
// -> 일반화시키기
// 2차원 배열에 적용
export function solution(array, commands) {
  const answer = [];
  let r = 0;
  for (let e = 0; e < commands.length; e += 1) {
    answer[r] = cutSortAndPick(array, commands[e]);
    r += 1;
  }

  return answer;
}

export function cutArray(array, i, j) {
  const slicedArray = [];
  let w = 0;
  for (let q = i - 1; q < j; q += 1) {
    slicedArray[w] = array[q];
    w += 1;
  }

  return slicedArray;
}

export function sortArray(slicedArray) {
  return slicedArray.sort((a, b) => a - b);
}

export function pick(sortedArray, k) {
  return sortedArray[k - 1];
}

export function cutSortAndPick(array, command) {
  const slicedArray = cutArray(array, command[0], command[1]);
  const sortedArray = sortArray(slicedArray);
  const wantedNumber = pick(sortedArray, command[2]);
  return wantedNumber;
}

export function solution2(array, commands) {
  return commands.map((v) => array.slice(v[0] - 1, v[1]).sort((a, b) => a - b).slice(v[2] - 1, v[2])[0]);
}
