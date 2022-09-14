import { noDuplicateReports, reportedListMoreThanK } from './receiveReportResult';

// eslint-disable-next-line no-unused-expressions
test('noDuplicateReports', () => {
  expect(noDuplicateReports(['ryan con', 'ryan con', 'ryan con', 'ryan con']))
    .toStrictEqual(['ryan con']);
});

test('reportedMoreThanK', () => {
  expect(reportedListMoreThanK(['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi']))
    .toStrictEqual(['frodo', 'neo']);
});
//   ['muzi', 'frodo', 'apeach', 'neo']
//   ;
// 2
//   [2, 1, 1, 0];
