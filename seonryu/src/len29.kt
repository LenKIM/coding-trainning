import java.util.*

fun main(args: Array<String>) {

    println("What is the rate of return? ")
    val rate = inputInt()

    val year = 72 / rate

    println("It will take $year years to double your initial investment.")
}
private fun inputInt(): Int {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNextInt()) {
        sc.next()
        println("Sorry. That's not a valid input")
    }
    return sc.nextInt()
}