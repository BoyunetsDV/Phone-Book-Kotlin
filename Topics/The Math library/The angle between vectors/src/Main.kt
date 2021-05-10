import kotlin.math.*

fun main() {
    val (a1: String, b1: String) = readLine()!!.split(' ')
    val (a2: String, b2: String) = readLine()!!.split(' ')

    val uv = a1.toDouble() * a2.toDouble() + b1.toDouble() * b2.toDouble()
    val ul = sqrt(a1.toDouble().pow(2) + b1.toDouble().pow(2))
    val vl = sqrt(a2.toDouble().pow(2) + b2.toDouble().pow(2))

    val res = uv / (ul * vl)

    println(floor(Math.toDegrees(acos(res))))
}