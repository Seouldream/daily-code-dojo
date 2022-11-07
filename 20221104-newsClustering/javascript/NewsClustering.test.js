import solution, { convertToCapitalLetterAndArray } from './NewsClustering';

test('convertToArray', () => {
  expect(convertToCapitalLetterAndArray('FRANCE')).toStrictEqual(
    ['FR', 'RA', 'AN', 'NC', 'CE'],
  );
});
