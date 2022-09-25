function solution(arr) {
  let answer = arr[0];

  for (let i = 1; i < arr.length; i += 1) {
    const greatestCommonDivisor = getGreatestCommonDivisor(arr[i], answer);

    answer = (answer * arr[i]) / greatestCommonDivisor;
  }

  return answer;

  function getGreatestCommonDivisor(a, b) {
    const maxNumber = Math.max(a, b);
    const minNumber = Math.min(a, b);

    const r = maxNumber % minNumber;
    if (r !== 0) {
      return getGreatestCommonDivisor(minNumber, r);
    }

    if (r === 0) {
      const gcd = minNumber;
      return gcd;
    }
  }
}
