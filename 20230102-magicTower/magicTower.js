function solution(storey) {
  const arrStorey = [...String(storey)];
  let answer = 0;
  if (storey < 0) return answer = 0;

  for (let i = 0; i < arrStorey.length; i += 1) {
    const arrP = parseInt(arrStorey[i], 10);
    const arrP2 = parseInt(arrStorey[i + 1], 10);
    if (arrP < 5) answer += arrP;
    else if (arrP >= 5 && arrP2 >= 5) {
      answer += (10 - arrP);

      arrStorey[i + 1] = arrP2 + 1;
    } else if (arrP >= 6) {
      answer += (11 - arrP);
    } else answer += arrP;
  }

  return answer;
}
