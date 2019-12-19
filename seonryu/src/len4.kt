import java.io.BufferedReader
import java.util.*

fun main(args: Array<String>) {
    BufferedReader(System.`in`.reader())
    println("Enter a noun: ")
    val noun = readLine()

    println("Enter a verb: ")
    BufferedReader(System.`in`.reader())
    val verb = readLine()

    println("Enter an adjective: ")
    BufferedReader(System.`in`.reader())
    val adjective = readLine()

    println("Enter an adverb: ")
    BufferedReader(System.`in`.reader())
    val adverb = readLine()

    println("Do you $verb your $adjective $noun $adverb? That's hilarious!")

}