import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    val d = b.pow(2.0) - 4.0 * a * c
    val x1 = (-b + sqrt(d)) / (2.0 * a)
    val x2 = (-b - sqrt(d)) / (2.0 * a)
    if (x1 > x2) {
        println("$x2 $x1")
    } else {
        println("$x1 $x2")
    }
}