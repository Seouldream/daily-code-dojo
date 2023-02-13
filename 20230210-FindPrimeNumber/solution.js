// 조건
// 1. n 이 주어진다.
// 2. 2 ~ n 까지의 모든 자연수 중에서 소수인것의 갯수
// 3. for 문으로 모든 자연수에대해 소수인지 검사
// 4. 주어진 수 이전의 모든 자연수를 전부 나눈다.

// 모든 소수는 1 * 자기 자신
// 모든 소수가 아닌 수는 소수들의 곱 4 = 2 * 2, 6 = 2 * 3 ;
// primeNumbers => 소수 인 것
//

// 주어진 수 만큼 반복
// 1을 제외한 어떤 수로도 나누어 떨어지지 않는다 => 소수
// 1을 제외한 모든 수는 소수의 곱이다.
// 임의의 수를 소수인지 판별하려면?
// 임의의 수가 이전의 모든 소수로 나누어떨어지지 않는지 검사한다.
// 2의 배수이면 소수가 아니다

export function isPrimeNumber(number, array) {
  // number = 120;
  // array = [ 2 , 3 ,5, 7, 11]
  // array의 요소들 중 하나로 나눴을때 0으로 나누어 떨어지는 숫자가 있다면 소수가 아니다
  // array의 요소들 모두로 나눴을때 0이 아니라면 소수이다.

  const root = Math.ceil(Math.sqrt(number));

  // const primeNumbers = array.filter((element) => (element <= root));
  const primeNumbers = [];

  for (let i = 0; i < array.length; i += 1) {
    if (array[i] <= root) {
      primeNumbers.push(array[i]);
    }
    if (array[i] > root) {
      break;
    }
  }

  // return primeNumbers.every((element) => (number % element) !== 0);
  for (let i = 0; i < primeNumbers.length; i += 1) {
    if ((number % primeNumbers[i]) === 0) {
      return false;
    }
  }
  return true;
}

export function solution(n) {
  const primeNumbers = [];
  for (let i = 2; i < n + 1; i += 1) {
    if (isPrimeNumber(i, primeNumbers)) {
      primeNumbers.push(i);
    }
  }
  return primeNumbers.length;
}
