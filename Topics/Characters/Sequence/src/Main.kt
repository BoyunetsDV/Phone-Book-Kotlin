import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().first()
    val b = scanner.next().first()
    val c = scanner.next().first()
    print(a + 2 == b + 1 && b + 1 == c)
}