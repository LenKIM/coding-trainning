import java.io.BufferedReader

//fun main(args: Array<String>) {
//    println("What is the input string?")
//    val sc: Scanner = Scanner(System.`in`)
//    val name = sc.nextLine()
//    println("$name has ${name.length} characters")
//}

fun main(args: Array<String>) = with(BufferedReader(System.`in`.reader())) {
    println("What is the input string?")
    val name = readLine()
    println("$name has ${name.length} characters")
}