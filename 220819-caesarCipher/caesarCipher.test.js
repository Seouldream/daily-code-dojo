import { caesarCipher } from './caesarCipher';

test('caecarCipher', () => {
  expect(caesarCipher('AB', 1)).toBe('BC');
  expect(caesarCipher('CD', 1)).toBe('DE');
  expect(caesarCipher('Z', 1)).toBe('A');
  expect(caesarCipher('z', 1)).toBe('a');
});
