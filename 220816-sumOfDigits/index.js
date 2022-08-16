/* eslint-disable no-console */
// 123 -> 1 + 2 + 3 => 
// 각 자릿수 쪼개기
// 123   100 = 1 * 10(자릿수-1의승)
export function solution(n) {
  
  n = n.toString();
  const numDigit = n.length;

  let newDigit = 0;

  for( let i = 0; i < numDigit ; i += 1 ) {
      newDigit += parseInt(n.charAt(i));
  }

  var answer = newDigit;
  return answer;
  };
  
  