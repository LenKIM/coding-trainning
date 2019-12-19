import java.io.BufferedReader
import java.util.*

fun main(args: Array<String>) {

    var number1: Int = -1
    var number2: Int = -1
    BufferedReader(System.`in`.reader())
    println("What is the first number? ")
//    val number1 = convertToInt(readLine().toString())

    try {
        number1 = convertToInt(readLine().toString())
        if(number1 < 0) exit()
    } catch (e: Exception) {
        exit()
    }

    println("What is the second number? ")
    BufferedReader(System.`in`.reader())
//    val number2 = convertToInt(readLine().toString())
    try {
        number2 = convertToInt(readLine().toString())
        if(number2 < 0) exit()
    } catch (e: Exception) {
        exit()
    }

    println("$number1 + $number2 = ${number1+number2}")
    println("$number1 - $number2 = ${number1-number2}")
    println("$number1 * $number2 = ${number1*number2}")
    println("$number1 / $number2 = ${number1/number2}")
}

@Throws(NumberFormatException::class)
fun convertToInt(data: String): Int{
    return data.toInt()
}

fun exit() {
    println("유효한 숫자가 아닙니다. 프로그램을 종료합니다.")
    System.exit(0)
}