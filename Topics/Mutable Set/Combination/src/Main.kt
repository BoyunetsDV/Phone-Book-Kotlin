fun solution(setSource: Set<String>, arraySource: Array<String>): MutableSet<String> {
    val result = setSource.toMutableSet()
    result.addAll(arraySource.toSet())
    return result
}