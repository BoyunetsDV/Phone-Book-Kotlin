fun solution(elements: Set<String>, element: String): MutableSet<String> {
    val result = elements.toMutableSet()
    result.remove(element)
    return result
}