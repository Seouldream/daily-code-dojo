export function hasSameSizeOfOne(n, nextNumber) {
  const binaryOfN = n.toString(2);
  const binaryOfNextNumber = nextNumber.toString(2);
  const countOfNsOne = [...binaryOfN].filter((element) => element === '1').length;
  const countOfnextNumbersOne = [...binaryOfNextNumber].filter((element) => element === '1').length;

  console.log('match', n.toString(2).match(/1/g));
  console.log('array', [1, 1, 1, 1]);
  if (countOfNsOne === countOfnextNumbersOne) {
    return true;
  }
  return false;
}

export default function solution(n, nextNumber = n + 1) {
  if (hasSameSizeOfOne(n, nextNumber)) {
    return nextNumber;
  }
  return solution(n, nextNumber + 1);
}
