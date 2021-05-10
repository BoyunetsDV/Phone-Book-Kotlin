import kotlin.math.floor

fun main() {
    val n = readLine()!!.toDouble()
    println(floor(n * 10) % 10)
}