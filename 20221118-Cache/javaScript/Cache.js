// export function remove(array, value) {
//   const indexArray = [];
//   array.forEach((element, index) => (
//     element === value ? indexArray.push(index)
//       : indexArray.push(-1)
//   ));

//   array.splice(indexArray[0], 1);
// }

// export default function solution(cacheSize, cities) {
//   const count = [];
//   const container = [];
//   const unitedCities = cities.map((city) => (
//     city.toLowerCase()
//   ));

//   unitedCities.forEach((city) => {
//     if (cacheSize === 0) {
//       return count.push(5);
//     }
//     if (container.length < cacheSize) {
//       container.push(city);

//       return count.push(5);
//     }
//     if (container.length === cacheSize && container.includes(city)) {
//       remove(container, city);

//       container.push(city);

//       return count.push(1);
//     }
//     if (container.length === cacheSize && !container.includes(city)) {
//       container.splice(0, 1);
//       container.push(city);
//       return count.push(5);
//     }
//     return null;
//   });

//   const answer = count.reduce((sum, currentValue) => (sum + currentValue), 0);
//   return answer;
// }

export default function solution(cacheSize, cities) {
  const map = new Map();
  const cacheHit = (city, map) => {
    map.delete(city);
    map.set(city, city);
    return 1;
  };

  const cacheMiss = (city, map, size) => {
    if (size === 0) return 5;
    (map.size === size) && map.delete(map.keys().next().value);
    map.set(city, city);
    return 5;
  };

  const getTimeCache = (city, map, size) => (map.has(city.toLocaleLowerCase())
    ? cacheHit : cacheMiss)(city.toLocaleLowerCase(), map, size);

  return cities.map(
    (city) => getTimeCache(city.toLocaleLowerCase(), map, cacheSize),
  ).reduce((a, c) => a + c, 0);
}
