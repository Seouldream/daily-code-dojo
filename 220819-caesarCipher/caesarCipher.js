/* eslint-disable import/prefer-default-export */
// A라는 것이 있다 -> 1칸 이동을 어떻게 표현할 것인가?
// A라는것의 위치를 먼저 파악
// 본래 위치를 기준으로 + n 을 주어서 다른 좌표로 이동
export function caesarCipher(string, n) {
  return string.split('').map((value) => {
    if (value === ' ') { return value; }
    return value.charAt().charCodeAt() + n > 90
      ? String.fromCharCode(value.charAt().charCodeAt() + n - 26)
      : String.fromCharCode(value.charAt().charCodeAt() + n);
  })
    .join('');
}
