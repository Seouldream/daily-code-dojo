/* eslint-disable import/prefer-default-export */

export function solution(answers) {
  const answer = [];
  let score1 = 0;
  const array1 = [1, 2, 3, 4, 5];
  let score2 = 0;
  const array2 = [2, 1, 2, 3, 2, 4, 2, 5];
  let score3 = 0;
  const array3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];

  for (let i = 0; i < answers.length; i += 1) {
    if (answers[i] === array1[i % array1.length]) {
      score1 += 1;
    }
  }

  for (let i = 0; i < answers.length; i += 1) {
    if (answers[i] === array2[i % array2.length]) {
      score2 += 1;
    }
  }

  for (let i = 0; i < answers.length; i += 1) {
    if (answers[i] === array3[i % array3.length]) {
      score3 += 1;
    }
  }

  const highscore = Math.max(score1, Math.max(score2, score3));
  if (highscore === score1) {
    answer.push(1);
  }

  if (highscore === score2) {
    answer.push(2);
  }

  if (highscore === score3) {
    answer.push(3);
  }

  return answer;
}
