import java.io.BufferedReader
import java.util.*

//fun main(args: Array<String>) {
//    println("What is the quote?")
//    val sc: Scanner = Scanner(System.`in`)
//    val quote = sc.nextLine()
//
//    println("Who said it?")
//    Scanner(System.`in`)
//    val name = sc.nextLine()
//
//    println("$name, \"$quote.\"")
//}

fun main(args: Array<String>) = with(BufferedReader(System.`in`.reader())) {
    println("What is the quote?")
    val quote = readLine()

    println("Who said it?")
    BufferedReader(System.`in`.reader())
    val name = readLine()

    val result = StringBuilder()
    result.append(name).append(" says, \"").append(quote).append(".\"")

    println("$result")
}