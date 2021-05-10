import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val startingAmount = readLine()!!.toBigDecimal()
    val interestRate = readLine()!!.toBigDecimal()
    val years = readLine()!!.toInt()
    val result = (startingAmount * (BigDecimal.ONE + interestRate.divide(100.toBigDecimal())).pow(years))
        .setScale(2, RoundingMode.CEILING)
    println("Amount of money in the account: $result")
}