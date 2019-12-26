import java.io.BufferedReader
import java.math.BigDecimal

const val FEET_TO_METERS_CONSTANT = (10.76391)

fun main(args: Array<String>) {

    BufferedReader(System.`in`.reader())
    println("What is the length of the room in feet?")
    val length: BigDecimal = readLine().toString().toBigDecimal()

    println("What is the width of the room in feet?")
    val width: BigDecimal = readLine().toString().toBigDecimal()
    val area: BigDecimal = (length*width).setScale(4, BigDecimal.ROUND_HALF_UP)
    val meters: BigDecimal = (area / FEET_TO_METERS_CONSTANT.toBigDecimal()).setScale(3, BigDecimal.ROUND_HALF_UP)

    println("You entered dimensions of $length feet by $width feet")

    println("The area is")
    println("${area.longValueExact()} square feet")
    println("$meters square meters")

}