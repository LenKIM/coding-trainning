import java.util.*

fun main(args: Array<String>) {

    print("What is the your age? ")
    val inputPw = inputDouble().toInt()

    if (validate(inputPw)) {
        println("You are old enough to legally drive.")
    } else {
        println("You are not old enough to legally drive.")
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

private fun validate(age: Int) = age > 16
