import java.util.*

fun main(args: Array<String>) {

    println("Resting Pulse: ")
    val restingHR = inputInt()

    println("Age: ")
    val age = inputInt()
    println("Intensity  |   Rate")
    println("-----------|----------")
    for(intensity in 55..95) {
        val targetHeartRate = (((220-age) - restingHR) * intensity) + restingHR
        println("$intensity%        |   $targetHeartRate bpm")
    }
}

private fun inputInt(): Int {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNextInt()) {
        sc.next()
        println("Sorry. That's not a valid input")
    }
    return sc.nextInt()
}