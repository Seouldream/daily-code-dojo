// 이해
// 1.  노란격자를 브라운이 1줄로 감싸고 있음
// 2. 노란격자 수와 브라운 격자 수가 주어짐
// 3. 노란격자는 항상 가로롤 넓음
// 풀이
// 1. 브라운 갯수 = (노란색의 세로길이 + 2)* 2 + (노란색의 가로길이) * 2
// 2. 노랑이 가로 + 2 + 가로길이 노랑이 세로 + 2

export default function solution(s) {
  // if (s.length % 2 !== 0) return 0;
  const stack = [];

  [...s].forEach((element) => {
    console.log('s', [...s]);

    if (stack[stack.length - 1] === element) {
      stack.pop();
      console.log('stackPop', stack);
      return;
    }
    if (stack[stack.length - 1] !== element) {
      stack.push(element);
      console.log('stackPush', stack);
    }
  });

  // for (let i = 0; i < s.length; i++) {
  //   const b = s.charAt(i);
  //   if (stack[stack.length - 1] === b) {
  //     stack.pop();
  //     console.log('stackPop', stack);
  //   } else {
  //     stack.push(b);
  //     console.log('stackPush', stack);
  //   }
  // }
  // console.log('finalStack1',stack);
  return stack.length > 0 ? 0 : 1;
}
