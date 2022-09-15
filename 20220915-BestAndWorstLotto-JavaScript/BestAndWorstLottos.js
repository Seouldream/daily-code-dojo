// 내 것과 당첨 표  일치번호 갯수구하기
// 0번호 갯수에 따른 최대 최소 구기
export function solution(lottos, winNums) {
  const rightNumbers = getRightNumbers(lottos, winNums);
  const zeroNumbers = getZeroNumbers(lottos);

  const maxRank = getMaxRank(rightNumbers, zeroNumbers);
  const minRank = getMinRank(rightNumbers);
  const answer = [maxRank, minRank];
  return answer;
}

export function getRightNumbers(lottos, winNums) {
  const rightNumbers = lottos.filter((lottosNumber) => winNums.includes(lottosNumber));
  return rightNumbers.length;
}

export function getZeroNumbers(lottos) {
  const zeroNumbers = lottos.filter((lottosNumber) => lottosNumber === 0);
  return zeroNumbers.length;
}

export function getMaxRank(rightNumbers, zeroNumbers) {
  const totalRights = rightNumbers + zeroNumbers;

  let rank = 0;
  let maxRank = 0;
  for (let i = 6; i >= 1; i -= 1) {
    rank += 1;
    if (totalRights === i) {
      maxRank = rank;
    }
    if (totalRights === 0) {
      maxRank = 6;
    }
  }

  return maxRank;
}

export function getMinRank(rightNumbers) {
  const totalRights = rightNumbers;

  let rank = 0;
  let minRank = 0;
  for (let i = 6; i >= 1; i -= 1) {
    rank += 1;
    if (totalRights === i) {
      minRank = rank;
    }
    if (totalRights === 0) {
      minRank = 6;
    }
  }

  return minRank;
}
