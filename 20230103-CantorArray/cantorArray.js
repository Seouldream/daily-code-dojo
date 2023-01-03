// 이해 
// 0번째 1
// 1번째 11011
// 2번째 11011 11011 00000 11011 11011
// 주어진 수 11011 11011 00000 11011 11011
export default function solution1(n, l, r) {
  const cantorBit = convertTo("1",n,[]);

    const span = cantorBit.substring(l - 1,r);

    return span.split('').filter((element) => (
      element === "1"
    )).length
    
}

export function convertTo(string,n,times = []) {

  const zero = string.split('');
  
  const splitArray =  zero.map((element) => (
    element === "1" ? element = "11011" : element = "00000"
  ))
  
  const nextCantorBit = splitArray.reduce((acc, current) => (
    acc + current
  ),'')

  times.push("action");

  if(times.length === n) {
    return nextCantorBit;
  }

  return convertTo(nextCantorBit,n,times);
}

function solution2(n, l, r) {
  let result = 0;
  let memo = new Array(r - l + 1).fill().map((_, idx) => idx + l);
  
  if (n === 1) {
      return memo.filter(el => el !== 3).length;
  }

  while(memo.length) {
    const newMemo = [];
      
    for (const el of memo) {
      if (el === 1) result += 1;
      else {
        if (!!((el + 2) % 5)) {
          const fixedEl = Math.ceil(el / 5);
          newMemo.push(fixedEl);
        }
      }
    }

    memo = newMemo;
  }
  
  return result;    
}
