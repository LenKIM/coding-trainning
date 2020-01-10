import java.util.*

fun main(args: Array<String>) {

    println("What is your weight? ")
    val weight = inputDouble()
    println("What is your height? ")
    val height = inputDouble()

    val bmi = (weight / (height * height)) * 703
    println("You BMI is $bmi")

    if (bmi in 18.5..25.0) {
        println("You are within int ideal weight range.")
    } else {
        println("You are overweight. You should see your doctor.")
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