import java.io.BufferedReader
import java.math.BigDecimal

fun main(args: Array<String>) {

    BufferedReader(System.`in`.reader())
    println("How many people?")
    val people: BigDecimal = readLine().toString().toBigDecimal()

    println("How many pizzas do you have?")
    val pizzas: BigDecimal = readLine().toString().toBigDecimal()

    println("How many pieces are in a pizza?")
    val pieces: BigDecimal = readLine().toString().toBigDecimal()

    println("$people people with $pizzas pizzas")

    val totalPieces: BigDecimal = pizzas * pieces
    val piecePerPerson: BigDecimal = totalPieces / people
    val leftover: BigDecimal = totalPieces % people

    println("Each person gets $piecePerPerson pieces of pizza.")
    println("There are $leftover leftover pieces.")

}