// 이해
// 배열에 있는 수들의 최소 공배수 구하기
// 풀이
// 최소 공배수란 두수의 곱을 최대공약수로 나눈 것 과 같음
// 최대공약수 ? -> 유클리드 호제법
// 두 수를 서로 나누고 다시 나눈 나머지와 두 수 중 작은수를 계속해서 나누어 나머지가 0이 될 때의 작은수

export default function solution(arr) {

  function greatestCommonDivisor(a, b) {
    return a % b ? greatestCommonDivisor(b, a % b) : b
  }
  
  return arr.reduce((a, b) => (a*b / greatestCommonDivisor(a,b)))

}