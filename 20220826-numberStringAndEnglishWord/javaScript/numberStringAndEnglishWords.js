/* eslint-disable no-unused-vars */
/* eslint-disable no-param-reassign */
export default function solution(s) {
  const numbers = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
  let answer = s;

  for (let i = 0; i < numbers.length; i += 1) {
    const arr = answer.split(numbers[i]);
    console.log(`뭘까 대체: ${arr}`);
    answer = arr.join(i);
  }

  return Number(answer);
}
