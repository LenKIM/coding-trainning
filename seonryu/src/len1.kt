import java.io.BufferedReader
import java.util.*

//fun main(args: Array<String>) {
//    println("What is your name?")
//    val sc: Scanner = Scanner(System.`in`)
//    val name = sc.nextLine()
//    println("Hello, $name, nice to meet you!")
//}

//fun main(args: Array<String>) = with(Scanner(System.`in`)) {
//    println("What is your name?")
//    println("Hello, " + nextLine() + ", nice to meet you!")
//}

fun main(args: Array<String>) = with(BufferedReader(System.`in`.reader())) {
    println("What is your name?")
    println("Hello, " + readLine() + ", nice to meet you!")
}