import java.util.*

const val MAN = "m"
const val WOMAN = "w"

fun main(args: Array<String>) {

    println("What is your a? ")
    val alcohol = inputDouble()

    println("What is your weight? ")
    val weight = inputDouble()

    println("What is your gender?(MAN: m, WOMAN: w) ")
    val gender = inputString()
    var r = 0.0
    if (MAN.equals(gender, true)) {
        r = 0.73
    } else if (MAN.equals(WOMAN, true)) {
        r = 0.6
    }

    println("How long have you been drinking?(hour) ")
    val h = inputDouble()

    val bac = (alcohol * 5.14 / weight * r) - (0.015 * h)
    println("You BAC is $bac")

    if (bac < 0.08) {
        println("It is not legal for you to drive")
    } else {
        println("Driving is legal.")
    }

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