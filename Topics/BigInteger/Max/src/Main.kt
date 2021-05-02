import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextBigInteger()
    val b = sc.nextBigInteger()
    println((a.plus(b).plus((a.minus(b)).abs())).divide(2.toBigInteger()))
}