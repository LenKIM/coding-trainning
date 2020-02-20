import java.util.*

fun main(args: Array<String>) {
    val datas = listOf("Yes", "No", "Maybe", "Ask again later")

    println("What's your question?")
    inputString()

    val random = Random().nextInt((datas.size))
    println("${datas[random]}")

}

private fun inputString(): String {
    val sc: Scanner = Scanner (System.`in`.reader())
    while(!sc.hasNext()) {
        sc.next()
        println("It's not a String, Please again.")
    }
    return sc.next()
}