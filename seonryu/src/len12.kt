import java.util.*

fun main(args: Array<String>) {

    println("Enter the principal: ")
    val p = inputDouble().toLong()

    println("Enter the rate of interest: ")
    val r = inputDouble()

    println("Enter the number of years: ")
    val t = inputDouble()

    val result = calculateSimpleInterest(p, r, t)
    println("After $t years at $r%, the investment will be worth $result")
}

fun calculateSimpleInterest(principal: Long, rate: Double, year: Double): Double {
    return principal * (1 + ((rate / 100) * year))
}

private fun inputDouble(): Double {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNextDouble()) {
        sc.next()
        println("It's not a number, Please again.")
    }
    return sc.nextDouble()
}