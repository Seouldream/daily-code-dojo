const accendingByLength = (arr1, arr2) => arr1.length - arr2.length;

const toNumbers = (str) => str.split(',').map((it) => Number(it));

export default function tupleFrom(str) {
  const answer = str.slice(2, -2).split('},{')
    .map((it) => toNumbers(it))
    .sort(accendingByLength)
    .reduce((acc, cur) => [...acc, ...cur.filter((it) => !acc.includes(it))], []);

  return answer;
}

const solution = (str) => tupleFrom(str);
