import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    println("What is your name?")
    val br = BufferedReader(InputStreamReader(System.`in`))
    val name = br.readLine()
    val result = "Hello, $name, nice to meet you"
    println(result)
}
