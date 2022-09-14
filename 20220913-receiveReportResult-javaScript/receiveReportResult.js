/* eslint-disable no-param-reassign */
/* eslint-disable no-unused-vars */
/* eslint-disable camelcase */
// 신고한 사람은 신고받은사람이 k 번 이상 (중복신고제외) 신고받았을시 알람을 1회 받아야함
// 1. 신고받은 사람을 구해서 k번 이상 신고받았는지 검사한다.
// 2. k번 이상 신고받은 사람을 신고한 사람을 구한다.
// 3. 그 사람에게 카운트 1씩 올려준다.
function solution(id_list, report, k) {
  report = [...new Set(report)];

  const reported = report.map((element) => element.split(' ')[1]);
  const reportedFinal = [];
  const count = new Array(id_list.length).fill(0);

  reported.forEach((element) => {
    count[id_list.indexOf(element)] += 1;
  });

  count.forEach((element, i) => {
    if (element >= k) {
      reportedFinal.push(id_list[i]);
    }
  });

  count.fill(0);
  report.forEach((element) => {
    element = element.split(' ');
    if (reportedFinal.includes(element[1])) {
      count[id_list.indexOf(element[0])] += 1;
    }
  });
  return count;
}

// eslint-disable-next-line import/prefer-default-export
export function noDuplicateReports(report) {
  const set = new Set(report);
  const reportsWithoutDuplication = Array.from(set);
  return reportsWithoutDuplication;
}
// 각각 사람들 id list 별로 정렬하고  {'이름', '이름'}
