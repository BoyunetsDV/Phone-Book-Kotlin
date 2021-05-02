import java.math.BigInteger
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n1 = sc.nextBigInteger()
    val n2 = sc.nextBigInteger()
    val (divider, reminder) = n1.divideAndRemainder(n2)
    println("$n1 = $n2*$divider + $reminder")
}