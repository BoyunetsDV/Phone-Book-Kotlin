import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    println("${str.last()}${str.substring(1, str.lastIndex)}${str.first()}")
}