fun evenFilter(numbers: Set<Int>): Set<Int> {
  return numbers.filter { it % 2 == 0 }.toSet()
}