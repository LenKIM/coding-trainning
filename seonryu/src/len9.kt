import java.io.BufferedReader
import java.math.BigDecimal

fun main(args: Array<String>) {

    BufferedReader(System.`in`.reader())

    println("What is the width(m) of the ceiling?")
    val width: BigDecimal = readLine().toString().toBigDecimal()

    println("What is the height(m) of the ceiling?")
    val height: BigDecimal = readLine().toString().toBigDecimal()

    val area: BigDecimal = width*height
    val needPaint: BigDecimal = area.divide(9.toBigDecimal(), 0, BigDecimal.ROUND_UP)

    println("You will need to purchase $needPaint liters of")
    println("paint to cover $area square meters.")

}