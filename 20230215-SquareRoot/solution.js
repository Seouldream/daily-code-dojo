function solution (n) {
  const s = Math.sqrt(n)
  const r = Math.round(s)

  if (r ** 2 === n) {
    return (r + 1) ** 2
  }

  return -1
}
