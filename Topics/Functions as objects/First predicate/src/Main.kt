var counter: () -> Int = { -42 }

fun reinitializeCounter(): Int {
    var value = 0
    counter = { ++value }
    return value
}