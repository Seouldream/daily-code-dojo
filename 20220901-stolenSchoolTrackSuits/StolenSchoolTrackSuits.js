/* eslint-disable no-use-before-define */
/* eslint-disable no-param-reassign */
/* eslint-disable no-unused-vars */
/* eslint-disable import/prefer-default-export */
// reserve와 동일값 삭제
// 작은 숫자인사람빌려주기
// 큰 숫자 인사람 나머지 빌려주기
// 이제 구하자
// 총 n 명 - 잃어버린 수 + (리저브 - 내가 구한 리저브 (즉 아무도 입지못한 여분 리저브))
export function solution(n, lost, reserve) {
  const n2 = n;
  const lost2 = [...lost];
  const reserve2 = [...reserve];

  const answer1 = rentLowerNumberFirst(n, lost, reserve);

  const answer2 = rentHigherNumberFirst(n2, lost2, reserve2);

  let answer = 0;

  if (answer1 > answer2) {
    answer = answer1;
  }

  if (answer2 > answer1) {
    answer = answer2;
  }

  if (answer1 === answer2) {
    answer = answer1;
  }

  if (answer > n) {
    answer = n;
  }

  return answer;
}

export function removeMyNumber(lost, reserve) {
  lost.sort((a, b) => (a - b));
  reserve.sort((a, b) => (a - b));
  for (let i = 0; i < lost.length; i += 1) {
    if (reserve.includes(lost[i])) {
      const index = reserve.indexOf(lost[i]);
      if (index > -1) {
        reserve.splice(index, 1);
      }
      lost[i] = -1;
    }
  }
  return reserve;
}

export function rentUnder(lost, reserve) {
  lost.sort((a, b) => (a - b));
  reserve.sort((a, b) => a - b);
  for (let i = 0; i < lost.length; i += 1) {
    if (reserve.includes(lost[i])) {
      const index = reserve.indexOf(lost[i]);
      if (index > -1) {
        reserve.splice(index, 1);
      }
      lost[i] = -1;
    }
  }

  for (let i = 0; i < lost.length; i += 1) {
    if (reserve.includes(lost[i] - 1)) {
      const index = reserve.indexOf(lost[i] - 1);
      if (index > -1) {
        reserve.splice(index, 1);
      }
      lost[i] = -1;
    }
  }
  return reserve;
}

export function rentLowerNumberFirst(n, lost, reserve) {
  const lostNumber = lost.length;
  const originalReserve = reserve.length;

  lost.sort((a, b) => (a - b));
  reserve.sort((a, b) => a - b);

  for (let i = 0; i < lost.length; i += 1) {
    if (reserve.includes(lost[i])) {
      const index = reserve.indexOf(lost[i]);
      if (index > -1) {
        reserve.splice(index, 1);
      }
      lost[i] = -1;
    }
  }

  for (let i = 0; i < lost.length; i += 1) {
    if (reserve.includes(lost[i] - 1)) {
      const index = reserve.indexOf(lost[i] - 1);
      if (index > -1) {
        reserve.splice(index, 1);
      }
      lost[i] = -1;
    }
  }

  for (let i = 0; i < lost.length; i += 1) {
    if (reserve.includes(lost[i] + 1)) {
      const index = reserve.indexOf(lost[i] + 1);
      if (index > -1) {
        reserve.splice(index, 1);
      }
      lost[i] = -1;
    }
  }
  console.log(`reserve: ${reserve}`);

  const answer1 = n - lostNumber + (originalReserve - reserve.length);
  return answer1;
}

export function rentHigherNumberFirst(n2, lost2, reserve2) {
  const lostNumber2 = lost2.length;
  const originalReserve2 = reserve2.length;

  lost2.sort((a, b) => (a - b));
  reserve2.sort((a, b) => a - b);
  for (let i = 0; i < lost2.length; i += 1) {
    if (reserve2.includes(lost2[i])) {
      const index = reserve2.indexOf(lost2[i]);
      if (index > -1) {
        reserve2.splice(index, 1);
      }
      lost2[i] = -1;
    }
  }

  for (let i = 0; i < lost2.length; i += 1) {
    if (reserve2.includes(lost2[i] + 1)) {
      const index = reserve2.indexOf(lost2[i] + 1);
      if (index > -1) {
        reserve2.splice(index, 1);
      }
      lost2[i] = -1;
    }
  }

  for (let i = 0; i < lost2.length; i += 1) {
    if (reserve2.includes(lost2[i] - 1)) {
      const index = reserve2.indexOf(lost2[i] - 1);
      if (index > -1) {
        reserve2.splice(index, 1);
      }
      lost2[i] = -1;
    }
  }
  const answer2 = n2 - lostNumber2 + (originalReserve2 - reserve2.length);
  return answer2;
}
