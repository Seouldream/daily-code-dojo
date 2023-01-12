// 이해
// 파기해야할 개인정보의 번호를 오름차순으로 1차원 정수 배열에 담아 return
// 1. 개인정보들을 날짜와 약관 종류로 분류해낸다.
// 2.
// 개인정보에 적힌 유효날짜에서 약관만큼의 기간을 더한 값을 구한다.
// 오늘이 더한 기간보다  작은지 판단한다.
// 같거나 크다 ? 무시
// 작다 ? 파기

export function compareDays(today, day, date) {
  const todayArray = today.split('.');
  const [y, m, d] = todayArray;
  const dayArray = day.split('.');
  const [y1, m1, d1] = dayArray;

  const yearGap = parseInt(y, 10) - parseInt(y1, 10);

  const monthGap = parseInt(m, 10) - parseInt(m1, 10);

  const dayGap = parseInt(d, 10) - parseInt(d1, 10);
  const expiryDate = parseInt(date, 10);
  const result = (yearGap * 12 + monthGap - expiryDate) * 28 + dayGap;

  return result;
}

export function solution(today, terms, privacies) {
  const answer = [];
  for (let i = 0; i < privacies.length; i += 1) {
    const day = privacies[i].substring(0, 10);

    const termsType = privacies[i].substring(11, 12);

    const expiryDate = terms.find((term) => (
      term.substring(0, 1) === termsType
    )).substring(2);
    console.log(compareDays(today, day, expiryDate));
    if (compareDays(today, day, expiryDate) >= 0) {
      answer.push(i + 1);
    }
  }
  console.log(answer);
  return answer;
}
