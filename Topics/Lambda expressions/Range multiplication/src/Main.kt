val lambda: (Long, Long) -> Long = { leftBorder: Long, rightBorder: Long ->
    var result: Long = 1
    for (i in leftBorder..rightBorder) {
        result *= i
    }
    result
}