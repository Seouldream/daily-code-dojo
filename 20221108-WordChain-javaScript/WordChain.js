// 끝단어가 같아아함
// 이전단어가 있으면 안됨
// 틀린사람의 차례가 몇번째인지 알아야함

export default function solution(n, words) {
  let idx;
  for (let i = 0; i < words.length; i += 1) {
    // 끝말잇기 틀린 경우
    if (i !== 0 && words[i][0] !== words[i - 1][words[i - 1].length - 1]) {
      idx = i + 1;
      return [idx % n === 0 ? n : idx % n, Math.ceil(idx / n)];
    }
    // 중복 단어 말한 경우
    for (let j = i - 1; j >= 0; j -= 1) {
      if (words[i] === words[j]) {
        idx = i + 1;
        return [idx % n === 0 ? n : idx % n, Math.ceil(idx / n)];
      }
    }
  }
  return [0, 0];
}

export function tester(n, words) {
  const array = words.filter((word, index, arr) => ((

    arr[index - 1] === undefined)
    ? null
    : arr[index].charAt(0) !== arr[index - 1].charAt(arr[index - 1].length - 1)));

  return array;
}
