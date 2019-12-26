import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {

    println("How many Euros are you exchanging? ")
    val euros = inputDouble().toInt()

    println("What is the exchange rate? ")
    val rate = inputDouble()

//    val dollars = Math.ceil((euros * (rate / 100)) * 100.0) / 100.0
    val dollars = (euros * (rate / 100)).toBigDecimal().setScale(2, BigDecimal.ROUND_UP)
    println("$euros Euros at an exchange rate of $rate is $dollars dollars")

}

private fun inputDouble(): Double {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNextDouble()) {
        sc.next()
        println("It's not a number, Please again.")
    }
    return sc.nextDouble()
}