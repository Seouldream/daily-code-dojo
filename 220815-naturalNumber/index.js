/* eslint-disable no-console */
// 12345   length = 5 
export function solution(n) {
  var answer = [];
  const string = n + '';
  for(let i = string.length; i > 0; i -= 1) {
    const number = Number(string.charAt(i - 1));
      answer.push(number);
  };
  
 
  console.log(answer);
  return answer;
}

solution(12345);
