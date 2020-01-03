import java.lang.Math.round
import java.util.*

fun main(args: Array<String>) {

    println("What is the order amount? ")
    val amount = inputDouble()

    println("What is the state? ")
    val state = getStateValue(inputString())

    println("The subtotal is $$amount")

    val tax = amount * state
    println("The tax is $$tax")

    val total = round((amount + tax) * 100) / 100
    println("The total is $$total")

}

private fun inputDouble(): Double {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNextDouble()) {
        sc.next()
        println("It's not a number, Please again.")
    }
    return sc.nextDouble()
}

private fun inputString(): String {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNext()) {
        sc.next()
        println("It's not a String, Please again.")
    }
    return sc.next()
}

private fun getStateValue(state: String): Double {
    if (state.equals(State.WI.name, true)) {
        return State.WI.value
    } else if (state.equals(State.MN.name, true)) {
        return State.MN.value
    }

    return 0.0
}

enum class State(val value: Double) {
    WI(0.055), MN( 0.055)
}