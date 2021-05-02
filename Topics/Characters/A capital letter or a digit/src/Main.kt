import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().first()
    print(a.isLetter() && a.isUpperCase() || a.isDigit() && a in '1'..'9')
}