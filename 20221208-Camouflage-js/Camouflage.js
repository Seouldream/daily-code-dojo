// 2차원 배열 옷이름과 옷 종류
// 각 종류는 하나씩만 가능
// 최소 하나는 입어야함
// 즉 경우의 수 = 서로 다른 종류의 옷들의 총 갯수 + 1의 곱 빼기 1과 같다.
// 3(종류 갯수 + 1(입지 않은 경우도 포함)) * 2 ( 종류 갯수 + 1 (입지 않은 경우)) - 1 (아무것도 입지 않은 경우) = 5

// 풀이
// 필요한 것
// 옷의 종류 배열
// 각 종류에 해당하는 옷의 갯수

export function getKindsOfClothes(clothes) {
  const clothesType = clothes.map((cloth) => (
    cloth[1]
  ));

  const set = new Set(clothesType);

  return [...set];
}

export function getNumbersOfSpecificClothesTypes(clothes, clothesType) {
  const numbersOfClothesTypes = Array(clothesType.length).fill(0);

  clothesType.forEach((clothType, index) => {
    numbersOfClothesTypes[index] = clothes.filter((cloth) => (cloth[1] === clothType)).length;
  });

  return numbersOfClothesTypes;
}

export default function solution(clothes) {
  const clothesType = getKindsOfClothes(clothes);

  const numbersOfClothesTypes = getNumbersOfSpecificClothesTypes(clothes, clothesType);

  const answerN = numbersOfClothesTypes.reduce((acc, currentValue) => acc * (currentValue + 1), 1);
  const answer = answerN - 1;
  return answer;
}
